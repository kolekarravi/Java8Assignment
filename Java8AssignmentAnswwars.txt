package com.java.yash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment3 {

	public static void main(String[] args) {
		
	
	List<Employee> empList=new ArrayList<Employee>();
     
	 empList.add(new Employee(101, "Amit", 12000,50));
     empList.add(new Employee(102, "Naman", 35000,60));
     empList.add(new Employee(103, "Shubham", 40000,50));
     empList.add(new Employee(104, "priya", 55000,60));
     empList.add(new Employee(105, "Raj", 10000,70));
     empList.add(new Employee(105, "Mohan", 14000,80));
     empList.add(new Employee(105, "Raj", 14000,90));


 	List<PriceClass> price=new ArrayList<PriceClass>();
 	price.add(new PriceClass("Samsung", 1000));
 	price.add(new PriceClass("nokia", 2000));
 	price.add(new PriceClass("Redmi", 457));
 	price.add(new PriceClass("motorolla", 678));

     
     
   //Question 1
 	//WAP to find out average marks from the list of the marks,
      
 	OptionalDouble avg = empList.stream()
              .mapToInt((x) -> x.mark)
              .average();
     
   System.out.println("average of mark list:-"+avg);

   //Question 1
   
 //Q1
   System.out.println("Question No 1");

   List<Mark> mark=new ArrayList<>();
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter input no.");
   int n=scan.nextInt();

   for(int i=0;i<n;i++) {
       System.out.println("Enter a Mark "+(i+1)+" Subject");
        mark.add(new Mark(scan.nextInt()));
   }

   Double value= mark.stream().mapToDouble(x->x.getMark()).average().orElse(0);
   System.out.println("Average mark is "+value);
   
     
   //Question No-2
    //WAP to print distinct marks from the list of given marks
   System.out.println("Question No 2");

     List<Integer> filSalList1= empList.stream().map(i-> i.mark).sorted().distinct().collect(Collectors.toList());
     System.out.println(filSalList1);
     
  
     //Question No-3
    // WAP to take name of employee, sort all employee name using stream and print only unique name from it.
     System.out.println("Question No 3");

      List<String> filSalList= empList.stream().map(i-> i.empName).sorted().distinct().collect(Collectors.toList());
      System.out.println(filSalList);
    
    
      //Question 4
      //maximum from array  find using stream
      System.out.println("Question No 4");

      List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4,67,59);
      
      System.out.print("The maximum value is : ");

      Integer var = list.stream().max(Integer::compare).get();

      System.out.println(var);
  
      
      //Q5 find maximum length string using streams 
      System.out.println("Question No 5");

      List<String> list1 = Arrays.asList("ravindra");

      OptionalInt maxOpt  = list1.stream()
              //.map(i-> i)
              .mapToInt(String::length)
              .max();
      System.out.println("maximun length:-"+maxOpt);
	
      //Q6 WAP to create list of item price whose price is less than avg price of all item.
      
      System.out.println("Question No 6");
      Double value1=price.stream().collect(Collectors.averagingDouble(PriceClass::getPrice));
      System.out.println(value1);        
      price.stream().filter(v->v.getPrice()<value1).forEach(System.out::println);
      
      //Q7 WAP to print only those price which are even from the given item list.
      System.out.println("Question No 7");

        /*List<PriceClass> price1= price.stream().
    	filter(i -> i.price % 2 == 0).map(i-> i).collect(Collectors.toList());
       
        price1.stream().forEach(e -> System.out.println(e.price));
        */
        price.stream().filter(v->v.getPrice()%2==0).forEach(System.out::println);
        
        
	  //Q8 implement predicate interface find even no
        System.out.println("Question No 8");

        Predicate<Integer> predicate = (t) -> {
    	  if(t % 2 == 0) {
    	  return true;
    	   }else {
    		   return false;
    	   }
       };
       System.out.println(predicate.test(3));
       
     //Q9
       // WAP to implement predicate to check given list of array contain how many even and odd nos.
       System.out.println("Question No 9");

       List<Integer> nums =  Arrays.asList(2,3,5,6,7,8);
       Predicate<Integer> even = (x) -> x % 2 == 0;
       Predicate<Integer> odd = (x) -> x % 2 != 0;
       
       System.out.println("Even Number");
        nums.stream().filter(even).collect(Collectors.toList())
       .forEach(System.out::println);
       System.out.println("odd number");
       nums.stream().filter(odd).collect(Collectors.toList())
       .forEach(System.out::println);
       
       
       //Q11
       //wap to perform parallel stream api to find the no.
       System.out.println("Question No 11");

       List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
       System.out.println("prallel Strem below Output data");
       listOfNumbers.parallelStream().forEach(number ->
       System.out.println(number + " " + Thread.currentThread().getName())
       );
       
       //Q12
       System.out.println("Question No 12");

       List<Integer> ints = Stream.of(1,2,4,34,5).collect(Collectors.toList());
       Integer maxInt = ints.stream()
                                 .max(Comparator.comparing(i -> i))
                                 .get();

       System.out.println("Maximum number in the set is " + maxInt);
       
      
       
       
       
      
}
}

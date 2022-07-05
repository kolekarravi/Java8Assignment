package com.java.yash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AvgMark {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		int n,result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many numbers to cal  avg");
		n= sc.nextInt();
		//int a[]=new int[n];
		int[] a = new int[n]; 
		//System.out.println("Array before conversion: "+ Arrays.toString(a)); 
		
		//List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4,67,59); 
		List<Integer> list = Arrays.asList(n); 

		OptionalDouble avg = list.stream()
	              .mapToInt((x) -> x)
	              .average();
	     
	      System.out.println("average of mark list:-"+avg);
	     */ 
	 
		
	   // reading the array size.
	        Scanner s = new Scanner(System.in);
	 
	        System.out.println("Enter array size: ");
	        int size = s.nextInt();
	        // create an array
	        int[] array = new int[size];
	 
	        // reading values from user keyboard
	        System.out.println("Enter array values :  ");
	        for (int i = 0; i < size; i++) {
	            int value = s.nextInt();
	            array[i] = value;
	 
	        }
	 
	        // getting array length
	        int length = array.length;
	 
	        // default sium value.
	        int sum = 0;
	 
	        // sum of all values in array using for loop
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	 
	        double average = sum / length;
	 
	        System.out.println("Average of array : " + average);
	 
	    
	}

	
}
 
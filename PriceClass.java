package com.java.yash;

public class PriceClass {

      String Product;
      int price;
	
      
      public PriceClass(String product, int price) {
		super();
		Product = product;
		this.price = price;
	}


	public String getProduct() {
		return Product;
	}


	public void setProduct(String product) {
		Product = product;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "PriceClass [Product=" + Product + ", price=" + price + "]";
	}
      
      
}

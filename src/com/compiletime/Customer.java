package com.compiletime;

public class Customer {
/*Compile time polymorphism is achieve
  with the help of Method overloading*/
 
	public static void main(String[] args) {
		Max m = new Max();
		m.purchase("Jeans", 1000);
		m.purchase("Jacket", "L");
		m.purchase(23);
		m.purchase("Shirt");
	}

}
/*
# Why do we call it as compile time polymorphism
 ->Method binding is happening during compile time
   that the reason we call is as compile time polymorphism
  */ 
/*
 #Method binding is a process of associating or 
 Mapping method caller to its method implementation
 
 */

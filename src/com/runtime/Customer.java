package com.runtime;

public class Customer {

	/*Binding the method declaration to method definition by the 
	  JVM at the run time based on the objects 
	  is called as run time Polymorphism*/

	public static void main(String[] args) {
		Bank b = new Kotak();
		b.rateOfIntrest();

		Bank b1 = new Paytm();
		b1.rateOfIntrest();

		/*
When u call an Overridden method on the super class ref.the method 
implementation which gets executed depended on the sub class acting upon it.
		 */
	}

}
//Since the binding is done during the execution it is called as late binding

/*Once the binding is done it can be changed at the Runtime and hence it is also called 
as dynamic Binding.

/*Run time polymorphism can be achieved with the help of 
1)Is A relationship
2)Method Overriding 
3)Upcasting
 */

//Method Overriding is the best example for Run time Polymorphism

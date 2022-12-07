package com.compiletime;

public class Max {
	void purchase(String productName) {
		System.out.println("ProductName");
	}
	void purchase(int productId) {
		System.out.println("ProductId");
	}
	void purchase(String productName,String size) {
		System.out.println(productName+" "+size);
	}
	void purchase(String productName,int cost) {
		System.out.println(productName+" "+cost);
	}
}
/*
->Binding the method declaration to method definition by the compiler at the compile 
time based on the arguments is called as compile time Polymorphism.

->Since the binding is done before the execution it is called as early binding

-> Once the binding is done it cannot be changed at the Runtime and hence it is also 
called as Static Binding

->Method Overloading is the best example for Compile time Polymorphism

*/
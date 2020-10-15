package com.feelandcode.java.oops.interview.question.thirtyfive;

/**
 * Question - Give an example of private, static and final method overloading
 * Class demonstrates how private, static and final methods are overloaded
 */
public class OverloadDemo {

	public static void show() {
     	 System.out.println("Static show method");
     }
    public static void show(String s) {
     	 System.out.println("Static show method – string parameter");
    }
    public final void display(double d, int i) {
     	 System.out.println("final display method- double, int parameter");
     }
    public final void display(int i, double d) {
     	 System.out.println("final display method – int, double parameter");
    }
    private void print(Integer i) {
     	 System.out.println("private print method- integer parameter");
     }
    private void print(int i) {
     	 System.out.println("private print method – int parameter");
    }

    public static void main(String[] args) {
    	//invoke static methods using classname
    	OverloadDemo.show();  
    	OverloadDemo.show("str"); 
    	//invoke final methods 
    	OverloadDemo demo= new OverloadDemo();  // create instance 
    	demo.display(2.5,7);
    	demo.display(25, 3.9);  
    	//invoke private methods 
    	demo.print(Integer.valueOf(5));  // call print(Integer i) 
    	demo.print(14);  // call print(int i) 
	}
}

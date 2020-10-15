package com.feelandcode.java.oops.interview.question.thirtythree;

/**
 * Question - Will the following code compile ?
 * Answer - Yes, it will compile
 * Note - Overloaded methods may have thrown different 	exceptions (checked or unchecked )
 */
public class OverloadDemo {

	public void show(int i, boolean b) {
     	 System.out.println("Show method- int, boolean parameters");
     }
    public void show(boolean b, int i) throws Exception {
     	 System.out.println("Show method – boolean, int parameter ");
    }
    public void show(Boolean b, Integer i) throws RuntimeException {
     	 System.out.println("Show method - boolean, integer parameter");
    }
    
    public static void main(String[] args) throws Exception{
    	OverloadDemo demo= new OverloadDemo();
    	demo.show(40, true);
    	// demo.show(Integer.valueOf(24), true);  -- it will compiler and call  show(int i, boolean b)
    	demo.show(false, 27);  
    	//demo.show(false,Integer.valueOf(3) ); // it will not compile and show error
    	demo.show(Boolean.valueOf(true), Integer.valueOf("30"));  
    	
	}

}

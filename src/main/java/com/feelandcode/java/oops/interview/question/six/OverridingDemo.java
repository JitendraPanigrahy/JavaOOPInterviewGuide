package com.feelandcode.java.oops.interview.question.six;
/**
 * Question - Static methods are overridden or not ? Give an example
 * Answer - No, static methods cannot be overridden, they are shadowed.Subclasss method shadows or hides it.
 * demo class shows static methods cannot be overridden, they are shadowed.
 * Reference variable type decides which version of static method to invoke, not the object referred to it.
 * Better way to access static method using the class name -
 * - as they belong to the class not the instance of the class.
 */
public class OverridingDemo {

	public static void main(String[] args) {
		Base base = new Derived();  //superclass reference variable refers to subclass object
        base.show();  //This will call super class static method show()
        Base.show(); //better way to call super class static method show(), using class name
        Derived derived= new Derived();  //create derived class object
        derived.show(); // call derived class static method show()
        Derived.show(); // better way to call derived class static method show()
	}

}

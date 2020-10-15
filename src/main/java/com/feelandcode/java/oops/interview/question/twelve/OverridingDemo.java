package com.feelandcode.java.oops.interview.question.twelve;

/**
 * Question - Will the following code compile ?
 * Answer - Yes, it will compile
 * Note - It is not the case of method overriding. In class Derived, it is overloading of inherited method show()
 */
public class OverridingDemo {

	public static void main(String[] args) {
		Base baseObj = new Base();  //create new base class object
        Base baseRef = new Derived();  //baseclass reference variable refers to subclass
        baseObj.show(5,'c');  //Invoke baseclass method show()
        baseRef.show(5, 'c');  ////Invoke baseclass method show()
        Derived derivedObj= new Derived();  //create derived class object
        derivedObj.show(5,'c'); // call base class method show()
        derivedObj.show('c',5); // call derived class method show()
	}

}

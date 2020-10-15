package com.feelandcode.java.oops.interview.question.seven.eight;
 /**
 * Question - Instance variable are overridden or not ? Give an example
 * Answer - No, instance variables are not overridden, they are shadowed. 
 * Instance variable in Subclass shadows or hides it.
 * Note - Reference variable type decides which version of instance variable to access -
 *        - not the object referred to it.
 *        The object being referred to decides which version of instance method to invoke -
 *        - and it is decided at runtime using dynamic method lookup. 
 *        But, in the case of static method it is decided at compile time only,
 *        as compiler knows that there is only one version of the method, 
 *        and dynamic method lookup is not necessary. 
 *        While accessing instance variable dynamic method lookup is not necessary.
 */
public class OverridingDemo {

	public static void main(String[] args) {
		// Employee reference variable refers to Manager class object
		Employee emp = new Manager();

		// Print employee (not manager) qualification only, as it is not overridden
		System.out.println(emp.basicQualification); // OUTPUT : Degree

		HRManager hrMgr = new HRManager(); // Create object of HRManager class

		// Cast to instance of Employee class. Print employee qualification
		System.out.println(((Employee) hrMgr).basicQualification); // OUTPUT : Degree

		// Cast to instance of Manager class. Print manager qualification
		System.out.println(((Manager) hrMgr).basicQualification); // OUTPUT : Degree, PMP

		// Print HRManager qualification
		System.out.println(hrMgr.basicQualification); // OUTPUT : Degree, PMP, MBA
		
		//Call HRManager class  show() method
        ((Employee)hrMgr).show();

       //Call HRManager version of  show() method
       ((Manager)hrMgr).show();

       //Call HRManager version of  show() method
       hrMgr.show();    

	}

}

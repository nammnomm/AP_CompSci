/*
 *	Author:Caleb Nam
 *  Date: 10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		System.out.println("Michael's annual salary is " + michael.getAnnualSalary()); 
		michael.raiseSalary(10);
		System.out.println("Michael's raised salary is " + michael.getSalary()); 

		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString(); 
		System.out.println("Dwight's annual salary is " + dwight.getAnnualSalary()); 
		dwight.raiseSalary(32);
		System.out.println("Dwight's raised salary is " + dwight.getSalary()); 

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString(); 
		System.out.println("Jim's annual salary is " + jim.getAnnualSalary()); 
		jim.raiseSalary(12);
		System.out.println("Jim's raised salary is " + jim.getSalary()); 

		Employee pam = new Employee(2474, "Pam", "Beesly", 2250.0);
		pam.employeeToString(); 
		System.out.println("Pam's annual salary is " + pam.getAnnualSalary()); 
		pam.raiseSalary(113);
		System.out.println("Pam's raised salary is " + pam.getSalary());
		
		Employee caleb = new Employee(11, "Caleb", "Nam", 100100.66);
		caleb.employeeToString();
		System.out.println("Caleb's annual salary is " + caleb.getAnnualSalary()); 
		caleb.raiseSalary(1003);
		System.out.println("Caleb's raised salary is " + caleb.getSalary()); 

	}
}

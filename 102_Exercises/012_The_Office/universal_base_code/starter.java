/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		raiseSalary michael = new raiseSalary(20);
		michael.employeeToString();
		michael.getAnnualSalary();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		raiseSalary michael = new raiseSalary(5);
		dwight.employeeToString();
		dwight.getAnnualSalary();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		raiseSalary michael = new raiseSalary(35);
		jim.employeeToString();
		jim.getAnnualSalary();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		raiseSalary michael = new raiseSalary(63);
		pam.employeeToString();
		pam.getAnnualSalary();
		
		Employee sebastion = new Employee(2009, "Sebastion", "Blunt", 2250);
		raiseSalary michael = new raiseSalary(500);
		sebastion.employeeToString();
		sebastion.getAnnualSalary();
	}
}

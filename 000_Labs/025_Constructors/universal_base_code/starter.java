/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		myCharacter char1 = new myCharacter();
		System.out.print("Enter the role you would like (Warrior, Wizard, or Rogue): ");
		String r = sc.nextLine();
		System.out.print("\n");
		myCharacter char2 = new myCharacter(r);
		System.out.println(char1.role);
		System.out.println(char2.role);


		
	}
}

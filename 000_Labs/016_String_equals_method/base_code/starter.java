/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose a class (Mage, Warrior, or Rogue): ");
		String cl = sc.nextLine();
		if(cl.equals("Rogue") || cl.equals("rogue")){
			System.out.print("You are playing as a Rogue.");
		}
		if(cl.equals("Warrior") || cl.equals("warrior")){
			System.out.print("You are playing as a Warrior.");
		}
		if(cl.equals("Mage") || cl.equals("mage")){
			System.out.print("You are playing as a Mage.");
		}
	}
}
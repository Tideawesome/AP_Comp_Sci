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
		int stat_points = 20;
		int sp = 0;
		int dp = 0;
		int ip = 0;
		int chp = 0;
		System.out.print("What is your character's name?: ");
		String name = sc.nextLine();
		System.out.print("What is your character title?: ");
		String title = sc.nextLine();
		System.out.print("Choose a class (Mage, Warrior, or Rogue): ");
		String cl = sc.nextLine();
		if(cl.equals("Rogue") || cl.equals("rogue")){
			System.out.println("You are playing as a Rogue.");
		}
		else if(cl.equals("Warrior") || cl.equals("warrior")){
			System.out.println("You are playing as a Warrior.");
		}
		else if(cl.equals("Mage") || cl.equals("mage")){
			System.out.println("You are playing as a Mage.");
		}
		else{
			System.out.print("Invalid class... Please restart character creation.");
			return;
		}
		System.out.print("\n");
		System.out.println("Stats: " + "\n" + "Strength - Buff and able to carry larger items" + "\n" + "Dexterity - Agile and moves quickly" + "\n" + "Intelligence - Better at magic spells" + "\n" + "Charisma - How personable" + "\n\n" + "Allocate your stat points: ");
		while(stat_points > 0){
			System.out.println("Stat Points Remaining: " + stat_points);
			System.out.print("How many points would you like in Strength?: ");
			sp = sc.nextInt();
			System.out.print("\n");
			if(sp>stat_points){
				System.out.print("Sorry, you do not have that many points left... Please restart character creation.");
				return;
			}
			stat_points = stat_points - sp;
			System.out.println("Stat Points Remaining: " + stat_points);
			System.out.print("How many points would you like in Dexterity?: ");
			dp = sc.nextInt();
			System.out.print("\n");
			if(dp>stat_points){
				System.out.print("Sorry, you do not have that many points left... Please restart character creation.");
				return;
			}
			stat_points = stat_points - dp;
			System.out.println("Stat Points Remaining: " + stat_points);
			System.out.print("How many points would you like in Intelligence?: ");
			ip = sc.nextInt();
			System.out.print("\n");
			if(ip>stat_points){
				System.out.print("Sorry, you do not have that many points left... Please restart character creation.");
				return;
			}
			stat_points = stat_points - ip;
			System.out.println("Stat Points Remaining: " + stat_points);
			System.out.print("How many points would you like in Charisma?: ");
			chp = sc.nextInt();
			System.out.print("\n");
			if(chp>stat_points){
				System.out.print("Sorry, you do not have that many points left... Please restart character creation.");
				return;
			}
			stat_points = stat_points - chp;
		}
		System.out.print("\n\n\n\n\n\n\n\n");
		System.out.print("Name: " + name + "\n" + "Title: " + title + "\n" + "Class: " + cl + "\n\n" + "Strength: " + sp + "\n" + "Dexterity: " + dp + "\n" + "Intelligence: " + ip + "\n" + "Charisma: " + chp);
	}
}

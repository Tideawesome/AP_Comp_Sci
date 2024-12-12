/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What day is it? (Enter 0 or 6 if it is Sunday or Saturday; Enter 1, 2, 3, 4, 5 if it is a Monday, Tuesday, Wednesday, Thursday, or Friday): ");
		int week = sc.nextInt();
		
		if(week==0||week==6){
			System.out.print("Wake up at 10:00 am.");
		}
		else if(week==1||week==2||week==3||week==4||week==5){
			System.out.print("Wake up at 7:00 am.");
		}
		else{
			System.out.print("You did not enter a valid number. :( ");
		}
	}
}

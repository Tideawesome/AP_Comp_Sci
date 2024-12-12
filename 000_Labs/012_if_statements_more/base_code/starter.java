/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a integer: ");
		int x = sc.nextInt();
		System.out.print("\n");
		System.out.print("Type another integer: ");
		int y = sc.nextInt();
		System.out.print("\n");
		if(x==y){
			System.out.println("Your integers are the same.");
		}
		if(x!=y){
			System.out.println("Your integers are different.");
		}
	}
}

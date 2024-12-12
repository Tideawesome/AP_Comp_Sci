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
		System.out.print("Give me an integer: ");
		int start = sc.nextInt();
		System.out.print("Give me a larger integer: ");
		int end = sc.nextInt();
		int num1 = (int) (Math.random()*(end-start)) + start;
		int num2 = (int) (Math.random()*(end-start)) + start;
		int num3 = (int) (Math.random()*(end-start)) + start;
		int num4 = (int) (Math.random()*(end-start)) + start;
		int num5 = (int) (Math.random()*(end-start)) + start;
		System.out.print(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	}
}

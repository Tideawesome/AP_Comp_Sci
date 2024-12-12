/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("\n");
		System.out.print("Please enter another number: ");
		int num2 = sc.nextInt();
		System.out.print("\n");
		if(num1%2==0 && num1!=0){
			System.out.println(num1 + " is even.");
		}
		else if(num1 != 0){
			System.out.println(num1 + " is odd.");
		}
		else{
			System.out.println(num1 + " is zero.");
		}
		if(num2%2==0 && num2!=0){
			System.out.println(num2 + " is even.");
		}
		else if(num2 != 0){
			System.out.println(num2 + " is odd.");
		}
		else{
			System.out.println(num2 + " is zero.");
		}
		if(num1%3==0){
			System.out.println(num1 + " is divisible by 3.");
		}
		if(num1%4==0){
			System.out.println(num1 + " is divisible by 4.");
		}
		if(num1%5==0){
			System.out.println(num1 + " is divisible by 5.");
		}
		if(num1%3!=0 && num1%4!=0 && num1%5!=0){
			System.out.println(num1 + " is not divisible by 3, 4, and 5.");
		}
		if(num2%3==0){
			System.out.println(num2 + " is divisible by 3.");
		}
		if(num2%4==0){
			System.out.println(num2 + " is divisible by 4.");
		}
		if(num2%5==0){
			System.out.println(num2 + " is divisible by 5.");
		}
		if(num2%3!=0 && num2%4!=0 && num2%5!=0){
			System.out.println(num2 + " is not divisible by 3, 4, and 5.");
		}
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	int secretnum = (int)(Math.random()*1000)+1;
	System.out.print("Please guess a random integer between 1 and 1000: ");
	int guess = sc.nextInt();
	System.out.print("\n");
	while(guess!=secretnum){
		System.out.print("Not correct!  Please guess again: ");
		guess = sc.nextInt();
		System.out.print("\n");
		if(guess==secretnum){
			break;
		}
	}
	System.out.print("Correct! You win!");
	}
}

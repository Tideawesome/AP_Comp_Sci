/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input;
		boolean prime;
		System.out.print("Enter an integer and all prime numbers below it will be printed: ");
		input = sc.nextInt();
		printPrimes(input);
	}
	public static boolean checkPrime(int input){
		int y = input - 1;
		boolean tf = false;
		if(input == 2){
			tf = true;
			return tf;
		}
		while(y>=2){
			if(input%y!=0){
				tf=true;
			}
			if(input%y==0){
				tf=false;
				break;
			}
			y--;
		}
		return tf;
	}
	public static void printPrimes(int input){
		boolean x;
		while(input>=2){
			x=checkPrime(input);
			if(x) System.out.print(input + " ");
			input--;
		}
		return;
	}
}
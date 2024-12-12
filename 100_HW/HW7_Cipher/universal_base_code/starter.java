/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to encode/decode a message with a key?(Y/N): ");
		String yn = sc.nextLine();
		System.out.print("\n");
		if(yn = "y" || yn = "Y" || yn = "yes" || yn = "Yes" || yn = "YES"){
			System.out.print("What message would you like to encode/decode?: ");
			String msg = sc.nextLine();
			System.out.print("\n");
			System.out.print("What is the key?(1-36): ");
			int key = sc.nextInt();
			if(key < 37 && key > 0){
				System.out.print("\n");
				System.outprintln(Cipher.keyedEncode(msg, key));
			}
			else{
				System.out.println("Invalid!");	
			}
		}
		else{
			System.out.print("What message would you like to encode/decode?: ");
			String msg = sc.nextLine();
			System.out.print("\n");
			System.out.println(Cipher.encode(key));
		}
	}
}

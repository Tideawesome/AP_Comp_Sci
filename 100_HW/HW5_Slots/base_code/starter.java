/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int balance = 100;
		System.out.print("Balance: " + balance);
		System.out.print("\n");
		while(balance>0){
			int earnings = 0;
			System.out.print("Do you want to play?(Yes/Y/yes/y or No/N/no/n): ");
			String yn = sc.nextLine();
			if(yn == "N" || yn == "n" || yn == "No" || yn == "no"){
				System.out.print("Balance: " + balance);
				break;
			}	
			else{
				System.out.print("How much would you like to wager?(Only positive integers): ");
				int wager = sc.nextInt();
				if(wager>balance){
					System.out.println("Sorry. We do not encourage going into debt.");
				}
				else{
					balance = balance - wager;
					if(wager<=0){
						System.out.print("Sorry. That was not a positive integer. Restart to play again.");
						break;
					}
					else{
						int a = (int)(Math.random()*9)+1;
						int b = (int)(Math.random()*9)+1;
						int c = (int)(Math.random()*9)+1;
						System.out.print("\n");
						System.out.println(a + "  " + b + "  " + c);
						if(a==b && b==c){
							earnings = wager*3;
							balance = balance + wager;
						}
						else if(a==b||b==c||c==a){
							earnings = wager*2;
							balance = balance + earnings;
						}
						System.out.println("Balance: " + balance);
						if(balance == 0){
							System.out.print("Sorry you are out of money. Better luck next time!");
						}
					}
				}
			}
		}
	}
}


/*
	Author:
	Date:
	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int x=3;
		if (x<=3){
			System.out.println(". ");
		}
		if (x>=3){
			System.out.println("7");
		}
		else if (x!=3){
			System.out.println("5");
		}
		else{
			System.out.print("o");
		}
	}
}

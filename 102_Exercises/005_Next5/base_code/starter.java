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
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		int numadd = num;
		System.out.println("Here are the next 5 integers: ");
		while(numadd<=(num+5)){
			System.out.print(numadd + " ");
			numadd = numadd + 1;
		}
		numadd = num;
		System.out.print("\n");
		System.out.println("Here are the next 5 multiples of " + num + ": ");
		while(numadd<=(num*6)){
			System.out.print(numadd + " ");
			numadd = numadd+num;
		}
		double numdivhun = num/100.0;
		double numdivten = num/10.0;
		
		System.out.print("\n");
		System.out.println("Here is " + num + " divided by 100: ");
		System.out.println(numdivhun);
		System.out.println("Here is " + num + " divided by 10: ");
		System.out.print(numdivten);
	}
}
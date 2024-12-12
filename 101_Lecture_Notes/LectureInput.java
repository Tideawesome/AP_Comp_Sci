/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String name = sc.nextLine ();
        System.out.println("Hello, " + name + "!");
        
        System.out.print("Please enter a number: ");
        int number1 = sc.nextInt ();
        sc.nextLine ();
        System.out.print("Please enter another number: ");
        int number2 = sc.nextInt ();
        sc.nextLine ();
        int sum = number1 + number2;
        //int sum or (number1 + number2) will print the sum of the two numbers
        System.out.println("The sum of these numbers is " + (number1 + number2));
        
        System.out.print("Hello, " + name + " what is your favorite food?: ");
        String food = sc.nextLine ();
        System.out.print("Your favorite food is " + food);
	}
}
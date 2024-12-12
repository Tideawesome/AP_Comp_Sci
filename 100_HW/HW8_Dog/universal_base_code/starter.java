/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("Joey");
		dog1.setAge(4);
		Dog dog2 = new Dog("Walter", "Golden Retriever");
		
		if (dog1.isSleeping()==true && dog2.isSleeping()==true) {
			System.out.println("It's asleep");
		}
		else if (dog1.isSleeping()==true && dog2.isSleeping()==false) {
			System.out.println("It's asleep");
		}
		else if (dog1.isSleeping()==false && dog2.isSleeping()==true) {
			dog1.bark();
			dog2.bark();
		}
		else if (dog1.isSleeping()==false && dog2.isSleeping()==false) {
			dog1.bark();
			dog2.bark();
		}
	}
}

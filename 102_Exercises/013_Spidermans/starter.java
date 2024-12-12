/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillain("Green Goblin");
		
		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		x.setAge(28);
		z.setVillain("The Vulture");
		
		System.out.println("The Villain is " + y.getVillain());
		
		Spiderman a = new Spiderman(16);
		a.setActor("Miles Morales");
		a.setVillain("Spot");
	}
}

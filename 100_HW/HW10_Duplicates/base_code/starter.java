/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		int x, y, z;
		for(x = 0; x<arr.length; x++){
			arr[x] = (int) (Math.random()*10)+1;
		}
		y = (int) (Math.random()*10)+1;
		z = 0;
		System.out.println("Looking for " + y);
		for(x = 0;x<arr.length;x++){
			if(y==arr[x]){
				z++;
				System.out.println("Duplicates found at index " + x);
			}
		}
		System.out.println("There is a total of" + z + " dupes.");
		System.out.print("\n");
		System.out.println("Looking for consecutives: ");
		int c = 0;
		for(x=0;x<arr.length-1;x++){
			c=x+1;
			if(arr[x]==arr[c]){
				System.out.println("Consecutive numbers found at indexes " + x + " and " + c + ".  The number checked was " + arr[x]);
			}
		}
	}
}

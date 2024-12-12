/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int n = 60;
		int [] a = new int[n];

		for(int x=0;x<n;x++){
			int r = (int)(Math.random()*99)+1;
			a[x] = r;
		}
		
		int min = 100;
		for(int i=0;i<n;i++){
			if(a[i]<min){
				min = a[i];
			}
		}
		
		int max = 1;
		for(int ii=0;ii<n;ii++){
			if(a[ii]>max){
				max = a[ii];
			}
		}
		
		int avg = 0;
		for(int iii;iii<n;iii++){
			avg += a[iii];
		}
		avg = avg/n;
		
		System.out.println("Out of " + n + "values: ");
		System.out.println("The min is " + min);
		System.out.println("The max is " + max);
		System.out.println("The average is " + avg);
	}
}

/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a message: ");
		String m = sc.nextLine();
		System.out.print(spongeCase);

		
	}
	
	public static String spongeCase(String m){
			String spongecaseified = "";
			for(int i=0; i<m.length(); i++){
			String c = m.substring(i,i+1);
			if(i%2==0){
				String lower = c.toLowerCase();
				spongecaseified = spongecaseified + lower;
			}
			else{
				String upper = c.toUpperCase();
				spongecaseified = spongecaseified + upper;
			}
		}
		return spongecaseified;
	}
}

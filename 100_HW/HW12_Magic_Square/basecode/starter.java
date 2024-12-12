import pkg.*;

class starter {
	public static void main(String args[]) {
		CVMath.specialSquare(5);
		System.out.println(CVMath.findMid(2,3,1));
		CVMath.specialSquare(5);
		boolean check1 = false;
		boolean check2 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many perfect sqaures do you want?: ");
		int n = sc.nextInt();
		double c = 0;
		int i = 0;
		double num = 1;
		while(count<num){
			c++;
			double sqrt = Math.sqrt(c);
			System.out.println(sqrt);
			double sqrt2 = (int)Math.sqrt(c);
			System.out.println(sqrt2);
			if(sqrt2==sqrt){
				check1 = true;
				System.out.println(check1);
			}
			int a = 0;
			for(int x=0;x<c;x++){
				a++;
				if(a==c){
					check2 = true;
					System.out.println(check2 + " 2");
				}
			}
			if(check1==true && check2==true){
				System.out.println(c);
				i++;
			}
			check1 = false;
			check2 = false;
		}
	}
}

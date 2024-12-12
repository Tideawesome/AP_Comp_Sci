/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
	    printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Spike");
        greeting("Mortis");
        
        double num = raise(6000, 6);
        num = raise(num+6000, 5);
        num = raise(num+6000, 5);
        num = raise(num+6000, 5);
        num = raise(num+6000, 5);
        num = raise(num+6000, 5);
        num = raise(num+6000, 5);
        num = raise(num+6000, 5);
        num = raise(num+6000, 5);
        System.out.println(num);
    }
	
	public static double raise(double salary, int percent){
	    double newSalary = salary + (salary * (percent/100.0));
	    return newSalary;
	}
	
	public static void greeting(String name) {
	    System.out.println("Howdy " + name);
	}
	
	public static void printAnimal() {
	    System.out.println("  _      _      _");
	    System.out.println(">(.)__ <(.)__ =(.)__");
	    System.out.println(" (___/  (___/  (___/");
	}
	
	
	
}
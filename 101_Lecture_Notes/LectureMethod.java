/* 
    Lecture note example - Methods
*/
import java.util.Scanner; 

class LectureMethod{
    public static void main(String args[]) {
        greeting("John"); 
        printAnimal(); 
        
        double num = raise(1000.0, 10); 
        System.out.println(num); 
        num = raise(num, 15); 
        System.out.println(num); 
	}
	
	public static void printAnimal() {
	    System.out.println("   __      _ ");
	    System.out.println(" o'')}____// ");
		System.out.println("  `_/      ) ");
	    System.out.println("  (_(_/-(_/  "); 
	    
	}
	
	public static double raise(double salary, int percent) {
        double amount = salary + (salary * (percent/100.0)); 
        return amount; 
	}
	
	public static void greeting(String name) {
	    System.out.println("Wassup " + name); 
	}
}
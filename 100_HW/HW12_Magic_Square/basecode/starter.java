import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		CVMath CVMath = new CVMath(); 
		System.out.println("Input a number of how many magic squares you want to see!"); 
		int x = sc.nextInt(); 
		System.out.println("----------------------------------------");
		CVMath.specialSquare(x);
		
		
		//System.out.println(CVMath.findMid(2,3,1));
	}
}

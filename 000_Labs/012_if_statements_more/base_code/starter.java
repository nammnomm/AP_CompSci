/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Give me a random integer: ");
	int int1 = sc.nextInt(); 
	
	System.out.println("Give me another random integer: ");
	int int2 = sc.nextInt(); 
	
	boolean x = int1 != int2; 
	
		if(x) {
			System.out.println("The two values are different!");
		} else {
			System.out.println("The two values are equal!");
		}
	}
}


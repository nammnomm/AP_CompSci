/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int x, int y) {
		

		while (y != 1) {
			x = x * x; 
			y--; 
		}
		return x; 
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("What's your base number? ");
		int base = sc.nextInt(); 
		
		System.out.println("What's your exponent number? ");
		int exponent = sc.nextInt();
		
		int result = pow(base, exponent); 
		System.out.println("Your final number is: " + result); 
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("What's your name? ");
	String name = sc.nextLine(); 
	
	System.out.println("How many times should your name be outputed?");
	int nums = sc.nextInt(); 
	int x = 0; 
		
		while(x < nums) {
			System.out.println(name); 
		 if (x >= nums) {
			break; 
		}
		x = x + 1;
		}
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Guess a number from 1-1000");
	int guess1 = sc.nextInt();
	int random = (int)(Math.random()*1000) + 1; 
	
		if (guess1 == random) {
			System.out.println("You got it right!");
			
		} else if (guess1 > random) {
			System.out.println("Lower!"); 
			
		} else if (guess1 < random) {
			System.out.println("Higher!"); 
		} else {
			System.out.println("Type in a valid number!"); 
		}
	}
}

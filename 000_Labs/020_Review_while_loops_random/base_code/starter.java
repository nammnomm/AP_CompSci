/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	int secret = (int)(Math.random() * 1000) + 1; 
	
	int guess = 0;
	while (guess != secret) {
		System.out.println("Guess a random number 1-1000"); 
		guess = sc.nextInt(); 
		
		if (guess > secret) {
			System.out.println("Guess Lower!");
			
		} else if (guess < secret) {
			System.out.println("Guess Higher!");
		}
		
	if (guess == secret) {
		System.out.println("You got it!");
		break; 
			}
		} 
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Do you wish to be a Wizard, Warrior or a Rouge? ");
	String input = sc.nextLine(); 
		
		if(input.equalsIgnoreCase("Wizard")) {
			System.out.println("You have selected the Wizard race");
			
		} else if(input.equalsIgnoreCase("Warrior")) {
			System.out.println("You have selected the Warrior race");
			
		} else if(input.equalsIgnoreCase("Rouge")) {
			System.out.println("You have selected the Rouge race"); 
		} else {
			System.out.println("Please select a valid race"); 
		}
	}
}

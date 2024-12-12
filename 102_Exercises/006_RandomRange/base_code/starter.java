/*
 *	Author: Caleb Nam
 *  Date: 9/16/24
 *	Collaborator(s): Caleb Nam
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
		
	System.out.println("Please enter an integer: "); 
	int int1 = sc.nextInt();
	
	System.out.println("Please enter another integer (bigger than the first): "); 
	int int2 = sc.nextInt();
	
	System.out.println("Your range is " + int1 + " to " + int2); 
	System.out.println("Here are 5 numbers generated in that range.");
	int random1 = (int)(Math.random() * (int2 - int1)) + int1; 
	int random2 = (int)(Math.random() * (int2 - int1)) + int1;
	int random3 = (int)(Math.random() * (int2 - int1)) + int1; 
	int random4 = (int)(Math.random() * (int2 - int1)) + int1; 
	int random5 = (int)(Math.random() * (int2 - int1)) + int1; 
	System.out.println(random1 + ", " + random2 + ", " + random3 + ", " + random4 + ", " + random5);
	}
}

/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What is the name of your character?");
	String name = sc.nextLine();
	System.out.println("Hello " + name + "!"); 
	
	System.out.println("What is your title?");
	String title = sc.nextLine();
	System.out.println(name + " " + title + "! Awesome!"); 
	
	System.out.println("Do you wish to be a Wizard, Warrior or a Rouge? ");
	String role = sc.nextLine(); 
		if(role.equalsIgnoreCase("Wizard")) {
			System.out.println("You have selected the Wizard race");
			
		} else if(role.equalsIgnoreCase("Warrior")) {
			System.out.println("You have selected the Warrior race");
			
		} else if(role.equalsIgnoreCase("Rouge")) {
			System.out.println("You have selected the Rouge race"); 
		} else {
			System.out.println("Please select a valid race"); 
		}
		
		int points = 20; 
		System.out.println("You have 20 points to spend on your traits, which are: Strength, Dexterity, Intelligence, and Charisma");
		System.out.println("How many points would you like to put in strength? (max is 10 points) "); 
		int strength = sc.nextInt();
		
		if (strength <= 10) {
		System.out.println("You have put " + strength + " points into strength!");
		System.out.println("You have " + (points - strength) + " points left!"); 
		} else {
			System.out.println("The max points you can put in one category is 10");
		}
		
		System.out.println("How many points would you like to put in Dexterity?"); 
		int dex = sc.nextInt();
		
		if (dex <= 10) {
			System.out.println("You have put " + dex + " points into dexterity!");
			System.out.println("You have " + (points - strength - dex) + " points left!"); 
		} else if ((points - strength - dex) == 0) {
			System.out.println("You have used up all your points!");	
		} else {
			System.out.println("The max points you can put in one category is 10"); 
		}
	
		System.out.println("How many points would you like to put in intelligence?"); 
		int iq = sc.nextInt();
		
		if (iq <= (points - strength - dex)) {
			System.out.println("You have put " + iq + " points into intelligence!");
			System.out.println("You have " + (points - strength - dex - iq) + " points left!"); 
		} else if ((points - strength - dex - iq) == 0) {
			System.out.println("You have used up all your points!");	
		}	else {
			System.out.println("The max points you can put in one category is 10"); 
		}
		
		System.out.println("How many points would you like to put in charisma?"); 
		int cha = sc.nextInt();
		
		if (cha <= (points - strength - dex - iq)) {
			System.out.println("You have put " + cha + " points into charisma!");
			System.out.println("You have " + (points - strength - dex - iq - cha) + " points left!"); 
		} else if ((points - strength - dex - iq - cha) == 0) {
			System.out.println("You have used up all your points!");	
		} else if (cha > (points - strength - dex - iq)) {
			System.out.println("You don't have enough points, please try again. You only have " + (points - strength - dex - iq) + " points left!"); 
			int cha2 = sc.nextInt();
				if (cha2 <= (points - strength - dex - iq)) {
				 System.out.println("You have put " + cha + " points into charisma!"); 
				 System.out.println(name + " " + title + ", you have put " + strength + " points into strength, " + dex + " points into dexterity, " + iq + " points in intelligence, and " + cha2 + " points into charisma!");
			}
		} else {
		  System.out.println("The max points you can put in one category is 10"); 
		}
		
		System.out.println(name + " " + title + ", you have put " + strength + " points into strength, " + dex + " points into dexterity, " + iq + " points in intelligence, and " + cha + " points into charisma!");
	}
}

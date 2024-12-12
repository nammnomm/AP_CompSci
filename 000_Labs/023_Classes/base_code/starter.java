/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;


class Character {
	String role = new String("Wizard"); 
	int strength = 5; 
	int dex = 5; 
	int intelligence = 5; 
	int constit = 5; 
	int charisma = 5; 
}

class starter {
	public static void main(String args[]) {
		Character person = new Character(); 
		System.out.println("Your role is " + person.role); 
		System.out.println("Your strength trait is " + person.strength); 
		System.out.println("Your dexteritiy trait is " + person.dex); 
		System.out.println("Your intelligence trait is " + person.intelligence); 
		System.out.println("Your consitution trait is " + person.constit); 
		System.out.println("Your charisma trait is " + person.charisma); 
	}
}

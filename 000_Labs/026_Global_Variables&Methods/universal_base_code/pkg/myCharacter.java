/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution; 
	int charisma; 
	
	public void myToString() {
		role = "Rouge";
		strength = 0; 
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0; 
	}
	
	public void myToString(String a, int b, int c, int d, int e, int f) {
		System.out.println("Your role is " + a); 
		System.out.println("Your strength trait is " + b); 
		System.out.println("Your dexterity trait is " + c); 
		System.out.println("Your intelligence trait is " + d); 
		System.out.println("Your constiution trait is " + e); 
		System.out.println("Your charisma trait is " + f); 
	}

}


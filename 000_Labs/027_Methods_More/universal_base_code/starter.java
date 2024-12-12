/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter person = new myCharacter();
		person.setAll("Fat Guy", 3, 3, 4, 5, 6);
		person.setRole("Caleb Nammy");
		person.setStrength(400); 
		person.setDexterity(33); 
		person.setIntelligence(234); 
		person.setConstitution(233434); 
		person.setCharisma(12332); 

		person.myToString(); 
	}
}


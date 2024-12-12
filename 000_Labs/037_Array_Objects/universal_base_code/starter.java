/*
 *	Author:  caleb Nam
 *  Date: 11/14/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wizard = new Wizard[100]; 
			for (int a = 0; a < wizard.length; a++){
				wizard[a] = new Wizard("Harry Potter"); 
			}
		
		Warrior[] warrior = new Warrior[100]; 
			for (int b = 0; b < warrior.length; b++){
				warrior[b] = new Warrior("Draco Malfoy"); 
			}
		int wizCount = 100; 
		int warCount = 100; 
		int wizOrder = 0; 
		int warOrder = 0; 
		while (wizCount > 0 && warCount > 0) {
            if (wizOrder < wizard.length) {
                wizard[wizOrder].attack(warrior[warOrder]);
                if (wizard[wizOrder].isDead()) {
                    wizCount--;
                    wizOrder++;
                }
            }
        	if (warOrder < warrior.length) {
                warrior[warOrder].attack(wizard[wizOrder]);
                if (warrior[warOrder].isDead()) {
                    warCount--;
                    warOrder++;
                }
            }
            if (warCount == 0 || wizCount == 0){
            	break; 
            }
        }
			
		if(wizCount > 0){
			System.out.println("Harry Potter won with " + wizCount + " left in their army!"); 
		}
		if(warCount > 0){
			System.out.println("Draco Malfoy won with " + warCount + " left in their army!"); 
		}
	}
}

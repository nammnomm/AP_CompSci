/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog liljonah = new Dog("lilJonah", 16);
		Dog liljayden = new Dog("lilJayden", "gumAddict"); 
		String jonahName = liljonah.getName(); 
		String jaydenName = liljayden.getName();
		boolean jonahChecker= liljonah.isSleeping();
		boolean jaydenChecker = liljayden.isSleeping(); 
		if (jonahChecker == true) {
			liljonah.bark(jonahName); 
		}
		else {
			System.out.println(jonahName + " is sleeping");
		}
		
		
		if (jonahChecker == true && jaydenChecker == false) {
			System.out.println(jaydenName + " just barked!");
		}
		else if (jonahChecker == true && jaydenChecker == true) {
			System.out.println(jaydenName + " just barked!");
		}
		else if (jonahChecker == false && jaydenChecker == false) {
			System.out.println(jaydenName + " is sleeping");
		}
		else if (jonahChecker == false && jaydenChecker == true) {
			System.out.println(jaydenName + " is awake now"); 
		}
	}	
}

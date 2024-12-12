/*
 *	Author:  
 *  Date: 
*/

import pkg.*; 
import java.util.Scanner;
import java.util.Random;


public class starter {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in); 
        MyCharacter person = new MyCharacter(); 
       
        System.out.println("Please choose a role"); 
        String characterRole = sc.nextLine();
        person.roleTaker(characterRole); 


        System.out.println("Your strength trait is " + person.strength); 
        System.out.println("Your dexterity trait is " + person.dex); 
        System.out.println("Your intelligence trait is " + person.intelligence); 
        System.out.println("Your constitution trait is " + person.constit); 
        System.out.println("Your charisma trait is " + person.charisma); 
    }
}
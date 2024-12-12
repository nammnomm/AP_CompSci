/*
 *	Author:  
 *  Date: 
*/
import pkg.*; 
import java.util.Scanner;
import java.util.Random;


public class starter {
    public static void main(String[] args) {
        MyCharacter person = new MyCharacter(); 
        
        System.out.println("Your role is " + person.role); 
        System.out.println("Your strength trait is " + person.strength); 
        System.out.println("Your dexterity trait is " + person.dex); 
        System.out.println("Your intelligence trait is " + person.intelligence); 
        System.out.println("Your constitution trait is " + person.constit); 
        System.out.println("Your charisma trait is " + person.charisma); 
    }
}
/*
 *	Author:  
 *  Date: 
*/

package pkg; 
import java.util.Scanner;
import java.util.Random;

public class MyCharacter {
    public String role;  
    public int strength = 0; 
    public int dex = 0; 
    public int intelligence = 0; 
    public int constit = 0; 
    public int charisma = 0;
    
    public void noRole() {
        role = "No Role";  
    }
    
    public void roleTaker(String x) {
        if (x.equalsIgnoreCase("Wizard") || x.equalsIgnoreCase("Rouge") || x.equalsIgnoreCase("Mage")) {
            role = x;  
            System.out.println("Awesome! Your role is " + role);
        } 
        else {
            noRole(); 
            x = role; 
            System.out.println("You have selected " + x + ". Please rerun the code!");
        }
    }
}
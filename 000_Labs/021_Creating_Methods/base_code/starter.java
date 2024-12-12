/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

public class starter {
	
 public String getStringInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a sentence: ");
        return sc.nextLine();
 } 
 
 public String getanotherStringInput() {
 		Scanner sc = new Scanner(System.in); 
 		System.out.print("Type another sentence: "); 
 		return sc.nextLine(); 
 }
	public static void main(String args[]) {
		starter starter = new starter(); 
		String sent = starter.getStringInput();
		String sent2 = starter.getanotherStringInput(); 
		System.out.println("This is using the method! "); 
		System.out.println(sent); 
		System.out.println(sent + " " + sent2); 
	
	
	}
}

/*
 *	Author:Caleb Nam 
 *  Date: 10/19/2024
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a sentence and the computer will encode it!");
		String message = sc.nextLine(); 
		
		System.out.println(Cipher.encode(message)); 
	}
}
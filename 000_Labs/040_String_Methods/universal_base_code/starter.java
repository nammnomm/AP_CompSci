/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in); 
	
	System.out.println("Enter your full name (first and last name)");
	String name = sc.nextLine(); 
	
	String [] arr = new String[name.length()]; 
	int x = 1;
	
	for(int i = 0; i  < name.length(); i++){
		arr[i] = name.substring(i, x); 
		x++; 
	}
	int marker = 0; 
	for(int a = 0; a < name.length(); a++){
		if (arr[a].equals(" ")){
			marker = a + 1; 
			break; 
		}
	}
	String lastName = name.substring(marker, name.length()); 
		
	
	
	System.out.println("Your last name is: " + lastName); 

		
	}
}

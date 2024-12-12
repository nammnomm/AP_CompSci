/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What's your name?");
	String name = sc.nextLine(); 
	
	System.out.println("Hi " + name + ", How old are you?");
	int age = sc.nextInt(); 
	
	sc.nextLine();
	System.out.println("You're only " + age + "? Wow! What's your birth month?"); 
	String month = sc.nextLine();
	
	sc.nextLine(); 
	System.out.println("Wow, " + month +  "! That's a cool month! What about your birthday day?"); 
	int day = sc.nextInt(); 
	
	sc.nextLine();
	System.out.println(day + "? That's pretty cool! What about the year of your bithday?");
	int year = sc.nextInt(); 
	
	sc.nextLine(); 
	System.out.println(year + "? That's awesome! Random question now, how much is a buck fifty?");
	double money = sc.nextDouble();
	
	System.out.println("$" + money + "? You got it!");
	}
}

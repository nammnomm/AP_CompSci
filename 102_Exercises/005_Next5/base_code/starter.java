/*
 *	Author: Caleb Nam
 *  Date: 9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number");
	int name = sc.nextInt();
	System.out.println("Here are the next 5 numbers: " + (name + 1) + " " + (name + 2) + " " + (name + 3) + " " + (name + 4) + " " + (name + 5));
	System.out.println("Here are the next 5 multiples: " + (name * 2) + " " + (name * 3) + " " + (name * 4) + " " + (name * 5) + " " + (name * 6));
	System.out.println("Here is " +  name + " divided by 100: " + name/100.0);
	System.out.println("Here is " +  name + " divided by 10: " + name/10.0);
	}
}

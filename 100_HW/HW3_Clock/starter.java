/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What day is it today? (Answer with a number, Sun=0, Monday=1, etc.) ");
	int ans = sc.nextInt();
	
		if (ans >= 1 && ans <= 5) {
			System.out.println("Your alarm is set for 7:00 AM! ");
		} else if (ans == 0 || ans == 6){
			System.out.println("Your alarm is set for 10:00 AM! ");
		} else {
			System.out.println("You didn't up in a valid number (only 0-6)");
		}
	}
}

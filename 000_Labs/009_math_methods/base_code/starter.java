/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	System.out.println("Max = " + Math.max(13-6*11, 30 % 7 *(-2)));
	System.out.println("Sqrt = " + Math.sqrt(3 * 8 + 31 % 7));
	System.out.println("Power = " + Math.pow(37/3, 35 % 21));
	System.out.println("Max = " + Math.max(Math.pow(2, 14%3), Math.sqrt(2*6)));

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Give me a number"); 
	double nums1 = sc.nextDouble(); 
	System.out.println("Give me another number"); 
	double nums2 = sc.nextDouble(); 
	
	sc.nextLine();
	System.out.println("Max = " + Math.max(nums1, nums2));
	System.out.println("Square root of " + nums2 + " is: "  + Math.sqrt(nums2));
	System.out.println("The power of " + nums1 + " and " + nums2 + " is: " + (Math.pow(nums1, nums2)));


	



		
		
		
		
		
		
	
	}
}

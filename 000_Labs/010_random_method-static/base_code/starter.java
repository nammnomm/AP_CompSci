/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int nums1 = (int)(Math.random()*10);
	int nums2 = (int)(Math.random()*100) + 1;
	double nums3 = (Math.random()*1) + 2.5;
	double nums4 = (Math.random()*575) + 14;
	
	System.out.println(nums1); 
	System.out.println(nums2); 
	System.out.println(nums3); 
	System.out.println(nums4);
	}
}

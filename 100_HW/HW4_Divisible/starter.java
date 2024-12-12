/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: "); 
		int nums1 = sc.nextInt(); 
		
		System.out.println("Enger another Integer: ");
		int nums2 = sc.nextInt();
		
		if (nums1 % 2 == 0) {
			System.out.println(nums1 + " is an even number!"); 
		} else {
			System.out.println(nums1 + " is an odd number!"); 
		}
		
		if (nums2 % 2 == 0) {
			System.out.println(nums2 + " is an even number!"); 
		} else {
			System.out.println(nums2 + " is an odd number!"); 
		}
		
		if (nums1 % 3 == 0) {
			System.out.println(nums1 + " is divisible by 3!"); 
		} else if (nums1 % 3 != 0 ) {
			System.out.println(nums1 + " is not divisible by 3!");
		} 
		if (nums1 % 4 == 0) {
			System.out.println(nums1 + " is divisible by 4!");
		} else if (nums1 % 4 != 0) {
			System.out.println(nums1 + " is not divisible by 4!"); 
		}  
		if (nums1 % 5 == 0) {
			System.out.println(nums1 + " is divisible by 5!"); 
		} else if (nums1 % 5 != 0) {
			System.out.println(nums1 + " is not divisible by 5!"); 
		} 
		if (nums1 % 3 != 0 && nums1 % 4 != 0 && nums1 % 5 != 0) {
			System.out.println(nums1 + " is not divisible by 3, 4, or 5");
		}
		
		
		if (nums2 % 3 == 0) {
			System.out.println(nums2 + " is divisible by 3!"); 
		} else if (nums2 % 3 != 0 ) {
			System.out.println(nums2 + " is not divisible by 3!");
		} 
		if (nums2 % 4 == 0) {
			System.out.println(nums2 + " is divisible by 4!");
		} else if (nums1 % 4 != 0) {
			System.out.println(nums2 + " is not divisible by 4!"); 
		}  
		if (nums2 % 5 == 0) {
			System.out.println(nums2 + " is divisible by 5!"); 
		} else if (nums1 % 5 != 0) {
			System.out.println(nums2 + " is not divisible by 5!"); 
		} 
		if (nums2 % 3 != 0 && nums2 % 4 != 0 && nums1 % 5 != 0) {
			System.out.println(nums2 + " is not divisible by 3, 4, or 5");
		}
		
	}
}

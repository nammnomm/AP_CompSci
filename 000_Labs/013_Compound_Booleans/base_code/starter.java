/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Type in a integer");
		int nums1 = sc.nextInt();
		System.out.println("Type in different integer");
		int nums2 = sc.nextInt();
		System.out.println("Type in another different integer");
		int nums3 = sc.nextInt();
		
		if (nums1 >= nums2 && nums1 >= nums3) {
			System.out.println(nums1);
		} else if (nums2 >= nums1 && nums2 >= nums3) {
			System.out.println(nums2);
		} else if (nums3 >= nums1 && nums3 >= nums2){
			System.out.println(nums3);
		}
		
		if (nums1 <= nums2 && nums1 <= nums3) {
			System.out.println(nums1);
		} else if (nums2 <= nums1 && nums2 <= nums3){
			System.out.println(nums2);
		} else if (nums3 <= nums1 && nums3 <= nums2){
			System.out.println(nums3);
		}
		else {
			System.out.println("Please input 3 different numbers"); 
		}
	}
}

/*
 *	Author: Caleb Nam
 *  Date: 11/7
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
    public static void main(String args[]) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        System.out.println("---------------------------------");
        
        System.out.println("These are the 20 numbers:");
        for (int a = 0; a < 20; a++) {
            System.out.print(arr[a] + " ");
        }
		System.out.println(" "); 
		System.out.println("---------------------------------");
		int target = (int)(Math.random() * 10) + 1;
        System.out.println("The random number to look for is " + target);

        int totalDupes = 0;
        for (int b = 0; b < arr.length; b++) {
            if (arr[b] == target) {
                System.out.println("Duplicate found at index " + b);
                totalDupes++;
            }
        }
        System.out.println("Total number of duplicates for " + target + " is " + totalDupes);
		System.out.println("---------------------------------");
		
		System.out.println("Looking for two in a row: "); 
		
		for (int c = 0; c < arr.length - 1; c++) {
            if (arr[c] == arr[c + 1]) {
                System.out.println("Two in a row found at indexes " + c + " and " + (c + 1) + ". The number is " + arr[c]);
            }
        }
    }
}
/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[1000];
		int i = 0;
		int x = 3; 
		while (i < arr.length){
			arr[i] = x; 
			System.out.print(arr[i] + ", "); 
			x += 3;
			i++; 
		}
		System.out.println("--------------------------------------------------------"); 
		
		int y = 1000; 
		int z = 0; 
		int [] arr2 = new int[1000];
		while(z < arr2.length){
			arr2[z] = y;
			System.out.print(arr2[z] + ", "); 
			y = y - 1;
			z++;
		}
	}
}

/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		for(int i = 0; i < 1000; i++){
			arr[i] = (int)(Math.random()*1000); 
			i++; 
		}
		for(int x = 0; x< 1000; x++){
			System.out.println(arr[x]);
			x++; 
		}
	}
}

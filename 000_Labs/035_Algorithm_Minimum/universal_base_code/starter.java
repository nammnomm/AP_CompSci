/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr1 = new int[149];	
		int[] arr2 = new int[100];
		int min = Integer.MAX_VALUE; 
		int max = Integer.MIN_VALUE; 
		int max2 = Integer.MIN_VALUE; 
		
		for(int i = 0; i < 149; i++){
			arr1[i] = (int)(Math.random()*150) + 51; 
		}
		for(int x = 0; x < 100; x++){
			arr2[x] = (int)(Math.random()*100) + 1; 
		}
		
		for(int y = 0; y < arr1.length; y++){
			if(arr1[y] < min) {
				min = arr1[y]; 
			}
		}
		System.out.println(min); 
		
		for(int z = 0; z < arr2.length; z++){
			if(arr2[z] < min) {
				min = arr2[z]; 
			}
		}
		System.out.println(min); 
		
		for(int a = 0; a < arr1.length; a++){
			if(arr1[a] > max) {
				max = arr1[a]; 
			}
		}
		System.out.println(max); 
		
		for(int b = 0; b < arr2.length; b++){
			if(arr2[b] > max2) {
				max2 = arr2[b]; 
			}
		}
		System.out.println(max2); 
		
		int sum = 0; 
		for(int c = 0; c < arr1.length; c++){
			sum = sum + arr1[c]; 
		}
		System.out.println(sum); 
		
		int sum2 = 0; 
		for(int e = 0; e < arr2.length; e++){
			sum2 = sum2 + arr2[e]; 
		}
		System.out.println(sum2); 
	}
}

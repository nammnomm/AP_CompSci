/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int[] x; 
	int sum; 
	int counter; 
	int max; 
	int min; 
	
		public BaseClass(){
			sum = 0;
			counter = 0; 
			max = 0; 
			min = 100; 
		}
		public void toStringArray(int[] x){
			for (int i = 0; i < x.length; i++){
				System.out.print(x[i] + " "); 
			}
		}
		
		public int getArrayAverage(int[] x){
			for (int a = 0; a < x.length; a++){
				sum = sum + x[a];  
				counter++; 
			} 
			return sum/counter; 
		}
		public int getArrayMax(int[] x){
			for (int b = 0; b < x.length; b++){
				if(x[b] > max){
					max = x[b]; 
				}
			}
			return max; 
		}
		public int getArrayMin(int[] x){
			for (int c = 0; c < x.length; c++){
				if(x[c] < min){
					min = x[c]; 
				}
		}
		return min; 
	}
 
}

/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter { 
    public static void main(String[] args) {
        BaseClass test = new BaseClass();
        int[] x = new int[100];
        for (int i = 0; i < 100; i++) {
            x[i] = (int) (Math.random() * 100) + 1; 
        }


        test.toStringArray(x);
        
        System.out.println(" "); 
        int average = test.getArrayAverage(x);
        System.out.println(average);
        
        int max = test.getArrayMax(x);
        System.out.println(max);
        
        int min = test.getArrayMin(x);
        System.out.println(min);
    }
}
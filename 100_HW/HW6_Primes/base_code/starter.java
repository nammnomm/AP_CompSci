/*
 *	Author:caleb nam
 *  Date:
*/

import java.util.Scanner;
import java.util.Random;


class starter {   
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number and I will print out all the prime numbers from 0 to that number ");
        
        int primeprint = sc.nextInt();
        printPrimes(primeprint);
    }
    
    public static boolean checkPrime(int max){
        int checker = max - 1;
            while(checker > 1)
            {
                    if((max % checker)==0)
                    {
                        return false;
                    }
                    checker--;
                }
        return true;
    }
    public static void printPrimes(int printer){
            int prime = 2; 
            while(printer > prime){
                if(checkPrime(prime))
                {
                    System.out.println(prime);
                }
                prime++;
            }
        }
}





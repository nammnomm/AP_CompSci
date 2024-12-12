/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence and it should output the sentence backwards");
		String sent = sc.nextLine();
		System.out.println(sent);
		int space = sent.indexOf(" "); 
		String result = ""; 

        while(true){
            if(sent.indexOf(" ") == -1){
                result = sent + " " + result; 
                break; 
            }
            int spaces = sent.indexOf(" ");
            String word = sent.substring(0, spaces); 
            result = word + " " + result;
            sent = sent.substring(spaces + 1); 
        }
        System.out.println(result);
	}
}
		
		
	

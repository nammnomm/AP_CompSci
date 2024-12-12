/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
	
	
	public void game(int x){
		if(x == 1){
			onePlayer();
			
		}
	
		if(x == 2){
			
		}
	}
	
	public void onePlayer(){
		String[] arr = {"flower", "pot", "happy", "coding", "gum", "file", "cabinet", "english", "player", "system", "phone", "period", "tiktok", "youtube", "wingstop", "jacket", "homework", "extra", "credit", "movie", "mall", "stand", "microphone", "computer", "desk", "college", "math", "pizza", "volleyball", "basketball", "avengers", "black", "white", "red", "pink", "disney", "park", "package", "baseball", "pokemon", "brawler", "dictionary", "valorant", "boba"};
		int x = (int)(Math.random()*45); 
		System.out.println("Your word has " + arr[x].length() + " letters"); 
	}
		
}

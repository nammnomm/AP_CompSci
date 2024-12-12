import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------"); 
        System.out.println("Welcome to Hangman! The best game in the world!\nDo you want to play with one or two players? (type 1 or 2)");
        System.out.println("-------------------------------------------------------"); 
        int players = sc.nextInt();
        System.out.println("You have selected "+ players + " player mode"); 
        System.out.println("-------------------------------------------------------"); 
        if (players == 1){
            System.out.println("Here are the rules for 1 player mode:");
            System.out.println("1. You will be given a random word that you have to guess");
            System.out.println("2. You can guess a single letter at a time");
            System.out.println("3. If you're feeling risky, you can guess the whole word");
            System.out.println("4. Each time you guess wrong, more body parts will be added to your hangman");
            System.out.println("5. You will be given one hint, but it will cost you a body part");
            System.out.println("6. The goal is to guess the word before the hangman is fully drawn!"); 
        }
        if (players == 2){
            System.out.println("Here are the rules for 2 player mode:");
            System.out.println("1. One person (giver) will type a word in, and the other (guesser) will try to guess that word");
            System.out.println("2. You can guess a single letter at a time");
            System.out.println("3. If you're feeling risky, you can guess the whole word");
            System.out.println("4. Each time you guess wrong, more body parts will be added to your hangman");
            System.out.println("5a. The person who gave the word will have a random trivia question\n   that they need to solve (within a time limit) after every guess");  
            System.out.println("5b. If the giver cannot get the trivia question correct, the guesser will recieve a free hint"); 
            System.out.println("5c. If the giver gets 3 trivia questions correct, in-a-row, one body part will be added to the hangman"); 
            System.out.println("6. The goal is to guess the word before the hangman is fully drawn!"); 

        }
        System.out.println("-------------------------------------------------------"); 
        System.out.println("Let's go!");
        
    	String[] arr = {"flower", "pot", "happy", "coding", "gum", "file", "cabinet", "english", "player", "system", "phone", "period", "tiktok", "youtube", "wingstop", "jacket", "homework", "extra", "credit", "movie", "mall", "stand", "microphone", "computer", "desk", "college", "math", "pizza", "volleyball", "basketball", "avengers", "black", "white", "red", "pink", "disney", "park", "package", "baseball", "pokemon", "brawler", "dictionary", "valorant", "boba"};
        String[] pics = {"0", "--", "|", "--", "/", "\\" }; 
        if(players == 1){
    		int x = (int)(Math.random()*45); 
    		int counter = 0; 
    		System.out.println("Your word has " + arr[x].length() + " letters"); 
    		
    		String guess = sc.nextLine(); 
    		while(true){
                sc.nextLine(); 
    		    if(guess == arr[x] || guess == arr[x]{
    		        System.out.println("You got it! Good Job!!!"); 
    		    }
    		    else {
    		        System.out.println("No that's not it! Try again!"); 
    		        if (counter == 0){
    		            System.out.print(pics[counter]);
    		        }
    		        if (counter == 1){
    		            System.out.print(pics[counter]);
    		        }
    		        if (counter == 2){
    		            System.out.print(pics[counter]);
    		        }
    		        if (counter == 3){
    		            System.out.println(pics[counter]);
    		        }
    		        if (counter == 4){
    		            System.out.print(pics[counter]);
    		        }
    		        if (counter == 5){
    		            System.out.println(pics[counter]);
    		            System.out.println("Hangman was hanged :( Good luck next time!");
    		            break; 
    		        }
    		        counter++; 
    		    }
    		}
    	}
		
		if(players == 2){
		    System.out.println("Giver, please enter a word (guesser turn around)");
		    String word = sc.nextLine(); 
		    for(int i = 0; i < word.length(); i++){
		        
		    }
		    
		}
    }
}

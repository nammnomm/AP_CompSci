import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] password = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int x = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            password[x] = line;
			x++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int str1 = 0; 
		int str2 = 0;
		int str3 = 0; 
        for(int i = 0; i < count; i++){
            if((password[i].length() > 7) && !(password[i].contains("!")) && !(password[i].contains("@")) && !(password[i].contains("#")) && !(password[i].contains("$")) && !(password[i].contains("%")) && !(password[i].contains("^")) && !(password[i].contains("&")) && !(password[i].contains("*")) ){
                str1++; 
            }
            if((password[i].contains("!")) || (password[i].contains("@")) || (password[i].contains("#")) || (password[i].contains("$")) || (password[i].contains("%")) || (password[i].contains("^")) || (password[i].contains("&")) || (password[i].contains("*"))){
                str2++;
            }
            if((password[i].length() > 7) && ((password[i].contains("!")) || (password[i].contains("@")) || (password[i].contains("#")) || (password[i].contains("$")) || (password[i].contains("%")) || (password[i].contains("^")) || (password[i].contains("&")) || (password[i].contains("*")))){
                str3++; 
            }
	    }
	    System.out.println("There are " + str1 + " many passwords with 8 or more characters");
        System.out.println("There are " + str2 + " many passwords with a special character");
        System.out.println("There are " + str3 + " many passwords with 8 or more characters and a special character");
    }
} 
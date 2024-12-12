/*
   * Author: Caleb Nam
   * Date:
   * Collaborator(s):
*/
import java.util.*; 

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence and I will translate to PIG LATIN");
		String sentence = sc.nextLine(); 

		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(pigLatin(sentence) + " "); 
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space); 
			System.out.print(pigLatin(word) + " ");
		
			sentence = sentence.substring(space + 1); 
		}
	}
	
	public static String pigLatin(String sent) {
	    for (int i = 0; i < sent.length(); i++) {
	        String letter = sent.substring(i, i + 1);
	        String letter2 = sent.substring(i + 1, i + 2); 
	        
	        if ((!letter.equals("a") && !letter.equals("e") && !letter.equals("i") && !letter.equals("o") && !letter.equals("u")) &&
	            (!letter2.equals("a") && !letter2.equals("e") && !letter2.equals("i") && !letter2.equals("o") && !letter2.equals("u"))) {
	            sent = sent.substring(i + 2) + "-" + sent.substring(i, i + 2) + "ay";
	            break;  
	        }
	        else if ((!letter.equals("a") && !letter.equals("e") && !letter.equals("i") && !letter.equals("o") && !letter.equals("u")) &&
	                 (letter2.equals("a") || letter2.equals("e") || letter2.equals("i") || letter2.equals("o") || letter2.equals("u"))) {
	            sent = sent.substring(i + 1) + "-" + sent.substring(i, i + 1) + "ay";
	            break;  
	        }
	        else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
	            sent = sent + "-way";
	            break;  
	        }
	    }
	    return sent;
	}
} 
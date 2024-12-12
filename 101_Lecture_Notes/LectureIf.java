import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Scenario: It’s a school day, and your alarm clock just went off. You have a full day ahead of you with lots of opportunities and challenges. What’s your plan for the day?");
	    System.out.println("1. Have a hearty breakfast");
        System.out.println("2. Skip breakfast and get ready quickly");
	    System.out.println("3. Take a few extra minutes to relax and enjoy a slow morning");
        
        int answer1 = sc.nextInt(); 
        
        if(answer1 == 1){
            System.out.println("You eat a delcious breakfast!"); 
            System.out.println("What do you do after do you: "); 
            System.out.println("1. Go to school \n2. Skip School \n3. Eat more ");
            
            int answer2 = sc.nextInt();
            if(answer2 == 1){
                System.out.println("You arrive at school, ready to learn!");
            }
            else if(answer2 == 2){
                System.out.println("You decieve your parents and decide to ditch school for the day...");
            }
            else if(answer2 == 3){
                System.out.println("You decide to eat more breakfast... even though you ate a lot");
            }
        }
        else if(answer1 == 2){
                System.out.println("You get ready and start driving to school!"); 
                System.out.println("You get to school! What do you do after, do you: "); 
                System.out.println("1. Go to class \n2. Decide to ditch \n3. Go to McDonalds ");
                
                int answer2 = sc.nextInt();
                
                if(answer2 == 1){
                    System.out.println("You go to your first period, science");
                }
                else if(answer2 == 2){
                    System.out.println("You decieve your parents and decide to ditch school for the day...");
                }
                else if(answer2 == 3){
                    System.out.println("You got hungry and went to McDonalds across the school");
                }
        }
        else if(answer1 == 3){
            System.out.println("You decide to slow down your morning!"); 
            System.out.println("How do you decide to spend your morning do you "); 
            System.out.println("1. Listen to some music \n2. Sleep in \n3. Just ditch school");
            int answer2 = sc.nextInt();
            if(answer2 == 1){
                System.out.println("You listen to some music!");
            }
            else if(answer2 == 2){
                System.out.println("You decide to sleep in with 20 minutes left until school starts.");
            }
            else if(answer2 == 3){
                System.out.println("You decieve your parents and decide to ditch school for the day...");
            }
        }
        else{
            System.out.println("You didn't type a correct answer!"); 
        }
    }
}
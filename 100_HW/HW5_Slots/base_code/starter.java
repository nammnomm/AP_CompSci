/*
 *	Author: Caleb Nam
 *  Date: 10/3/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Slot Machine Rules:\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\n  a. If two numbers match, you double your money.\n  b. If three numbers match, you triple your money.\n  c. If none match, you lose your money.");
       
       
        int money = 100; 

        while (true) {
            if (money > 0) {
                System.out.println("would you like to play? (Yes/yes/Y/y) :"); 
                String yes = sc.nextLine();
                
                if(yes.equals("no") || yes.equals("nah") || yes.equals("No")) {
                	System.out.println("Ok! Thanks for coming!"); 
                	break; 
                }

                if(yes.equals("yes") || yes.equals("Yes") || yes.equals("Y") || yes.equals("y")) {
                    System.out.println("You have $" + money + ". How much would you like to bet? ");
                    int bet = sc.nextInt(); 
                    sc.nextLine(); 



                  if (bet <= 0 || bet > money) {
                     System.out.println("Please bet an amount less than or equal to your money.");
                     System.out.println("How much would you like to bet: ");
                     bet = sc.nextInt();
                     sc.nextLine();  
                  }
                  
                    System.out.println("Your rolls are: \n------------------");
                    int nums1 = (int)((Math.random() * 10) + 1); 
                    int nums2 = (int)((Math.random() * 10) + 1); 
                    int nums3 = (int)((Math.random() * 10) + 1); 
                    System.out.print(" | " + nums1);  
                    System.out.print(" | " + nums2);  
                    System.out.println(" | " + nums3 + " |");  

                    if((nums1 != nums2) && (nums2 != nums3) && (nums3 != nums1)) {
                        money = (money - bet);
                        System.out.println("You lost! Better luck next time!");
                        System.out.println("You now have $" + money);
                    }  
                    if (nums1 == nums2 || nums1 == nums3 || nums2 == nums3) {
                        money = money + (bet * 2) - bet; 
                        System.out.println("You won! Your bet has been doubled!");
                        System.out.println("You now have $" + money);
                    }  
                    if (nums1 == nums2 && nums2 == nums3) {
                        money = money + (bet * 3) - bet; 
                        System.out.println("You got the JACKPOT! Your bet has been tripled!");
                        System.out.println("You now have $" + money);
                    }
                }
                else{
                	System.out.println("Please enter a correct answer"); 
                }
            }
            if(money == 0) {
                System.out.print("You ran out of money! Come back next time!");
                break; 
            }
        }
    }
}
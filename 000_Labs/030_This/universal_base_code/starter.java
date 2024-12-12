/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf dwarf1 = new PooleDwarf("Dopey", 42);
		PooleDwarf dwarf2 = new PooleDwarf("Poppy", 212);
		PooleDwarf dwarf3 = new PooleDwarf("Caleb", 12);
		PooleDwarf dwarf4 = new PooleDwarf("Lovely", 2);
		PooleDwarf dwarf5 = new PooleDwarf("Gummy", 54);
		PooleDwarf dwarf6 = new PooleDwarf("Moana", 1);
		PooleDwarf dwarf7 = new PooleDwarf("Timmy", 100);
		
		int counter = 0; 
		if(dwarf1.isSameName(dwarf2.name)){
			System.out.println("The name " + dwarf2 + "is a duplicate"); 
			counter++;
		}else if(dwarf1.isSameName(dwarf3.name)){
			System.out.println("The name " + dwarf3 + "is a duplicate"); 
			counter++;
		}else if(dwarf1.isSameName(dwarf4.name)){
			System.out.println("The name " + dwarf4 + "is a duplicate"); 
			counter++;
		}else if(dwarf1.isSameName(dwarf5.name)){
			System.out.println("The name " + dwarf5 + "is a duplicate"); 
			counter++;
		}else if(dwarf1.isSameName(dwarf6.name)){
			System.out.println("The name " + dwarf6 + "is a duplicate"); 
			counter++;
		}else if(dwarf1.isSameName(dwarf7.name)){
			System.out.println("The name " + dwarf7 + "is a duplicate"); 
			counter++;
		}
		System.out.println("There are " + counter + " duplicate names"); 
	}
}

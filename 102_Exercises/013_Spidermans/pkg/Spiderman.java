package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;	
	int age;		
	String villain;		

	public Spiderman() {
		actor = actor;
		age = age;
		villain = villain;
	}

	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "unknown";
	}
	public Spiderman (int a){
		actor = "unknown";
		age = a;
		villain = "unknown";
	}
	public Spiderman(String n, int a){
		actor = n;
		age = a;
		villain = "unknown"; 
	}
	public Spiderman(String n, int a, String v){
		actor = n;
		age = a;
		villain = v;
	}
	
	public void setVillain(String villain){
		this.villain = villain;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setActor(String actor){
		this.actor = actor;
	}
	
	public String getVillain(){
		return villain;
	}
	public int getAge(){
		return age;
	}
	public String getActor(){
		return actor;
	}





	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}

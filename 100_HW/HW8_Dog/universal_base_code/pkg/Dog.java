package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name; 
	int age; 
	String breed; 
	
	public Dog() {
		name = "Clifford"; 
		age = 3; 
		breed = "big red dog";
	}
	public Dog(String nam) {
		name = nam;
		age = 1;
		breed = "dog dog"; 
	}
	public Dog(String nam, String bre){
		name = nam;
		age = 1;
		breed = bre; 
	}
	public Dog(String nam, int ag) {
		name = nam;
		age = ag; 
		breed = "dog dog"; 
	}
	
	public void setName(String input1) {
		name = input1; 
	}
	public void setAge(int input2) {
		age = input2; 
	}
	public void setBreed(String input3) {
		breed = input3; 
	}
	public String getName() {
		return name; 
	}
	public int getAge(){
		return age; 
	}
	public String getBreed() {
		return breed; 
	}
	public boolean isSleeping() {
		int roller = (int)(Math.random()*2); 
		if (roller == 0){
			return true; 
		}
		else if (roller == 1){
			return false; 
		}
	return isSleeping(); 
	}
	
	public void bark(String name){
		System.out.println(name + " just barked!"); 
	}
}

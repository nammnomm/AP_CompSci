/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution; 
	int charisma; 
	
	public void myCharacter() {
		role = "Rouge";
		strength = 0; 
		dexterity = 0;
		intelligence = 0;
		constitution = 0;
		charisma = 0; 
	}
	
	public String setRole(String charRole) {
		role = charRole; 
		return charRole; 
	}
	
	public int setStrength(int charStrength){
		strength = charStrength;
		if (charStrength < 0) {
			charStrength = 0; 
		}
		return charStrength;
	}
	
	public int setDexterity(int charDex){
		dexterity = charDex;
		if (charDex < 0) {
			charDex = 0; 
		}
		return charDex;
	}
	
	public int setIntelligence(int charIntel){
		intelligence = charIntel;
		if (charIntel < 0) {
			charIntel = 0; 
		}
		return charIntel;
	}
	
	public int setConstitution(int charCons){
		constitution = charCons;
		if (charCons < 0) {
			charCons = 0; 
		}
		return charCons;
	}
	
	public int setCharisma(int charCharisma){
		charisma = charCharisma;
		if (charCharisma < 0) {
			charCharisma = 0; 
		}
		return charCharisma;
	}
	
	public boolean setAll(String a, int b, int c, int d, int e, int f) {
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		constitution = e;
		charisma = f;
		
		return true; 
	}
	
	public void myToString() {
		System.out.println("Your role is " + role); 
		System.out.println("Your strength trait is " + strength); 
		System.out.println("Your dexterity trait is " + dexterity); 
		System.out.println("Your intelligence trait is " + intelligence); 
		System.out.println("Your constiution trait is " + constitution); 
		System.out.println("Your charisma trait is " + charisma); 
	}
}

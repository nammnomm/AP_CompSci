package pkg;

public class CVMath {		
	int number; 
	int tracker;
	public CVMath(){
		number = 0; 
		tracker = 0; 
	}
	public void specialSquare(int nums){
		for(int i = 0; i > -1; i++){
			number = number + i;
			if(Math.sqrt(number) % 1 == 0 && number != 0){
				System.out.println(number); 
				tracker++; 
			}
			if (tracker == nums){
				break; 
			}
		}
	}
	
	
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
}

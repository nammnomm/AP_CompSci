/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    //Global Variables
    String model;
    double maxSpeed;
    boolean isElectric; 
    String color; 
    
    //Constructors
    public Car(){
        model = "Bus";
        maxSpeed = 1.1;
        isElectric = false; 
        color = "Blue & Red"; 
    }
    public Car(String m, double s, String c){
        model = m; 
        maxSpeed = s;
        isElectric = false; 
        color = c; 
    }
    //Methods
    public void paint(String c) {
        color = c; 
    }
    public void vroom(){
        int count = 0; 
        while(count < maxSpeed){
            System.out.println(model + " goes VROOOOM");
            count += 10; 
        }
    }
}

import java.util.*;

public class RunningAverage{
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;

    // There are no other instance variables.

    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(int count, double average){
        this.count = count;
        this.average = average; 
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        average = ((count*average) + newVal) / (count + 1)
        count++;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        int[] array = new int[num];
        int x = 0; 
        if (num>0){
            for (int i = 0; i < num; i++){
                array[i] = (int)(Math.random()*10); 
                if(i > 0){
                    x++; 
                }
            }
            
        }
        return x; 
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        return average; 
    }
}

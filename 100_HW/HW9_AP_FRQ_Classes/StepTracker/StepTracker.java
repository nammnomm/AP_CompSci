public class StepTracker {
    int min; 
    int active;
    int steps; 
    int days; 
    
    public StepTracker(int min){
        this.min = min; 
        active = 0; 
        steps = 0; 
        days = 0; 
    }
    public int activeDays(){
        return active; 
    }
    public double averageSteps(){
        return (double)steps/days; 
    }
    public void addDailySteps(int steps){
        this.steps += steps; 
        if (steps >= min){
            active++; 
        }
        days++; 
    }
}
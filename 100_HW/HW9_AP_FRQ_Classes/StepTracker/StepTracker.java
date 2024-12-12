public class StepTracker{
    int totalSteps;
    int days;
    int activeDays;
    public StepTracker(){
        totalSteps = 0;
        days = 0;
        activeDays = 0;
    }
    
    public StepTracker(int x,int y){
        totalSteps = x;
        days = y;
        if(x>=10000){
            activeDays++;
        }
    }
    
    public int averageSteps(){
        averageSteps = totalSteps/days;
        return averageSteps;
    }
    
    public int activeDays(){
        return activeDays;
    }
    
    public void addDailySteps(int a){
        process newRatings(a);
    }
}
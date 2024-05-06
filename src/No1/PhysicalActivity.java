package No1;

public class PhysicalActivity extends Activity {
    private int duration;
    private double caloriesBurned;

    public PhysicalActivity(String activityName, int duration, double caloriesBurned){
        super(activityName);
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    //method overloading to record physical activity with different parameters
    public void addActivity(int duration){
        this.duration = duration;
    }

    public void addActivity(int duration, double caloriesBurned){
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    // Getter methods
    public int getDuration() {
        return duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    // method to calculate calories burned
    public double calculateCaloriesBurned(double weight) {
        // simple callculation
        return (caloriesBurned * duration)/ weight;
    }

    // method overriding to calculate calories burned considering height n weight
    public double calculateCaloriesBurned(double weight, int height){
        // extending functionally by considering height
        return ((caloriesBurned * duration) / weight) * height;
    }
}

package No1;

public class HealthTrackerApp {
    public static void main(String[] args) {
        // Create a user
        User user = new User("John", 30);

        // Set user's health record
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setWeight(75.5);
        healthRecord.setHeight(175);
        healthRecord.setBloodPressure(120);

        // Record physical activities
        PhysicalActivity activity1 = new PhysicalActivity("Running", 30, 300.0);
        PhysicalActivity activity2 = new PhysicalActivity("Swimming", 45, 400.0);

        // Display user's information
        System.out.println("User Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());

        // Display user's health record
        System.out.println("\nHealth Record:");
        System.out.println("Weight: " + healthRecord.getWeight() + " kg");
        System.out.println("Height: " + healthRecord.getHeight() + " cm");
        System.out.println("Blood Pressure: " + healthRecord.getBloodPressure() + " mmHg");

        // Display recorded activities
        System.out.println("\nRecorded Activities:");
        displayPhysicalActivity(activity1, healthRecord);
        displayPhysicalActivity(activity2, healthRecord);
    }

    // Display physical activity details
    private static void displayPhysicalActivity(PhysicalActivity activity, HealthRecord healthRecord) {
        System.out.println("Activity Name: " + activity.getActivityName());
        System.out.println("Duration: " + activity.getDuration() + " minutes");
        System.out.println("Calories Burned: " + activity.getCaloriesBurned() + " kcal");
        System.out.println("Calories Burned (Considering Weight): " + activity.calculateCaloriesBurned(healthRecord.getWeight()) + " kcal");
        System.out.println("Calories Burned (Considering Weight and Height): " + activity.calculateCaloriesBurned(healthRecord.getWeight(), healthRecord.getHeight()) + " kcal");
        System.out.println();
    }

}

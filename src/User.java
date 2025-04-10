import java.util.ArrayList;

public class User {
    private int userID;
    private String naam;
    private int leeftijd;
    private int gewicht;
    private int height;
    private String email;
    private ArrayList<Meal> meal;

    public User(int userID, String naam, int leeftijd, int gewicht, int height, String email) {
        this.userID = userID;
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.height = height;
        this.email = email;
        this.meal = new ArrayList<>();
    }

    public void addMeal(Meal Meal) {
        meal.add(Meal);
    }

    public int getDailyCalories() {
        int totaal = 0;
        for (Meal Meal : meal) {
            totaal += Meal.getTotalCalories();
        }
        return totaal;
    }

    public int recommended() {
        return (int) (10 * gewicht + 6.25 * height - 5 * leeftijd + 500); // female default
    }

    public boolean isEatingEnough() {
        return getDailyCalories() >= recommended();
    }
}

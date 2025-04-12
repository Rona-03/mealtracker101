import java.util.ArrayList;

public class User {
    private String naam;
    private int leeftijd;
    private int gewicht;
    private int height;
    private String email;
    private ArrayList<Meal> meal;

    public User( String naam, int leeftijd, int gewicht, int height, String email) {
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
        for (Meal m : meal) {
            totaal += m.getTotalCalories();
        }
        return totaal;
    }

    public int recommended() {
        int recommended = (int) (10 * gewicht + 6.25 * height - 5 * leeftijd + 500);
        System.out.println("Aanbevolen dagelijkse calorie-inname: " + recommended + " calorieen");
        return recommended;
    }

    public void isEatingEnough() {
        int totaal = getDailyCalories();
        int aanbevolen = recommended();

        System.out.println("Totaal calorieen vandaag: " + totaal + " kcal");

        if (totaal >= aanbevolen) {
            System.out.println("Je hebt genoeg calorieen gegeten vandaag.");
        } else {
            System.out.println("Je hebt niet genoeg calorieen gegeten vandaag.");
        }
    }
}

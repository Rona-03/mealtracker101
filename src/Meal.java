import java.util.ArrayList;
import java.util.Date;

public abstract class Meal {
    protected int mealID;
    protected Date date;
    protected ArrayList<Eten> eten;

    public Meal(int mealID, Date date) {
        this.mealID = mealID;
        this.date = date;
        this.eten = new ArrayList<>();
    }

    public void addEten(Eten food) {
        eten.add(food);
    }

    public int getTotalCalories() {
        int totaal = 0;
        for (Eten food : eten) {
            totaal += food.getEtenCalorie();
        }
        System.out.println(getMealType() + " bevat in totaal: " + totaal + " kcal");
        for (Eten food : eten) {
            System.out.println("- " + food.getEtenNaam() + "("+ food.getEtenGewicht() + "gram)" + ": " + food.getEtenCalorie() + " calorieen");
        }
        return totaal;
    }

    public ArrayList<Eten> getEten() {
        return eten;
    }

    public abstract String getMealType();
}

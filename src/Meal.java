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
        return totaal;
    }

    public ArrayList<Eten> getEten() {
        return eten;
    }

    public abstract String getMealType();
}

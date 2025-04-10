import java.util.Date;

public class Diner extends Meal {
    public Diner(int mealID, Date date) {
        super(mealID, date);
    }

    @Override
    public String getMealType() {
        return "Diner";
    }
}

import java.util.Date;

public class Lunch extends Meal {
    public Lunch(int mealID, Date date) {
        super(mealID, date);
    }

    @Override
    public String getMealType() {
        return "Diner";
    }
}

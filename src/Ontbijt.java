import java.util.Date;

public class Ontbijt extends Meal {
    public Ontbijt(int mealID, Date date) {
        super(mealID, date);
    }

    @Override
    public String getMealType() {
        return "Ontbijt";
    }
}

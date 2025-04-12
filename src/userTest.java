import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class userTest {

    @Test
    public void testRecommendedCalories() {
        User user = new User("Maria", 30, 50, 160, "maria@hotmail.com");
        int expected = (int)(10 * 50 + 6.25 * 160 - 5 * 30 + 500);
        assertEquals(expected, user.recommended(), "Calorie berekening klopt niet.");
    }

    @Test
    public void testAddMeal() {
        User user = new User("Jane", 25, 60, 170, "jane@example.com");

        Ontbijt ontbijt = new Ontbijt(1, new Date());
        Eten appel = new Eten(1, "Appel", 52, 100);
        ontbijt.addEten(appel);

        user.addMeal(ontbijt);

        assertEquals(52, user.getDailyCalories(), "Calorieën na toevoegen van ontbijt kloppen niet.");
    }
}

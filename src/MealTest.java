import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MealTest {

    @Test
    public void testAddEtenAndTotalCalories() {
        Meal lunch = new Lunch(2, new Date());
        Eten kip = new Eten(4, "Kipfilet", 165, 100);
        Eten yoghurt = new Eten(5, "Yoghurt", 59, 100);

        lunch.addEten(kip);
        lunch.addEten(yoghurt);

        assertEquals(224, lunch.getTotalCalories());
        assertEquals(2, lunch.getEten().size());
    }

}

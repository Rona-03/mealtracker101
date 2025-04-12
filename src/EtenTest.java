import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtenTest {

    @Test
    public void testEtenGetters() {
        Eten chips = new Eten(6, "Chips", 536, 100);

        assertEquals(6, chips.getEtenID());
        assertEquals("Chips", chips.getEtenNaam());
        assertEquals(536, chips.getEtenCalorie());
    }


}

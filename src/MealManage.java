import java.util.*;

public class MealManage {
    private ArrayList<Eten> etenLijst;

    public MealManage(ArrayList<Eten> etenLijst) {
        this.etenLijst = etenLijst;
    }

    public Meal createMeal(Scanner scanner, String mealType) {
        System.out.println("\nWat heeft u gegeten voor " + mealType + "?");

        for (Eten food : etenLijst) {
            System.out.println(food.getEtenID() + ". " + food.getEtenNaam() + " - " + food.getEtenCalorie() + " kcal");
        }

        System.out.print("Kies een nummer voor uw " + mealType.toLowerCase() +
                " (meerdere keuzes mogelijk, scheid nummers met een komma): ");
        String input = scanner.nextLine();
        String[] selectedItems = input.split(",");

        Meal meal;
        switch (mealType) {
            case "Ontbijt":
                meal = new Ontbijt(1, new Date());
                break;
            case "Lunch":
                meal = new Lunch(2, new Date());
                break;
            case "Avondeten":
                meal = new Diner(3, new Date());
                break;
            default:
                throw new IllegalArgumentException("Onbekend maaltijdtype: " + mealType);
        }

        for (String itemID : selectedItems) {
            int itemIndex = Integer.parseInt(itemID.trim()) - 1;
            if (itemIndex >= 0 && itemIndex < etenLijst.size()) {
                meal.addEten(etenLijst.get(itemIndex));
            }
        }

        return meal;
    }
}

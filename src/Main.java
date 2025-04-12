import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Eten> etenLijst = new ArrayList<>(Arrays.asList(
                new Eten(1, "Broodje kaas", 497, 100),
                new Eten(2, "Aardbeien", 30, 100),
                new Eten(3, "Appel", 52, 100),
                new Eten(4, "Kipfilet", 165, 100),
                new Eten(5, "Yoghurt", 59, 100),
                new Eten(6, "Chips", 536, 100),
                new Eten(7, "Toast", 70, 100),
                new Eten(8, "Eieren", 150, 100)
        ));

        System.out.println("Welkom bij MealTracker101!");

        System.out.print("Wat is uw naam? ");
        String naam = scanner.nextLine();
        System.out.print("Wat is uw leeftijd? ");
        int leeftijd = scanner.nextInt();
        System.out.print("Wat is uw gewicht (in kg)? ");
        int gewicht = scanner.nextInt();
        System.out.print("Wat is uw lengte (in cm)? ");
        int lengte = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Wat is je e-mailadres? ");
        String email = scanner.nextLine();

        User gebruiker = new User(naam, leeftijd, gewicht, lengte, email);
        MealManage mealManager = new MealManage(etenLijst);

        gebruiker.recommended();

        gebruiker.addMeal(mealManager.createMeal(scanner, "Ontbijt"));
        gebruiker.addMeal(mealManager.createMeal(scanner, "Lunch"));
        gebruiker.addMeal(mealManager.createMeal(scanner, "Avondeten"));

        gebruiker.isEatingEnough();
    }
}

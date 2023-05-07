import java.util.List;

public class Menu {
    private static List<Drink> drinks;
    private static List<Meal> meals;

    public Menu(List<Drink> drinks, List<Meal> meals) {
        this.drinks = drinks;
        this.meals = meals;
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public static Meal getMeals() {
        Meal meal=new Meal("pizza",34);
        meals.add(getMeals());
        return meal;
    }
    public static Drink getDrink(){
        Drink drink=new Drink("wine",100);
        drinks.add(getDrink());
        return drink;
    }
}

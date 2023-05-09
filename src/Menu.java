import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Menu {
    private  List<Drink> drinks;
    private  List<Meal> meals;

    public Menu() {
    }

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

    public List<Meal> getMeals() {
        return this.meals;
    }
    public  List<Drink> getDrinks(){
        return this.drinks;
    }


}

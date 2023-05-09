import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(new ArrayList<>(), new ArrayList<>());
        System.out.println("\t1.Menu" + "\n\t2. Menu ya elave et " + "\n\t3. Sifaris");
        Meal meal = new Meal("kabab", 100);
        menu.addMeal(meal);
        Drink drink = new Drink("wine", 50);
        Drink drink2 = new Drink("cole", 25);
        menu.addDrink(drink);
        menu.addDrink(drink2);
        while (sc.hasNextInt()) {
            int secim = sc.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("1.Meals" + " " + "2.Drinks");
                    int sec = sc.nextInt();

                    if (sec == 1) {
                        System.out.println("Meals" + "       " + "Price");
                        menu.getMeals().forEach(meal1 -> System.out.println(meal1.getName() + "       " + meal1.getPrice()));
                    } else if (sec == 2) {
                        menu.getDrinks().forEach(drink1 -> System.out.println(drink1.getName() + "       " + drink1.getPrice()));
                    } else
                        System.out.println("duzgun deyil");

                    break;
                case 2:
                    Scanner input=new Scanner(System.in);
                    System.out.println("1.Meal"+"     "+"2.Drink");
                    int secc= input.nextInt();
                    if(secc==1) {
                        System.out.println("Meals");
                        String meall = input.nextLine();
                        System.out.println("price");
                        int prices = input.nextInt();
                        Meal meal1 = new Meal(meall, prices);
                        menu.addMeal(meal1);
                        System.out.println(meal1.getName() + "       " + meal1.getPrice());
                    }
                    else if(secc==2){
                        Scanner t=new Scanner(System.in);
                        System.out.println("Drink");
                        String drinkk=t.nextLine();
                        System.out.println("Price");
                        int pricess=t.nextInt();
                        Drink drink4=new Drink(drinkk,pricess);
                        menu.addDrink(drink4);
                        System.out.println(drink4.getName()+"       "+drink4.getPrice());
                    }
                    else
                        System.out.println("Duzgun deyil");
                    break;
                case 3:
                    Scanner tt=new Scanner(System.in);
                    System.out.println("1.Meals" + " " + "2.Drinks");
                    int sifar = sc.nextInt();

                    if (sifar == 1) {
                        menu.getMeals().forEach(meal1 -> System.out.println(meal1.getName() + "       " + meal1.getPrice()));

                    }
                    break;
                default:
                    System.out.println("Duzgun deyil");

            }
        }

    }
}
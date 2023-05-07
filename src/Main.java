import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("\t1.Menu"+ "\n\t2. Menu ya elave et "+"\n\t3. Sifaris");
        Scanner sc =new Scanner(System.in);
        int secim =sc.nextInt();

        switch(secim){
            case 1:
                Menu.getDrink();
                Menu.getMeals();
                break;
            case 2:
                System.out.println("w");
                break;
            case 3:
                System.out.println("s");
                break;
            default:
                System.out.println("Duzgun deyil");

        }
    }
}
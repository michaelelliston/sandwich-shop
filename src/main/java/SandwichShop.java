import java.util.Scanner;

public class SandwichShop {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;
        double basePrice = 0.00;
        double finalPrice = 0;
        double studentDiscount = 0.1;
        double seniorDiscount = 0.2;

        System.out.println("Welcome! Please select a size: \n1. Regular: Base price $5.45\n2. Large: Base price $8.95");
        String input = myScanner.nextLine();
        double sandwichSize = Double.parseDouble(input);

        if (sandwichSize == 1) {
            basePrice = regularSandwichPrice;
        }
        else if (sandwichSize == 2) {
            basePrice = largeSandwichPrice;
        }
        else System.err.println("Invalid selection.");

        System.out.println("Next, please input your age:");
        input = myScanner.nextLine();
        double customerAge = Float.parseFloat(input);

        if (customerAge < 18 && customerAge > 0) {
            finalPrice = basePrice - (basePrice * studentDiscount);
        }
        else if (customerAge >= 65) {
            finalPrice = basePrice - (basePrice * seniorDiscount);
        }
        else if (customerAge < 65 && customerAge >= 18) {
            finalPrice = basePrice;
        }
        else System.err.println("Invalid input.");

        System.out.printf("Thank you! The price of your sandwich is: $%.2f", finalPrice);
    }
}

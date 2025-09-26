import java.util.Scanner;

public class SandwichShop {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;
        double sandwichPrice = 0;
        double studentDiscount = 0.1;
        double seniorDiscount = 0.2;
        double loadedRegular = 1.00;
        double loadedLarge = 1.75;
        double loadedInput;

        System.out.println("Welcome! Please select a size: \n1. Regular: Base price $5.45\n2. Large: Base price $8.95");
        String input = myScanner.nextLine();
        double sandwichSize = Double.parseDouble(input);

        if (sandwichSize == 1) {
            sandwichPrice = regularSandwichPrice;
        } else if (sandwichSize == 2) {
            sandwichPrice = largeSandwichPrice;
        } else System.err.println("Invalid selection.");

        System.out.println("Would you like your sandwich to be loaded?\n1. Yes\n2. No");
        input = myScanner.nextLine();
        loadedInput = Double.parseDouble(input);
        if (loadedInput == 1 && sandwichSize == 1) {
            sandwichPrice = sandwichPrice + loadedRegular;
        } else if (loadedInput == 1 && sandwichSize == 2) {
            sandwichPrice = sandwichPrice + loadedLarge;
        }
        System.out.println("Next, please input your age:");
        input = myScanner.nextLine();
        double customerAge = Float.parseFloat(input);

        if (customerAge < 18 && customerAge > 0) {
            sandwichPrice = sandwichPrice - (sandwichPrice * studentDiscount);
        } else if (customerAge >= 65) {
            sandwichPrice = sandwichPrice - (sandwichPrice * seniorDiscount);
        } else if (customerAge < 65 && customerAge >= 18) { // Redundant? Better way to do this?
            sandwichPrice = sandwichPrice;
        } else System.err.println("Invalid input.");

        System.out.printf("Thank you! The price of your sandwich is: $%.2f", sandwichPrice);
    }
}

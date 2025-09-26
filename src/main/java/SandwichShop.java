import java.util.Scanner;

public class SandwichShop {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        double regularSandwichPrice = 5.45;
        double largeSandwichPrice = 8.95;
        double finalSandwichPrice = 0.00;
        double studentDiscount = 0.10;
        double seniorDiscount = 0.20;
        double loadedRegular = 1.00;
        double loadedLarge = 1.75;
        double loadedInput;

        System.out.println("Welcome! Please select a size: \n1. Regular: Base price $5.45\n2. Large: Base price $8.95");
        String input = myScanner.nextLine();
        double sandwichSize = Double.parseDouble(input);

        if (sandwichSize == 1) {
            finalSandwichPrice = regularSandwichPrice;
        } else if (sandwichSize == 2) {
            finalSandwichPrice = largeSandwichPrice;
        } else System.err.println("Invalid selection.");

        System.out.println("Would you like your sandwich to be loaded?\n1. Yes\n2. No");
        input = myScanner.nextLine();
        loadedInput = Double.parseDouble(input);
        if (loadedInput == 1 && sandwichSize == 1) {
            finalSandwichPrice = finalSandwichPrice + loadedRegular;
        } else if (loadedInput == 1 && sandwichSize == 2) {
            finalSandwichPrice = finalSandwichPrice + loadedLarge;
        }
        System.out.println("Next, please input your age:");
        input = myScanner.nextLine();
        double customerAge = Double.parseDouble(input);

        if (customerAge < 18 && customerAge > 0) {
            finalSandwichPrice = finalSandwichPrice - (finalSandwichPrice * studentDiscount);
        } else if (customerAge >= 65) {
            finalSandwichPrice = finalSandwichPrice - (finalSandwichPrice * seniorDiscount);
        } else if (customerAge < 65 && customerAge >= 18) { // Redundant? Better way to do this?
            finalSandwichPrice = finalSandwichPrice;
        } else System.err.println("Invalid input.");

        System.out.printf("Thank you! The price of your sandwich is: $%.2f", finalSandwichPrice);
    }
}

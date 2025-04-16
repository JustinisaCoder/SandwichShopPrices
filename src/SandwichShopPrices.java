import java.util.Scanner;

public class SandwichShopPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt user for sandwich size
        System.out.println("Welcome to SandwichShop!");
        System.out.print("Enter sandwich size (1 = Regular $5.45, 2 = Large $8.95): ");
        int size = scanner.nextInt();

        double basePrice;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size selected.");
            return;
        }

        // Step 2: Prompt user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10; // 10% discount
        } else if (age >= 65) {
            discount = 0.20; // 20% discount
        }

        // Step 3: Calculate and display final cost
        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("The cost of your sandwich is: $%.2f\n", finalPrice);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Dealers {
    private ArrayList<Dealer> dealerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void dealersMenu() {
        while (true) {
            System.out.println("\n--- Dealers Menu ---");
            System.out.println("1. View Existing Dealers");
            System.out.println("2. Create New Dealer");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewExistingDealers();
                    break;
                case 2:
                    createNewDealer();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void viewExistingDealers() {
        if (dealerList.isEmpty()) {
            System.out.println("No dealers available.");
            return;
        }

        for (int i = 0; i < dealerList.size(); i++) {
            System.out.println((i + 1) + ". " + dealerList.get(i).getName());
        }

        System.out.print("Select a dealer by number: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < dealerList.size()) {
            dealerList.get(index).dealerMenu();
        } else {
            System.out.println("Invalid dealer selection.");
        }
    }

    private void createNewDealer() {
        System.out.print("Enter dealer name: ");
        String name = scanner.nextLine();
        Dealer newDealer = new Dealer(name);
        dealerList.add(newDealer);
        System.out.println("New dealer created: " + name);
    }

    public static void main(String[] args) {
        Dealers dealers = new Dealers();
        dealers.dealersMenu();
    }
}
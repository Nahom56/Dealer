import java.util.Scanner;

public class Dealer {
    private String name;
    private Scanner scanner = new Scanner(System.in);

    public Dealer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void dealerMenu() {
        while (true) {
            System.out.println("\n--- Dealer Menu for " + name + " ---");
            System.out.println("1. View Dealer Name");
            System.out.println("2. Exit to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Dealer Name: " + name);
                    break;
                case 2:
                    return; // Exit to main menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
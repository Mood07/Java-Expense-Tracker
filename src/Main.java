import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ExpenseManager manager = new ExpenseManager();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("===================================");
        System.out.println("      💸 Expense Tracker App       ");
        System.out.println("===================================");

        while (running) {
            printMenu();
            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1:
                    handleAddExpense();
                    break;
                case 2:
                    manager.listAllExpenses();
                    break;
                case 3:
                    handleListByCategory();
                    break;
                case 4:
                    System.out.println("💰 Total Expense: $" + manager.getTotalExpense());
                    break;
                case 0:
                    running = false;
                    System.out.println("👋 Exiting...");
                    break;
                default:
                    System.out.println("⚠ Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--------- MENU ---------");
        System.out.println("1 - Add Expense");
        System.out.println("2 - List All Expenses");
        System.out.println("3 - List by Category");
        System.out.println("4 - Show Total Expense");
        System.out.println("0 - Exit");
        System.out.println("------------------------");
    }

    private static void handleAddExpense() {
        scanner.nextLine(); // buffer clear

        System.out.print("Expense title: ");
        String title = scanner.nextLine();

        double amount = readDouble("Amount: $");

        System.out.println("Select category:");
        for (Category c : Category.values()) {
            System.out.println("- " + c);
        }

        scanner.nextLine();
        System.out.print("Category: ");
        String cat = scanner.nextLine().toUpperCase();

        Category category;
        try {
            category = Category.valueOf(cat);
        } catch (IllegalArgumentException e) {
            category = Category.OTHER;
        }

        manager.addExpense(new Expense(title, amount, category));
    }

    private static void handleListByCategory() {
        scanner.nextLine();
        System.out.print("Enter category: ");
        String cat = scanner.nextLine().toUpperCase();

        Category category;
        try {
            category = Category.valueOf(cat);
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Invalid category.");
            return;
        }

        manager.listByCategory(category);
    }

    private static int readInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("⚠ Enter a valid integer.");
                scanner.nextLine();
            }
        }
    }

    private static double readDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("⚠ Enter a valid number.");
                scanner.nextLine();
            }
        }
    }
}

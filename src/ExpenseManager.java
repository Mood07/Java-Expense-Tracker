import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("✅ Expense added successfully.");
    }

    public void listAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("⚠ No expenses recorded.");
            return;
        }

        System.out.println("\n📋 Expense History:");
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public void listByCategory(Category category) {
        boolean found = false;

        System.out.println("\n🔎 Category: " + category);
        for (Expense e : expenses) {
            if (e.getCategory() == category) {
                System.out.println(e);
                found = true;
            }
        }

        if (!found) {
            System.out.println("⚠ No expenses found in this category.");
        }
    }
}

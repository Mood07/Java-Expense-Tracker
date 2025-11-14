import java.time.LocalDate;

public class Expense {

    private String title;
    private double amount;
    private Category category;
    private LocalDate date;

    public Expense(String title, double amount, Category category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.date = LocalDate.now(); // otomatik tarih
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "[" + date + "] " + title +
                " | Category: " + category +
                " | Amount: $" + amount;
    }
}

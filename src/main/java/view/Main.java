package view;

import controller.AppController;
import model.Income;
import model.Expense;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AppController controller = new AppController();

        // Add sample transactions
        Income salary = new Income(5000.00, "Salary", LocalDate.now());
        Expense rent = new Expense(1500.00, "Rent", LocalDate.now());

        controller.addTransaction(salary);
        controller.addTransaction(rent);

        // View all transactions
        System.out.println("All Transactions:");
        controller.viewAllTransactions().forEach(System.out::println);
    }
} 
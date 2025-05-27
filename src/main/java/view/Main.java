package view;

import controller.AppController;
import model.Income;
import model.Expense;
import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppController controller = new AppController();

        // Add sample transactions
        /*Income salary = new Income(5000.00, "Salary", LocalDate.now());
        Expense rent = new Expense(1500.00, "Rent", LocalDate.now());

        controller.addTransaction(salary);
        controller.addTransaction(rent);*/
        System.out.print("Type (income/expense): ");
        String type = scanner.nextLine();

        System.out.print("Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Category: ");
        String category = scanner.nextLine();

        System.out.print("Date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        controller.addTransaction(type, amount, category, date);

        // View all transactions
        System.out.println("All Transactions:");
        controller.viewAllTransactions().forEach(System.out::println);
    }
} 
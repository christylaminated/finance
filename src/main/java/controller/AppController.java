package controller;

import model.BudgetManager;
import model.Transaction;
import java.util.List;
import java.time.LocalDate;


public class AppController {
    private final BudgetManager budgetManager;

    public AppController() {
        this.budgetManager = new BudgetManager();
    }

    /*public void addTransaction(Transaction transaction) {
        budgetManager.addTransaction(transaction);
    }*/
    /*
    The version above: assumes you're passing in a ready made Transaction like new Income(...), but this means that
    View(Main) is doing model specific logic which breaks the MVC
     */
    public void addTransaction(String type, double amount, String category, LocalDate date){
        Transaction t;
        if (type.equalsIgnoreCase("income")){ //ignores uppercase or lowercase differences
            t = new model.Income(amount, category, date);
        } else if (type.equalsIgnoreCase("expense")){
            t = new model.Expense(amount, category, date);
        }
    }

    public List<Transaction> viewAllTransactions() {
        return budgetManager.getAllTransactions();
    }
} 
package model;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    private List<Transaction> transactions;

    public BudgetManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactions);
    }
} 
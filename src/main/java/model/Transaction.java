package model;

import java.time.LocalDate;

public abstract class Transaction {
    private double amount;
    private String category;
    private LocalDate date;

    public Transaction(double amount, String category, LocalDate date) {
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("%s: $%.2f - %s (%s)", 
            getClass().getSimpleName(), amount, category, date);
    }
} 
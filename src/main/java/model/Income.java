package model;

import java.time.LocalDate;

public class Income extends Transaction {
    public Income(double amount, String category, LocalDate date) {
        super(amount, category, date);
    }
} 
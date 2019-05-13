package com.codersbay.examples;

import java.time.LocalDate;

public class Visit {
    private Customer customer;
    private LocalDate date;
    private double serviceExpense;
    private double productExpense;

    public double computeTotalExpense() {
        return (serviceExpense + productExpense) * customer.getDiscount();
    }
}

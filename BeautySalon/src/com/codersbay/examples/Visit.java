package com.codersbay.examples;

import java.time.LocalDate;

public class Visit {
    private final Visitable location;
    private Customer customer;
    private LocalDate date;
    private double serviceExpense;
    private double productExpense;


    public Visit(Visitable location, Customer customer) {
        this.location = location;
        this.customer = customer;
        this.date = LocalDate.now();
    }

    public void addService(Service service) {
        serviceExpense += service.getCost();
    }

    public void addProduct(Product product) {
        productExpense += product.getCost();
    }

    public double computeTotalExpense() {
        return (serviceExpense + productExpense) * (1 - customer.getDiscount() - location.getDiscount());
    }

    public String getDescription() {
        return String.format("%s's visit to %s cost a total of EUR %.2f with %.2f customer discount and %.2f venue discount, resulting in EUR %.2f",
                customer, location, serviceExpense + productExpense, customer.getDiscount(), location.getDiscount(), computeTotalExpense());
    }

    public LocalDate getDate() {
        return date;
    }
}

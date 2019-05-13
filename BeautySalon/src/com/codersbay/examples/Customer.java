package com.codersbay.examples;

public class Customer {
    private String name;
    private Membership membership;
    private double individualDiscount;

    public Customer(String name) {
        this.name = name;
    }


    public Customer(String name, Membership membership) {
        this.name = name;
        this.membership = membership;
    }

    public double getDiscount() {
        double totalDiscount = individualDiscount;

        if (membership != null)
            totalDiscount += membership.getDiscount();

        return totalDiscount;
    }

    public Visit visit(Visitable visitable) {
        return new Visit(visitable, this);
    }

    @Override
    public String toString() {
        return name;
    }

    public void setIndividualDiscount(double individualDiscount) {
        this.individualDiscount = individualDiscount;
    }
}

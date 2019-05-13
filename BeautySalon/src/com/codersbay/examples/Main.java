package com.codersbay.examples;

public class Main {

    public static void main(String[] args) {
        //compute total amount of cost for a Visit
        Customer c1 = new Customer("Maxl", new GoldMembership());
        Customer c2 = new Customer("Franzl", new SilverMembership());
        Customer c3 = new Customer("Karli", new PremiumMembership());
        Customer c4 = new Customer("Erich");

        Visitable bs = new BeautySalon("Erika's Beauty and Nails");

        Visit visit = c1.visit(bs);
        visit.addProduct(new Product("Hair Gel", 15));
        visit.addService(new Service("Side Burns", 20));
        visit.addService(new Service("Eye Brows", 9));
        System.out.println(visit.getDescription());

        Visit visit2 = c2.visit(bs);
        visit2.addService(new Service("French Nails", 45));
        visit2.addService(new Service("Happy Ending", 150));
        visit2.addProduct(new Product("Artificial Nails", 49));
        c2.setIndividualDiscount(.03);
        System.out.println(visit2.getDescription());

        //...
    }
}

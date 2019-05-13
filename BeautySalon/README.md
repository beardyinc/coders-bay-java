# Coding Exercise "Customer Service Management System"

Implement a customer service software that can model different venues (e.g. beauty salons, hair dressers, coffee shops, etc), different rebate models (e.g. _none_, silver, gold, premium).
Additionally, each venue may grant a general discount (e.g. "start-of-the-week-discount",...) and each customer may also have a personal discount.

You should implement a system, that can compute the total gross cost, the total discount and the resulting actual price of a visit. Your data model should at least take the following aspects 
into account. 

- Customer:
    - `name`
    - `membership`
    - `individualDiscount`
    
- Visit: 
    - `location`: the venue, e.g. a hair dresser
    - `customer`: the associated customer, who actually visited the venue
    - `date`: timestamp of the visit
    - `totalServiceExpense`: the summed cost of all services
    - `totalProductExpense`: the summed cost of all products
    
- Visitable:
    - is an interface that must be implemented by all venues
    - has `getName()` and `getDiscount()` methods
    
- Membership
    - is an abstract base class, offering a `getDiscount()` method
    - concrete Membership types (e.g. _gold_) should be modeled as subclasses

- write a test program that generates at least 5 different customers, 3 different venues and "performs" 10 visits
- your test program should produce meaningful console output


## General requirements
- Business objects should never directly print to `System.out`
- all classes must override `toString()` 
- use abstract base classes and interfaces where applicable
- a commandline interface (CLI) is not necessary, but not forbidden :)
- public methods must be documented, except for getters and setters
- practice information hiding as rigorously as possible: all members _must_ be private, implement getters and - if you need them - setters.
- constructors should take all required attributes as parameters. Your business objects must never be in an invalid state.

package main.java.com.homework4;

public abstract class ElectronicProduct extends Product{

    public ElectronicProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    abstract double holdGuarantee();
}

package main.java.com.homework4.entity.products;

import main.java.com.homework4.entity.enums.AgeRestriction;
import main.java.com.homework4.entity.abstracts.ElectonicsProduct;
import main.java.com.homework4.execeptions.ProductException;

public class Appliance extends ElectonicsProduct {
    public Appliance(String name, double price, double quantity, double guaranteePeriod) throws ProductException {
        super(name, price, quantity, AgeRestriction.None, guaranteePeriod);
    }

    public Appliance(String name, double price, double quantity, AgeRestriction ageRestriction, double guaranteePeriod) throws ProductException {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() < 50) {
            return super.getPrice() * 1.05;
        }
        return super.getPrice();
    }
}


package main.java.com.homework4.entity.abstracts;

import main.java.com.homework4.entity.enums.AgeRestriction;

public abstract class ElectonicsProduct extends Product {
    private double guaranteePeriod;

    public ElectonicsProduct(String name, double price, double quantity, double guaranteePeriod) {
        if (guaranteePeriod < 0) {
            throw new IllegalArgumentException("Guarantee period not valid");
        }
        this.guaranteePeriod = guaranteePeriod;
    }

    public ElectonicsProduct(String name, double price, double quantity, AgeRestriction ageRestriction, double guaranteePeriod) {
        if (guaranteePeriod < 0) {
            throw new IllegalArgumentException("Guarantee period not valid");
        }
        this.guaranteePeriod = guaranteePeriod;
    }

    public double getGuaranteePeriod() {
        return guaranteePeriod;
    }
}

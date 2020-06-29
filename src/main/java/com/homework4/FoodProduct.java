package main.java.com.homework4;

import main.java.com.homework4.interfaces.Expirable;

import java.util.Date;

public class FoodProduct extends Product implements Expirable {
    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    @Override
    public double getPrice() {
        int b = getExpirationDate().compareTo(getDate());
        if (b > 15) {
            return getPrice() * 0.7;
        }
        return b;
    }

    @Override
    public Date getExpirationDate() {
        Date date = new Date();
        date.setTime(12451212L);
        return date;

    }

    public Date getDate() {
        return new Date();
    }
}

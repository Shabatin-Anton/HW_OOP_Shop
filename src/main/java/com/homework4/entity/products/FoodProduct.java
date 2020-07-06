package main.java.com.homework4.entity.products;

import main.java.com.homework4.entity.abstracts.Product;
import main.java.com.homework4.entity.enums.AgeRestriction;
import main.java.com.homework4.execeptions.ProductException;
import main.java.com.homework4.interfaces.Expirable;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

public class FoodProduct extends Product implements Expirable {

    private LocalDateTime expirationDate;

    public FoodProduct(String name, double price, double quantity) throws ProductException {
        super(name, price, quantity, AgeRestriction.None);
    }

    public FoodProduct(String name, double price, double quantity, AgeRestriction ageRestriction) throws ProductException {
        super(name, price, quantity, ageRestriction);
    }

    public FoodProduct(String name, double price, double quantity, LocalDateTime expirationDate) throws ProductException {
        super(name, price, quantity, AgeRestriction.None);
        this.expirationDate = expirationDate;
    }

    public FoodProduct(String name, double price, double quantity, AgeRestriction ageRestriction, LocalDateTime expirationDate) throws ProductException {
        super(name, price, quantity, ageRestriction);
        this.expirationDate = expirationDate;
    }

    @Override
    public double getPrice() {
        if (expirationDate != null) {
            if (DAYS.between(LocalDateTime.now(), expirationDate) <= 15) {
                return super.getPrice() * 0.7;
            }
        }
        return super.getPrice();
    }

    @Override
        public LocalDateTime getExpirationDate() {
        return expirationDate;
    }
}

package main.java.com.homework4.service;

import main.java.com.homework4.entity.clients.Customer;
import main.java.com.homework4.entity.abstracts.Product;
import main.java.com.homework4.entity.enums.AgeRestriction;
import main.java.com.homework4.entity.products.FoodProduct;
import main.java.com.homework4.execeptions.CustomerException;
import main.java.com.homework4.execeptions.ProductException;
import main.java.com.homework4.execeptions.PurchaseException;

import java.time.LocalDateTime;

public class PurchaseManager {
    public static void processPurchase(Customer customer, Product product) throws PurchaseException, CustomerException, ProductException {
        if (product instanceof FoodProduct) {
            if (((FoodProduct) product).getExpirationDate() != null) {
                if (((FoodProduct) product).getExpirationDate().isBefore(LocalDateTime.now())
                        || ((FoodProduct) product).getExpirationDate().isEqual(LocalDateTime.now())) {
                    throw new PurchaseException("Product has expired!");
                }
            }
        }
        if (customer.getAge() < 14 && product.getAgeRestriction() == AgeRestriction.Teenager) {
            throw new PurchaseException("Buyer does not have permission to purchase the given product");
        } else if (customer.getAge() < 18 && product.getAgeRestriction() == AgeRestriction.Adult) {
            throw new PurchaseException("Buyer does not have permission to purchase the given product");
        } else if (product.getQuantity() <= 0) {
            throw new PurchaseException("Product is out of stock!");
        } else if (product.getPrice() > customer.getBalance()) {
            throw new PurchaseException("Buyer does not have enough money!");
        } else {
            customer.setBalance(customer.getBalance() - product.getPrice());
            product.setQuantity(product.getQuantity() - 1);
            System.out.printf("** -- ** -- ** -- ** -- ** -- **\n" +
                    "Purchase complete! \n" +
                    "Customer Name: %s \n" +
                    "Product: %s\n" +
                    "Price: %s\n", customer.getName(), product.getName(), product.getPrice());
        }
    }
}

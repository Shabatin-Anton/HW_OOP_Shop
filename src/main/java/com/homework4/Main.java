package main.java.com.homework4;

import main.java.com.homework4.entity.abstracts.Product;
import main.java.com.homework4.entity.clients.Customer;
import main.java.com.homework4.entity.enums.AgeRestriction;
import main.java.com.homework4.entity.products.Appliance;
import main.java.com.homework4.entity.products.Computer;
import main.java.com.homework4.entity.products.FoodProduct;
import main.java.com.homework4.service.PurchaseManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Appliance appliance = new Appliance("Xaomi", 700, 100,12);
        Appliance appliance1 = new Appliance("Apple", 1000, 50, 12);
        Appliance appliance2 = new Appliance("Samsung", 900, 10, 12);

        List<Appliance> applianceList = new ArrayList<>();
        applianceList.add(appliance);
        applianceList.add(appliance1);
        applianceList.add(appliance2);

        for (Appliance i : applianceList) {
            System.out.println(i);
        }
        System.out.println("Guarantee for Phones: " + appliance.getGuaranteePeriod());

        Computer computer = new Computer("HP", 2000, 20, 24);
        Computer computer1 = new Computer("Asus", 1200, 30, 24);

        List<Computer> computers = new ArrayList<>();
        computers.add(computer);
        computers.add(computer1);

        for (Computer a : computers) {
            System.out.println(a);
        }
        System.out.println("Guarantee for Computers: " + computer.getGuaranteePeriod());

        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult);
        FoodProduct water = new FoodProduct("Borjomi", 2.3, 2000, AgeRestriction.Adult);
        FoodProduct beer = new FoodProduct("Blanche", 4.50, 1000, AgeRestriction.Adult);
        FoodProduct burger = new FoodProduct("Big Mac", 2.30, 200, AgeRestriction.None);
        FoodProduct snack = new FoodProduct("Lays", 2.5, 1223, AgeRestriction.Teenager);

        List<FoodProduct> foodProducts = new ArrayList<>();
        foodProducts.add(cigars);
        foodProducts.add(water);
        foodProducts.add(beer);
        foodProducts.add(burger);
        foodProducts.add(snack);

        for (FoodProduct z : foodProducts) {
            System.out.println(z);
        }

        Customer pecata = new Customer("Pecata", 17, 30.00);
        PurchaseManager.processPurchase(pecata, cigars);

        Customer gopeto = new Customer("Gopeto", 15, 100.44);
        PurchaseManager.processPurchase(gopeto, cigars);

        System.out.println(gopeto.toString());
        System.out.println(pecata.toString());
    }
}

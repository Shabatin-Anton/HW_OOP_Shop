package main.java.com.homework4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Appliance appliance = new Appliance("Xaomi", 700, 100, Product.AgeRestriction.NONE);
        Appliance appliance1 = new Appliance("Apple", 1000, 50, Product.AgeRestriction.ADULT);
        Appliance appliance2 = new Appliance("Samsung", 900, 10, Product.AgeRestriction.NONE);

        List<Appliance> applianceList = new ArrayList<>();
        applianceList.add(appliance);
        applianceList.add(appliance1);
        applianceList.add(appliance2);

        for (Appliance i : applianceList) {
            System.out.println(i);
        }
        System.out.println("Guarantee for Phones: " + appliance.getGuaranteeOfAppliance());

        Computer computer = new Computer("HP", 2000, 20, Product.AgeRestriction.ADULT);
        Computer computer1 = new Computer("Asus", 1200, 30, Product.AgeRestriction.TEENAGER);

        List<Computer> computers = new ArrayList<>();
        computers.add(computer);
        computers.add(computer1);

        for (Computer a : computers) {
            System.out.println(a);
        }
        System.out.println("Guarantee for Computers: " + computer.getGuaranteeOfComputer());

        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, Product.AgeRestriction.ADULT);
        FoodProduct water = new FoodProduct("Borjomi", 2.3, 2000, Product.AgeRestriction.NONE);
        FoodProduct beer = new FoodProduct("Blanche", 4.50, 1000, Product.AgeRestriction.ADULT);
        FoodProduct burger = new FoodProduct("Big Mac", 2.30, 200, Product.AgeRestriction.TEENAGER);
        FoodProduct snack = new FoodProduct("Lays",2.5,1223, Product.AgeRestriction.TEENAGER);

        List<FoodProduct> foodProducts = new ArrayList<>();
        foodProducts.add(cigars);
        foodProducts.add(water);
        foodProducts.add(beer);
        foodProducts.add(burger);
        foodProducts.add(snack);

        for (FoodProduct z : foodProducts) {
            System.out.println(z);
        }

        Customer pecata = new Customer("Pecata",17,30.00);
        PurchaseManager.processPurchase(cigars,pecata);

        Customer gopeto = new Customer("Gopeto",15,100.44);
        PurchaseManager.processPurchase(cigars,gopeto);

        System.out.println(gopeto.toString());
        System.out.println(pecata.toString());
    }
}

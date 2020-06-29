package main.java.com.homework4;

public class PurchaseManager {
    public static void processPurchase(Product product, Customer customer) throws Exception {
        if (customer.getBalance() != customer.getBalance() && product.getQuantity() < product.getQuantity()) {
            product.quantity--;
            customer.setBalance((int) (product.quantity * product.getPrice()));
        }

        try {
            if (product.quantity <= 0) {
                throw new Exception("Sorry, we haven't more");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            if (customer.getBalance() < product.getPrice()) {
                throw new Exception("You haven't enough money!");
            }
        } catch (Exception e2) {
            System.out.println(e2);
        }
        try {
            if (Product.AgeRestriction.TEENAGER.getValue() > customer.getAge()) {
                throw new Exception("You are a teenager!");
            }
        } catch (Exception e3) {
            System.out.println(e3 + " Sorry, you don't have permission to purchase this product.");
        }
    }
}

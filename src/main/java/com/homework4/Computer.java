package main.java.com.homework4;

public class Computer extends ElectronicProduct {
    private int guaranteeOfComputer = 24;
    private int countOfComputer;

    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    @Override
    public double holdGuarantee() {
        if (quantity >= 1000) {
            return getPrice() * 0.95;
        }
        return getPrice();
    }

    public int getGuaranteeOfComputer() {
        return guaranteeOfComputer;
    }

    public void setGuaranteeOfComputer(int guaranteeOfComputer) {
        this.guaranteeOfComputer = guaranteeOfComputer;
    }

    public int getCountOfComputer() {
        return countOfComputer;
    }

    public void setCountOfComputer(int countOfComputer) {
        this.countOfComputer = countOfComputer;
    }
}

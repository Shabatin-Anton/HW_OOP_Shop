package main.java.com.homework4;

public class Appliance extends ElectronicProduct {
    private int guaranteeOfAppliance = 6;
    private int countOfAppliance;

    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    @Override
    public double holdGuarantee() {
        if (countOfAppliance < 50) {
            return getPrice() / 1.05;
        }
        return getPrice();
    }

    public int getGuaranteeOfAppliance() {
        return guaranteeOfAppliance;
    }

    public void setGuaranteeOfAppliance(int guaranteeOfAppliance) {
        this.guaranteeOfAppliance = guaranteeOfAppliance;
    }

    public int getCountOfAppliance() {
        return countOfAppliance;
    }

    public void setCountOfAppliance(int countOfAppliance) {
        this.countOfAppliance = countOfAppliance;
    }
}


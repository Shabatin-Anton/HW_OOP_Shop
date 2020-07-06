package main.java.com.homework4.entity.clients;

import main.java.com.homework4.execeptions.CustomerException;

public class Customer {
    private String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance) throws CustomerException {
        if (name ==null || name.isBlank()){
            throw new CustomerException("Name cannot be empty");
        }
        if (age < 0) {
            throw new CustomerException("Age not valid");
        }
        if (balance < 0) {
            throw new CustomerException("Balance not valid");
        }
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomerException {
        if (name ==null || !name.isBlank()) {
            throw new CustomerException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws CustomerException {
        if (age < 0) {
            throw new CustomerException("Age not valid");
        }
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws CustomerException {
        if (balance < 0) {
            throw new CustomerException("Balance not valid");
        }
        this.balance = balance;
    }
}

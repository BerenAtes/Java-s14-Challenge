package com.workintech.burgerCompany;

import com.workintech.burgerCompany.Enums.BreadRoleType;
import com.workintech.burgerCompany.Enums.ChipsType;
import com.workintech.burgerCompany.Enums.DrinkType;

import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Addaliable {

    private String name;
    private String meat;
    private double price;
    private BreadRoleType breadRoleType;
    private Addition[] additions;


    public Hamburger(String name, String meat, double price, BreadRoleType breadRoleType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoleType = breadRoleType;
        this.additions=new Addition[4];
    }

    public Hamburger(String name, String meat, double price, BreadRoleType breadRollType, DrinkType drinkType, ChipsType chipsType) {
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public BreadRoleType getBreadRoleType() {
        return breadRoleType;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void addAddition(String name, double price) {
        for (int i = 0; i < additions.length; i++) {
            if (additions[i] == null) {
                additions[i] = new Addition(name, price);
                break;
            }
        }

    }

    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("Bread Roll Type: " + breadRoleType + "\n");
        for (Addition addition : additions) {
            if (addition != null) {
                builder.append("Addition Name: " + addition.getName() + "\n");
                builder.append("Addition Price: " + addition.getPrice() + "\n");
                price = price + addition.getPrice();
            }

        }
        System.out.println(builder);
        System.out.println("Total price: " + price);
        System.out.println("******************");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger hamburger = (Hamburger) o;
        return Objects.equals(name, hamburger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRoleType=" + breadRoleType +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }
}

package com.workintech.burgerCompany;

import com.workintech.burgerCompany.Enums.BreadRoleType;
import com.workintech.burgerCompany.Enums.ChipsType;
import com.workintech.burgerCompany.Enums.DrinkType;

public class DeluxeBurger extends Hamburger {

    private Drink drink;
    private Chips chips;
    public DeluxeBurger(Drink drink,Chips chips) {
        super("DELUXE", "az pişmiş",30.50, BreadRoleType.SANDWICH);
        this.drink=drink;
        this.chips=chips;
    }
    @Override
    public void addAddition(String name, double price) {
        System.out.println("\n Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("DRINK: " + drink.getDrinkType() + "\n");
        builder.append("CIPS: " + chips.getChipsType() + "\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }


}

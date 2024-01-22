import com.workintech.burgerCompany.*;
import com.workintech.burgerCompany.Enums.BreadRoleType;
import com.workintech.burgerCompany.Enums.ChipsType;
import com.workintech.burgerCompany.Enums.DrinkType;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Hamburger hamburger = new Hamburger("Basic","NORMAL",3.56, BreadRoleType.WRAP);
        hamburger.addAddition("Tomato", 0.27);
        hamburger.addAddition("Lettuce",0.75);
        hamburger.addAddition("Cheese",1.13);
        hamburger.addAddition("Pickle",0.25);
        hamburger.addAddition("Test",5);
        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger",5.67, BreadRoleType.SANDWICH);
        healthyBurger.addAddition("Egg",5.43);
        healthyBurger.itemizeHamburger();


        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.FANTA),new Chips(ChipsType.SMALL));
        db.addAddition("dummy",40);
        db.itemizeHamburger();

    }
    }
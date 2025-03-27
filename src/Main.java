//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("large");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 2 );
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("cheese", "bacon", "mayo");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("Cheese", "Bacon", "Mayo");
//        regularMeal.setDrinkSize("Large");
//        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "fanta", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "Cheese", "Kechup");
        secondMeal.setDrinkSize("Small");
        secondMeal.printItemizedList();
    }
}
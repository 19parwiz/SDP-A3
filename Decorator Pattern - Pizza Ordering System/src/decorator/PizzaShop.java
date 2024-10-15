package decorator;

public class PizzaShop {
    public static void main(String[] args) {
        // Create a basic Margherita Pizza
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add cheese topping
        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add mushrooms topping
        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        // Add pepperoni topping
        pizza = new PepperoniTopping(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());
    }
}

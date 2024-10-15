package decorator;

public class VegetarianPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    @Override
    public double getCost() {
        return 9.00; // Base cost of Vegetarian Pizza
    }
}

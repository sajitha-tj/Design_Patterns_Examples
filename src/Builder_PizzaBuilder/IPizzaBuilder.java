package Builder_PizzaBuilder;

public interface IPizzaBuilder {
    PizzaBuilder reset();
    PizzaBuilder setType(String type);
    PizzaBuilder setSize(String size);
    PizzaBuilder setCrust(String crust);
    PizzaBuilder addCheese(boolean cheese);
    PizzaBuilder addPepperoni(boolean pepperoni);
    PizzaBuilder addBacon(boolean bacon);
    PizzaBuilder addPineapple(boolean pineapple);
    PizzaBuilder addChicken(boolean chicken);
    PizzaBuilder addSausage(boolean sausage);
    Pizza build();
}

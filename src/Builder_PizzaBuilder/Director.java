package Builder_PizzaBuilder;

public class Director {
    private PizzaBuilder pizzaBuilder;

    public Director(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void makeMediumCheesePizza(){
        pizzaBuilder.reset()
                .setSize("medium")
                .addCheese(true);
    }

    public void makeLargeMeatLoversPizza(){
        pizzaBuilder.reset()
                .setSize("large")
                .addCheese(true)
                .addPepperoni(true)
                .addBacon(true)
                .addSausage(true)
                .addChicken(true);
    }

    public void makeSmallVegetarianPizza(){
        pizzaBuilder.reset()
                .setSize("small")
                .addCheese(true)
                .addPineapple(true);
    }

    public void makeLargeSupremePizza(){
        pizzaBuilder.reset()
                .setSize("large")
                .addCheese(true)
                .addPepperoni(true)
                .addBacon(true)
                .addSausage(true)
                .addChicken(true)
                .addPineapple(true);
    }

    public void makeMediumHawaiianPizza(){
        pizzaBuilder.reset()
                .setSize("medium")
                .addCheese(true)
                .addPineapple(true);
    }
}

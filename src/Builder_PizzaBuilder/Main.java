package Builder_PizzaBuilder;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza myCustomPizza = new PizzaBuilder().setSize("Large").addCheese(true).addPepperoni(true).addChicken(true).build();
        System.out.println(myCustomPizza);

        Director director = new Director(pizzaBuilder);

        director.makeMediumCheesePizza();
        Pizza mediumCheesePizza = pizzaBuilder.build();
        System.out.println(mediumCheesePizza);

        director.makeMediumHawaiianPizza();
        Pizza largeMeatLoversPizza = pizzaBuilder.build();
        System.out.println(largeMeatLoversPizza);

        director.makeSmallVegetarianPizza();
        Pizza smallVegetarianPizza = pizzaBuilder.build();
        System.out.println(smallVegetarianPizza);

    }
}

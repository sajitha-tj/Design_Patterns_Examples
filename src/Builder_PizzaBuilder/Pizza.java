package Builder_PizzaBuilder;

public class Pizza {
    private final String type;
    private final String size;
    private final String crust;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;
    private final boolean pineapple;
    private final boolean chicken;
    private final boolean sausage;

    public Pizza(PizzaBuilder pizzaBuilder){
        this.type = pizzaBuilder.getType();
        this.size = pizzaBuilder.getSize();
        this.crust = pizzaBuilder.getCrust();
        this.cheese = pizzaBuilder.isCheese();
        this.pepperoni = pizzaBuilder.isPepperoni();
        this.bacon = pizzaBuilder.isBacon();
        this.pineapple = pizzaBuilder.isPineapple();
        this.chicken = pizzaBuilder.isChicken();
        this.sausage = pizzaBuilder.isSausage();
    }

    @Override
    public String toString(){
        return "Pizza{" + "type=" + type + ", size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", bacon=" + bacon + ", pineapple=" + pineapple + ", chicken=" + chicken + ", sausage=" + sausage + '}';
    }

}

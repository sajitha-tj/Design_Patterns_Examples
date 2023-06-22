package Builder_PizzaBuilder;

public class PizzaBuilder implements IPizzaBuilder{
    private String type;
    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean pineapple;
    private boolean chicken;
    private boolean sausage;

    public PizzaBuilder(){
        this.type = "Regular";
        this.size = "Medium";
        this.crust = "Thin";
        this.cheese = false;
        this.pepperoni = false;
        this.bacon = false;
        this.pineapple = false;
        this.chicken = false;
        this.sausage = false;
    }

    public PizzaBuilder reset(){
        this.type = "Regular";
        this.size = "Medium";
        this.crust = "Thin";
        this.cheese = false;
        this.pepperoni = false;
        this.bacon = false;
        this.pineapple = false;
        this.chicken = false;
        this.sausage = false;
        return this;
    }
    @Override
    public PizzaBuilder setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder addCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder addPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    @Override
    public PizzaBuilder addBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    @Override
    public PizzaBuilder addPineapple(boolean pineapple) {
        this.pineapple = pineapple;
        return this;
    }

    @Override
    public PizzaBuilder addChicken(boolean chicken) {
        this.chicken = chicken;
        return this;
    }

    @Override
    public PizzaBuilder addSausage(boolean sausage) {
        this.sausage = sausage;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(this);
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public boolean isChicken() {
        return chicken;
    }

    public boolean isSausage() {
        return sausage;
    }
}

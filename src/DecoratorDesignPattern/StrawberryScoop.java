package DecoratorDesignPattern;

public class StrawberryScoop implements IceCream{

    private IceCream iceCream;

    public StrawberryScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Strawberry Scoop";
    }
}

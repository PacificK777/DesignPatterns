package DecoratorDesignPattern;

public class ChocolateCone implements IceCream {
    //chocolateCone can behave as a base as well as addon
    private IceCream iceCream;

    public ChocolateCone() {

    }

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (iceCream != null) {
            return iceCream.getDescription() + " + Chocolate Cone";
        }
        return "Chocolate Cone";
    }
}

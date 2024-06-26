package DecoratorDesignPattern;

public class ChocoChips implements IceCream{

    private IceCream iceCream;

    public ChocoChips(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 5;
        }
        return 0; // as this cannot be base
    }

    @Override
    public String getDescription() {
            return iceCream.getDescription()+ " + Choco Chips";
    }
}
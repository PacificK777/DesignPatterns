package DecoratorDesignPattern;

public class OrangeCone implements IceCream{
    //OrangeCone will only behave like a base
    // This class will act as strictly base
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}

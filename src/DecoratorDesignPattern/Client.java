package DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {

        //OrangeCone -> ChocoChips -> ChocolateCone -> StrawberryScoop -> VanillaScoop -> Cherry

        IceCream iceCream =
                new Cherry(
                        new VanillaScoop(
                                new StrawberryScoop(
                                        new ChocolateCone(
                                                new ChocoChips(
                                                        new OrangeCone()
                                                )
                                        )
                                )
                        )
                );
        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());

//        USE OF ABOVE METHOD IS ADVISED AS IT DOES NOT REPEAT THE SAME TERM "iceCream1" AGAIN AND AGAIN

//        Although both the methods are correct

//        IceCream iceCream1 = new OrangeCone();
//                 iceCream1 = new ChocoChips(iceCream1);
//                 iceCream1 = new ChocolateCone(iceCream1);
//                 iceCream1 = new StrawberryScoop(iceCream1);
//                 iceCream1 = new VanillaScoop(iceCream1);
//                 iceCream1 = new Cherry(iceCream1);
//
//
//        System.out.println(iceCream1.getCost());
//        System.out.println(iceCream1.getDescription());
    }
}

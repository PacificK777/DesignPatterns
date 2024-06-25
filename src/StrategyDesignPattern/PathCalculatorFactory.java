package StrategyDesignPattern;

public class PathCalculatorFactory {
    //TO avoid creating objects again and again
    private static final BikePathCalculator bikePathCalculator = new BikePathCalculator();
    private static final CarPathCalculator carPathCalculator = new CarPathCalculator();
    private static final WalkPathCalculator walkPathCalculator = new WalkPathCalculator();

    public static PathCalculatorStrategy getPathCalculatorForMode(TransportMode mode){
        if(mode == TransportMode.BIKE){
            return bikePathCalculator;
        }
        else if(mode ==TransportMode.CAR){
            return carPathCalculator;
        }
        else {
            return walkPathCalculator;
        }
    }
}

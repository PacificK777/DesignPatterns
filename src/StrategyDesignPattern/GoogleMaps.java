package StrategyDesignPattern;

public class GoogleMaps {
    public void findPath(String from, String to, TransportMode mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStrategy.findPath(from,to);
    }
}

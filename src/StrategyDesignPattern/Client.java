package StrategyDesignPattern;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Delhi","Lucknow", TransportMode.CAR);
    }
}

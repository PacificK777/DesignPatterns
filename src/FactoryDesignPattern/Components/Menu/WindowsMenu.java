package FactoryDesignPattern.Components.Menu;

public class WindowsMenu implements Menu {
    @Override
    public void showMenu() {
        System.out.println("Showing Windows Menu");
    }
}

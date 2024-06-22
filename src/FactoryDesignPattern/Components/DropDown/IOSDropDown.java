package FactoryDesignPattern.Components.DropDown;

public class IOSDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing IOS Dropdown");
    }
}

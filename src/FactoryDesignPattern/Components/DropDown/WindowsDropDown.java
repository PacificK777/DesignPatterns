package FactoryDesignPattern.Components.DropDown;

public class WindowsDropDown implements DropDown {
    @Override
    public void showDropDown() {
        System.out.println("Showing Windows Dropdown");
    }
}

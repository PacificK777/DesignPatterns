package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.Button.WindowsButton;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.DropDown.WindowsDropDown;
import FactoryDesignPattern.Components.Menu.Menu;
import FactoryDesignPattern.Components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}

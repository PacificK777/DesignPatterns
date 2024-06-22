package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.AndroidButton;
import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.DropDown.AndroidDropDown;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.Menu.AndroidMenu;
import FactoryDesignPattern.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}

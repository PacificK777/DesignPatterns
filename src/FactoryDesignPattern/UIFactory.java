package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.Menu.Menu;

public interface UIFactory {
    //Factory Methods
    Button createButton();

    Menu createMenu();

    DropDown createDropDown();

}

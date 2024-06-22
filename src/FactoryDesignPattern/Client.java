package FactoryDesignPattern;

import FactoryDesignPattern.Components.Button.Button;
import FactoryDesignPattern.Components.DropDown.DropDown;
import FactoryDesignPattern.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(SupportedPlatforms.WINDOWS);

        Button button = uiFactory.createButton();
        button.clickButton();

        DropDown dropDown = uiFactory.createDropDown();
        dropDown.showDropDown();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}

package FactoryDesignPattern;

public class Flutter {
    private String platform;

    //Non factory Method

    void refreshUI() {
        System.out.println("Refreshing UI");
    }

    void setTheme() {
        System.out.println("Set Theme");
    }

    public UIFactory getUIFactory(SupportedPlatforms platform) {
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}

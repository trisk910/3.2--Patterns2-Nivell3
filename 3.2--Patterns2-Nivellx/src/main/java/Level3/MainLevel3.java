package Level3;

import Level3.Presentation.MenuManager;
import Level3.Presentation.UIController;

public class MainLevel3 {
    public static void main(String[] args) {
        MenuManager menu = new MenuManager();
        UIController uiController = new UIController(menu);
        uiController.start();
    }
}

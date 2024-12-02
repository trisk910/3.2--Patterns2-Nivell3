package Level1;
import Level1.Presentation.MainMenu;
import Level1.Presentation.UIController;

public class MainLevel1 {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        UIController uiController = new UIController(mainMenu);
        uiController.start();
    }
}
package Level1.Presentation;

import Level1.Bussiness.Builders.PizzaHawaianBuilder;
import Level1.Bussiness.Builders.PizzaVeggieBuilder;
import Level1.Bussiness.Pizza;
import Level1.Bussiness.PizzaMaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UIController {
    private MainMenu menu;
    private List<Pizza> pizzas = new ArrayList<>();
    private static final String[] typePizza = {"Hawaian", "Veggie"};
    private static final String invalidMenu = "Invalid option";
    private Scanner scan = new Scanner(System.in);

    public UIController(MainMenu menu) {
        this.menu = menu;
    }
    private void displayPizzas() {
        for(int i = 0; i < typePizza.length; i++) {
            System.out.println(i + 1 + ". " + typePizza[i]);
        }
    }

    public void start(){
        int option = menu.showMainMenu();
       do{
            switch(option){
                case 1:
                    createPizza();
                    break;
                case 2:
                    if (pizzas.size() > 0){
                        for (Pizza pizza : pizzas){
                            System.out.println(pizza);
                        }
                    } else {
                        System.out.println("There is no pizzas");
                    }
                    break;
                default:
                    System.out.println(invalidMenu);
            }
            option = menu.showMainMenu();
        } while(option != 3);
    }

    public void createPizza(){
        System.out.println("Select the type of pizza");
        displayPizzas();
        System.out.print("> ");

        int option = scan.nextInt();
        scan.nextLine();
        switch (option){
            case 1:
                createPizza(1);
                break;
            case 2:
                createPizza(2);
                break;
            default:
                System.out.println(invalidMenu);
        }
    }

    private void createPizza(int type){
        System.out.println("Enter the size of the pizza");
        System.out.print("> ");
        float size = scan.nextFloat();
        scan.nextLine();
        System.out.println("Enter the dough of the pizza(thin/thick)");
        System.out.print("> ");
        String dough = scan.nextLine();
        System.out.println("Enter the toppings of the pizza(separated by commas)");
        System.out.print("> ");
        String toppings = scan.nextLine();
        ArrayList<String> toppingsList = getToppings(toppings);
        if (type == 1){
            createHawaianPizza(size, dough, toppingsList);
        } else {
            createVeggiePizza(size, dough, toppingsList);
        }
    }

    private ArrayList<String> getToppings(String toppings) {
        String[] toppingsArray = toppings.split(",");
        ArrayList<String> toppingsList = new ArrayList<>();
        toppingsList.addAll(Arrays.asList(toppingsArray));
        return toppingsList;
    }

    private void createVeggiePizza(float size, String dough, ArrayList<String> toppingsList) {
        PizzaVeggieBuilder veggieBuilder = new PizzaVeggieBuilder();
        PizzaMaster mestrePizzer = new PizzaMaster(veggieBuilder);
        Pizza pizza = mestrePizzer.constructPizza(size, dough, toppingsList);
        pizzas.add(pizza);
    }

    private void createHawaianPizza(float size, String dough, ArrayList<String> toppingsList) {
        PizzaHawaianBuilder hawaiianBuilder = new PizzaHawaianBuilder();
        PizzaMaster mestrePizzer = new PizzaMaster(hawaiianBuilder);
        Pizza pizza = mestrePizzer.constructPizza(size, dough, toppingsList);
        pizzas.add(pizza);
    }
}

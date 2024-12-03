package Level2;

import Level2.Bussiness.StockAgency;
import Level2.Bussiness.StockAgent;

import java.util.Scanner;

public class MainLevel2 {
    public static void main(String[] args) {
        StockAgent stockAgent = new StockAgent();

        StockAgency agency1 = new StockAgency("Agency 1");
        StockAgency agency2 = new StockAgency("Agency 2");

        stockAgent.addObserver(agency1);
        stockAgent.addObserver(agency2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter stock value: ");
        float stockValue = scanner.nextFloat();
        stockAgent.setStockValue(stockValue);
        System.out.print("Enter a new stock value: ");
        float newStockValue = scanner.nextFloat();
        stockAgent.setStockValue(newStockValue);
    }
}
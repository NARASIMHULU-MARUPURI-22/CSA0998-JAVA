import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class minip{

    public static void printMenu() {
        System.out.println("\n 1. Add stock");
        System.out.println("2. Remove stock");
        System.out.println("3. View stock");
        System.out.println("4. update the quantity or price of an existing stock.");
        System.out.println("5. to calculate and display the total value of all stocks.");
        System.out.println("6. to sort the list of stocks by name or price.");
        System.out.println("7. to Search for a stock by name");
        System.out.println("8. to Display stocks with quantity below a threshold");
        System.out.println("9. to Export stock data to a file");
        System.out.println("10. to Calculate total value of a specific stock");
        System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create an empty arraylist to hold the stocks
        ArrayList<Stock> stocks = new ArrayList<>();

        // display the menu and ask for user input
        int choice;
        mainLoop: do {
            printMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // ask for stock details
                    System.out.print("Enter the stock name: ");
                    String name = input.next();
                    System.out.print("Enter the stock quantity: ");
                    int quantity = input.nextInt();
                    System.out.print("Enter the stock price: ");
                    double price = input.nextDouble();
                    // Add this code after reading user input for quantity and price
                    if (quantity <= 0 || price <= 0) {
                        System.out.println("Quantity and price must be greater than 0");
                        continue; // Restart the loop to allow the user to enter valid values
                    }


                    // create a new Stock object and add it to the arraylist
                    Stock newStock = new Stock(name, quantity, price);
                    stocks.add(newStock);

                    System.out.println("Stock added successfully");
                    break;

                case 2:
                    // ask for the stock name and quantity to remove
                    System.out.print("Enter the stock name: ");
                    String stockName = input.next();
                    System.out.print("Enter the quantity to remove: ");
                    int removeQuantity = input.nextInt();

                    // loop through the stocks to find the matching stock
                    boolean stockFound = false;
                    for (Stock stock : stocks) {
                        if (stock.getName().equals(stockName)) {
                            // if the stock is found, remove the specified quantity
                            stockFound = true;
                            stock.removeQuantity(removeQuantity);
                            System.out.println("Stock removed successfully");
                            break;
                        }
                    }
                    if (!stockFound) {
                        System.out.println("Stock not found");
                    }
                    break;

                case 3:
                    // display the list of stocks
                    System.out.println("Current stocks:");
                    for (Stock stock : stocks) {
                        System.out.println(stock.toString());
                    }
                    break;
                case 4:
                    // Update stock information
                    System.out.print("Enter the stock name to update: ");
                    String updateStockName = input.next();

                    for (Stock stock : stocks) {
                        if (stock.getName().equals(updateStockName)) {
                            System.out.println("1. Update quantity");
                            System.out.println("2. Update price");
                            System.out.print("Enter your choice: ");
                            int updateChoice = input.nextInt();

                            switch (updateChoice) {
                                case 1:
                                    System.out.print("Enter the new quantity: ");
                                    int newQuantity = input.nextInt();
                                    stock.setQuantity(newQuantity);
                                    System.out.println("Quantity updated successfully");
                                    break;

                                case 2:
                                    System.out.print("Enter the new price: ");
                                    double newPrice = input.nextDouble();
                                    stock.setPrice(newPrice);
                                    System.out.println("Price updated successfully");
                                    break;

                                default:
                                    System.out.println("Invalid choice for update");
                                    break;
                            }
                            break;
                        }
                    }
                    break;
                case 5:
                    // Calculate total value of stocks
                    double totalValue = 0;
                    for (Stock stock : stocks) {
                        totalValue += stock.getQuantity() * stock.getPrice();
                    }
                    System.out.println("Total value of all stocks: $" + totalValue);
                    break;
                case 6:
                    // Sort stocks
                    System.out.println("1. Sort by name");
                    System.out.println("2. Sort by price");
                    System.out.print("Enter your choice: ");
                    int sortChoice = input.nextInt();

                    switch (sortChoice) {
                        case 1:
                            stocks.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
                            break;

                        case 2:
                            stocks.sort(Comparator.comparingDouble(Stock::getPrice));
                            break;

                        default:
                            System.out.println("Invalid choice for sorting");
                            break;
                    }
                    System.out.println("Stocks sorted successfully");
                    break;
                case 7:
                    // Search for a stock by name
                    System.out.print("Enter the stock name to search: ");
                    String searchStockName = input.next();
                    boolean stockFoun = false;
                    for (Stock stock : stocks) {
                        if (stock.getName().equalsIgnoreCase(searchStockName)) {
                            System.out.println("Stock found: " + stock.toString());
                            stockFoun = true;
                            break;
                        }
                    }
                    if (!stockFoun) {
                        System.out.println("Stock not found");
                    }
                    break;
                case 8:
                    // Display stocks with quantity below a threshold
                    System.out.print("Enter the threshold quantity: ");
                    int thresholdQuantity = input.nextInt();
                    System.out.println("Stocks with quantity below " + thresholdQuantity + ":");
                    boolean lowStockFound = false;
                    for (Stock stock : stocks) {
                        if (stock.getQuantity() < thresholdQuantity) {
                            System.out.println(stock.toString());
                            lowStockFound = true;
                        }
                    }
                    if (!lowStockFound) {
                        System.out.println("No stocks with quantity below " + thresholdQuantity);
                    }
                    break;
                case 9:
                    // Export stock data to a file
                    System.out.print("Enter the filename to export (e.g., stocks.csv): ");
                    String filename = input.next();
                    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                        for (Stock stock : stocks) {
                            writer.println(stock.getName() + "," + stock.getQuantity() + "," + stock.getPrice());
                        }
                        System.out.println("Stock data exported to " + filename);
                    } catch (IOException e) {
                        System.out.println("Error exporting stock data: " + e.getMessage());
                    }
                    break;
                case 10:
                    // Calculate total value of a specific stock
                    System.out.print("Enter the stock name to calculate total value: ");
                    String calculateStockName = input.next();
                    double totalValueOfStock = 0;
                    boolean stockFoundForCalculation = false;
                    for (Stock stock : stocks) {
                        if (stock.getName().equalsIgnoreCase(calculateStockName)) {
                            totalValueOfStock = stock.getQuantity() * stock.getPrice();
                            System.out.println("Total value of " + calculateStockName + ": $" + totalValueOfStock);
                            stockFoundForCalculation = true;
                            break;
                        }
                    }
                    if (!stockFoundForCalculation) {
                        System.out.println("Stock not found for calculation");
                    }
                    break;

                case 11:
                    System.out.print("Are you sure you want to exit? (yes/no): ");
                    String exitConfirmation = input.next().toLowerCase();
                    if (exitConfirmation.equals("yes")) {
                        System.out.println("Exiting the program...");
                        break mainLoop;
                    } else if (exitConfirmation.equals("no")) {
                        // Continue the loop to display the menu again
                        continue;
                    } else {
                        System.out.println("Invalid response. Please enter 'yes' or 'no'.");
                        // Continue the loop to display the menu again
                        break;
                    }

                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }

        } while (true);


        input.close();
    }
}

class Stock {
    private String name;
    private int quantity;
    private double price;

    public Stock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void removeQuantity(int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            quantity -= quantityToRemove;
        } else {
            System.out.println("Not enough quantity to remove");
        }
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

        public String toString() {
        return name + ",quantity:  " + quantity + ", price: $" + price;
    }
}

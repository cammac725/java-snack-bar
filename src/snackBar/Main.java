package snackBar;

import java.text.DecimalFormat;

public class Main
{
 
  public static void main(String[] args)
  {

    DecimalFormat df = new DecimalFormat("$###,###,00");

    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, food.getId(), food.getName());
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId(), food.getName());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId(), food.getName());
    Snack soda = new Snack("Soda", 24, 2.50, drink.getId(), drink.getName());
    Snack water = new Snack("Water", 20, 2.75, drink.getId(), drink.getName());

    //interactions
    System.out.println("Customer 1 buys 3 of snack 4. Print Customer1 cash on hand. Print quantity of snack 4");
    VendingMachine.buy(jane, soda, 3);
    System.out.println("Jane's cash on hand: " + jane.getCashOnHand());
    System.out.println("Quantity of soda left in drink machine: " + soda.getQuantity());
    
    System.out.println("\nCustomer 1 (Jane) buys 1 of snack 3 (Pretzel). Print Customer 1 (Jane) Cash on hand. Print quantity of snack 3 (Pretzel).");
    VendingMachine.buy(jane, pretzel, 1);
    System.out.println("Jane's cash on hand: " + jane.getCashOnHand());
    System.out.println("Quantity of pretzels left in food machine: " + pretzel.getQuantity());

    System.out.println("\nCustomer 2 (Bob) buys 2 of snack 4 (Soda). Print Customer 2 (Bob) Cash on Hand. Print quantity of snack 4 (Soda)");
    VendingMachine.buy(bob, soda, 2);
    System.out.println("Bob's cash on hand: " + bob.getCashOnHand());
    System.out.println("Quantity of soda left in drink machine: " + soda.getQuantity());

    System.out.println("\nCustomer 1 (Jane) finds $10. Print Customer 1 (Jane) Cash on Hand.");
    jane.addCash(10.00);
    System.out.println("Jane's cash on hand: " + jane.getCashOnHand());

    System.out.println("\nCustomer 1 (Jane) buys 1 of snack 2 (Chocolate Bar). Print Customer 1 (Jane) Cash on Hand. Print quantity of snack 2 (Chocolate Bar)");
    VendingMachine.buy(jane, chocolateBar, 1);
    System.out.println("Jane's cash on hand: " + jane.getCashOnHand());
    System.out.println("Quantity of chocolate bars left in machine: " + chocolateBar.getQuantity());

    System.out.println("\nAdd 12 more items to snack 3 (Pretzel). Print quantity of snack 3 (Pretzel)");
    pretzel.addQuantity(12);
    System.out.println("Quantity of pretzels left in machine: " + pretzel.getQuantity());

    System.out.println("\nCustomer 2 (Bob) buys 3 of snack 3 (Pretzel). Print Customer 2 (Bob) Cash on hand. Print quantity of snack 3 (Pretzel)");
    VendingMachine.buy(bob, pretzel, 3);
    System.out.println("Bob's cash on hand: " + bob.getCashOnHand());
    System.out.println("Quantity of pretzels left in machine: " + pretzel.getQuantity());

    Snack[] snacks = new Snack[]{chips, chocolateBar, pretzel, soda, water};
    for (int i = 1; i < snacks.length; i++)
    {
      System.out.println(snacks[i].toString());
    }
  }
}
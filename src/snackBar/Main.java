package snackBar;

public class Main
{
 
  public static void main(String[] args)
  {
    Customer cust1 = new Customer("Jane", 45.25);
    Customer cust2 = new Customer("Bob", 33.14);

    VendingMachine vend1 = new VendingMachine("Food");
    VendingMachine vend2 = new VendingMachine("Drink");
    VendingMachine vend3 = new VendingMachine("Office");

    Snack snack1 = new Snack("Chips", 36, 1.75, vend1.getId());
    Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vend1.getId());
    Snack snack3 = new Snack("Pretzel", 30, 2.00, vend1.getId());
    Snack snack4 = new Snack("Soda", 24, 2.50, vend2.getId());
    Snack snack5 = new Snack("Water", 20, 2.75, vend2.getId());


  }
}
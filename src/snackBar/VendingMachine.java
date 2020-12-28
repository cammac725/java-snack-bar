package snackBar;

public class VendingMachine
{
  // fields
  private static int maxId = 0;
  private int id;
  private String name;

  // constructor
  public VendingMachine(String name)
  {
    maxId++;
    id = maxId;
    this.name = name;
  }

  // methods
  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public static void buy(Customer customer, Snack snack, int quantity)
  {
    customer.buy(snack.getCost() * quantity);
    snack.buy(quantity);
  }
}
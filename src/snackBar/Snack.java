package snackBar;

public class Snack
{
  // fields
  private static int maxId = 0;
  public int id;
  public String name;
  public int quantity;
  public double cost;
  public int vendingId;

  // constructor
  public Snack(String name, int quantity, double cost, int vendingId)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingId = vendingId;
  }

  // methods - getters and setters

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

  public double getCost()
  {
    return cost;
  }

  public void setCost(double cost)
  {
    this.cost = cost;
  }

  public int getVendingId()
  {
    return vendingId;
  }

  public void setVendingId(int vendingId)
  {
    this.vendingId = vendingId;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void addQuantity(int x)
  {
    this.quantity = (quantity += x);
  }
  
  public void buySnack(int y)
  { 
    this.quantity = (quantity -= y);
  }

  public double getTotalCost(int quantity, double cost)
  {
    return (quantity * cost);
  }

}
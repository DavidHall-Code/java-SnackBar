package snackBarApp;

public class Main
{
  private static void workWithData()
  {
    System.out.println("Initial compile is working");

    // Customers: Jane($45.25) & Bob($33.14)=(String name, double cashOnHand)
      Customer cust1 = new Customer("Jane", 45.25);
      Customer cust2 = new Customer("Bob", 33.14);

   // VendingMachine food, drink and office
      VendinMachine food = new VendinMachine("Food");
      VendingMachine drink = new VendingMachine("Drink");
      VendingMachine office = new VendingMachine("Office");

  // Snack (String name, int quantity, double cost, int vendingMachineId)
      Snack chips = new Snack("Chips", 36, 1.75, food.getId());
      Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
      Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
      Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
      Snack water = new Snack("Water", 20, 2.75, drink.getId());




  }

  public static void main(String[] args)
  {
    workWithData();
  }

}

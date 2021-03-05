package decorator;

public class Decorator {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    // decorate espresso with mocha
    beverage = new Mocha(beverage);

    // print beverage description and costs
    System.out.println(beverage.getDescription() + " $" + beverage.getCost());
  }
}

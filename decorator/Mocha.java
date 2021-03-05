package decorator;

public class Mocha extends BeverageDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  // add mocha description
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  // add cost
  public double getCost() {
    return beverage.getCost() + 0.20;
  }
}

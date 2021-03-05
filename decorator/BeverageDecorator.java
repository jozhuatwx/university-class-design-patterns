package decorator;

public abstract class BeverageDecorator extends Beverage {
  // sets abstract for all decorators
  public abstract String getDescription();
  public abstract double getCost();
}

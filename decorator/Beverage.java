package decorator;

public abstract class Beverage {
  String description = "Unknown";
  double cost = 0.0;

  // getters
  public String getDescription() {
    return description;
  }

  public double getCost() {
    return cost;
  }
}

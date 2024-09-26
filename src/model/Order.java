package model;

public class Order {
  private String id;
  private boolean valid;
  private double amount;

  public Order(String id, boolean valid, double amount) {
    this.id = id;
    this.valid = valid;
    this.amount = amount;
  }

  public String getId() {
    return id;
  }

  public boolean isValid() {
    return valid;
  }

  public double getAmount() {
    return amount;
  }
}

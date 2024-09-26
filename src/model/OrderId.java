package model;

// Wrapper for a primitive type
public class OrderId {
  private final int id;

  public OrderId(int id) {
    if (id <= 0) {
      throw new IllegalArgumentException("Order ID must be positive.");
    }
    this.id = id;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return String.valueOf(id);
  }
}

package model;

// Wrapper for a String
public class CustomerName {
  private final String name;

  public CustomerName(String name) {
    if (name == null || name.trim().isEmpty()) {
      throw new IllegalArgumentException("Customer name cannot be null or empty.");
    }
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}

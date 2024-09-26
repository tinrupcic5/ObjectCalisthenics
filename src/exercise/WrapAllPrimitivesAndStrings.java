package exercise;

import model.CustomerName;
import model.OrderId;

/**
 * 3. Wrap All Primitives and Strings
 * Key points:
 * Encapsulation: The OrderId and CustomerName classes encapsulate the primitive types and add validation logic,
 *  which increases type safety.
 * Clear Intent: By using these wrapper classes, it's clear that an OrderId is not just an int and a
 *  CustomerName is not just a String. This improves the self-documenting nature of the code.
 * Maintainability: If any additional behavior or validation is needed for the OrderId or CustomerName,
 *  it can be added in the respective classes without affecting other parts of the code.
 */
public class WrapAllPrimitivesAndStrings {
  // Order class using the wrappers
  private final OrderId orderId;
  private final CustomerName customerName;

  public WrapAllPrimitivesAndStrings(OrderId orderId, CustomerName customerName) {
    this.orderId = orderId;
    this.customerName = customerName;
  }

  public OrderId getOrderId() {
    return orderId;
  }

  public CustomerName getCustomerName() {
    return customerName;
  }

  public boolean isValid() {
    return true;
  }
}







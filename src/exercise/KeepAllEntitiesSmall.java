package exercise;

import java.util.ArrayList;
import java.util.List;
import model.Order;

/**
 * 7. Keep All Entities Small: Focused Responsibilities: Each class now has a single responsibility (e.g.,
 * PaymentProcessor, EmailService, InventoryManager, OrderValidator), making the code easier to understand and maintain.
 * Easier Testing: Smaller classes and methods can be tested independently, which simplifies the testing process and
 * helps isolate issues more effectively. Enhanced Readability: By breaking down the logic into smaller, manageable
 * pieces, the code becomes clearer and easier to follow.
 */
public class KeepAllEntitiesSmall {
  private final List<Order> orders;

  public KeepAllEntitiesSmall() {
    this.orders = new ArrayList<>();
  }

  public void addOrder(Order order) {
    orders.add(order);
  }

  public void processOrders() {
    for (Order order : orders) {
      processOrder(order);
    }
  }

  private void processOrder(Order order) {
    if (order.isValid()) {
      new PaymentProcessor().chargeCustomer(order);
      new EmailService().sendConfirmationEmail(order);
      new InventoryManager().updateInventory(order);
    } else {
      new OrderValidator().handleInvalidOrder(order);
    }
  }
}

class PaymentProcessor {

  public void chargeCustomer(Order order) {
    System.out.println("Charging customer for order: " + order.getId());
  }
}

class EmailService {

  public void sendConfirmationEmail(Order order) {
    System.out.println("Sending confirmation email for order: " + order.getId());
  }
}

class InventoryManager {

  public void updateInventory(Order order) {
    System.out.println("Updating inventory for order: " + order.getId());
  }
}

class OrderValidator {

  public void handleInvalidOrder(Order order) {
    System.out.println("Invalid order: " + order.getId());
  }
}

package exercise;

import model.Order;

/**
 * 1. Don't Use the ELSE Keyword
 * Key points:
 * Early Returns: Instead of using else, we handle invalid and insufficient fund cases early,
 *  returning from the method immediately. This prevents the need for else and keeps the main logic clean.
 * Readability: By using early returns, the main action (completing the transaction)
 *  is more visible and the overall code flow becomes easier to follow.
 */
public class DontUseTheElseKeyword {

  public void processOrder(Order order) {
    if (!order.isValid()) {
      handleInvalidOrder(order);
      return;
    }

    if (!hasSufficientFunds(order)) {
      handleInsufficientFunds(order);
      return;
    }

    completeTransaction(order);
  }

  private boolean hasSufficientFunds(Order order) {
    return true;
  }

  private void completeTransaction(Order order) {
    System.out.println("Transaction completed for order: " + order.getId());
  }

  private void handleInsufficientFunds(Order order) {
    System.out.println("Insufficient funds for order: " + order.getId());
  }

  private void handleInvalidOrder(Order order) {
    System.out.println("Invalid order: " + order.getId());
  }
}

package exercise;

import model.Order;

/**
 * 1. Only One Level Of Indentation Per Method
 * Key points:
 * Each method has only one level of indentation.
 * Logic is broken down into smaller methods, reducing nesting and improving readability.
 * Early returns can also be used to reduce nesting further.
 */
public class OnlyOneLevelOfIndentationPerMethod {

  public void processOrder(Order order) {
    if (order.isValid()) {
      chargeCustomer(order);
    } else {
      handleInvalidOrder(order);
    }
  }

  private void chargeCustomer(Order order) {
    if (hasSufficientFunds(order)) {
      completeTransaction(order);
    } else {
      handleInsufficientFunds(order);
    }
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

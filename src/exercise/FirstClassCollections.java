package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Order;


/**
 * 4. First Class Collections
 * Key points:
 * Encapsulation: The OrderCollection class encapsulates a list of Order objects,
 *  providing methods to manage the collection.
 * Behavior: The collection class can contain logic related to the
 *  collection itself, like adding, removing, or retrieving orders. This keeps the logic organized and cohesive.
 * Immutability: The getAllOrders() method returns an unmodifiable list, protecting the internal state of the collection
 *  from external modifications.
 * Clarity: Using OrderCollection improves code readability and intent, making it clear
 *  that we're dealing with a collection of orders rather than just a List<Order>.
 */
public class FirstClassCollections {

  private final List<Order> orders;

  public FirstClassCollections() {
    this.orders = new ArrayList<>();
  }

  public void addOrder(Order order) {
    orders.add(order);
  }

  public void removeOrder(Order order) {
    orders.remove(order);
  }

  public Order getOrder(int index) {
    return orders.get(index);
  }

  public List<Order> getAllOrders() {
    return Collections.unmodifiableList(orders);
  }

  public int size() {
    return orders.size();
  }

  public boolean contains(Order order) {
    return orders.contains(order);
  }
}

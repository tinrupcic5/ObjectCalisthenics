package exercise;

/**
 * 9. No Getters/Setters/Properties Key points:
 * Encapsulation: By removing the getter and setter methods, the internal state (balance) is not exposed directly,
 *  enforcing encapsulation.
 * Behavior-Oriented Design: The class now provides methods that represent actions on the account
 *  (deposit, withdraw, printBalance), focusing on what can be done with the account rather than how to access its state.
 * Maintainability: This design allows for easier changes to the implementation of the
 *  BankAccount class without affecting code that uses the class.
 *  For instance, you could change how balance is calculated or stored without altering any external interfaces.
 */
public class NoGettersSettersProperties {

  public void getBalance() {
    BankAccount account = new BankAccount(100.0);
    account.deposit(50.0);
    account.printBalance();
    account.withdraw(200.0);
    account.printBalance();
  }
}

/**
 * Removing the getter and setter methods and using behaviors instead
 */
class BankAccount {

  private double balance;

  public BankAccount(double initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("Deposit amount must be positive!");
    }
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds!");
    }
  }

  public void printBalance() {
    System.out.println("Balance: " + balance);
  }
}


/**
 * Example that violates the No Getters/Setters/Properties rule by using getter and setter methods
 */
class BankAccountViolation {

  private double balance;

  public BankAccountViolation(double initialBalance) {
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance; // Getter
  }

  public void setBalance(double balance) {
    this.balance = balance; // Setter
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds!");
    }
  }
}

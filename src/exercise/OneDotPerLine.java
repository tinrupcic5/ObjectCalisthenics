package exercise;

import model.User;

/**
 * 5. One Dot per Line
 * Key points:
 * Improved Readability: By breaking down the chained calls, each operation is clearer,
 *  making it easier to understand what the code is doing at a glance.
 * Easier Debugging: If an error occurs, it is easier
 *  to isolate which part of the operation failed because each method call is on a separate line.
 * Clear Intent: Each line of code expresses a single action, which improves the intent of the code.
 */
public class OneDotPerLine {

  public void printUser() {
    User user = new User("R2D2", 100);

    /**
     * Violates the One Dot per Line rule by chaining multiple method calls
     */
    System.out.println(user.getName().toUpperCase().substring(0, 3)); // Chained method calls


    // Separate each operation into its own line
    String upperCaseName = user.getName().toUpperCase();
    String substringName = upperCaseName.substring(0, 3);

    System.out.println(substringName);
  }
}

package exercise;

/**
 * 6. Don't Abbreviate
 * Clarity: Using full names (User, name, age) instead of abbreviations (Usr, nm, ag) makes the code
 *  more understandable.
 * Self-Documentation: The code now serves as its own documentation, clearly conveying the purpose
 *  and intent without requiring additional explanation.
 * Easier Collaboration: When working in teams, clear naming
 *  conventions help other developers quickly understand the codebase, reducing the time spent deciphering abbreviations.
 */
public class DontAbbreviate {

  public void printUser() {
    Usr u = new Usr("R2D2", 100);

    System.out.println("User name is: " + u.getNm());
  }
}

/**
 * This violates the Don't Abbreviate rule by using abbreviations in variable names and method names
 */
class Usr {

  private String nm;
  private int ag;

  public Usr(String nm, int ag) {
    this.nm = nm;
    this.ag = ag;
  }

  public String getNm() {
    return nm;
  }

  public int getAg() {
    return ag;
  }
}

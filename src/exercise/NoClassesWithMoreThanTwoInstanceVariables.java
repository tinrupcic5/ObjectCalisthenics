package exercise;

import model.UserContactInfo;
import model.UserCredentials;

/**
 * 8. No Classes with More Than Two Instance Variables
 * Key points:
 * Focused Classes: Each class now has a maximum of two instance variables.
 * UserCredentials handles the username and password, while UserContactInfo manages the email. The UserProfile class focuses on profile details.
 * Enhanced Clarity: By limiting the number of instance variables, each
 *  class becomes easier to understand, and its purpose is clearer.
 * Improved Maintainability: Smaller, focused classes are easier to maintain and modify over time,
 *  as changes are localized to specific classes without affecting others.
 */
public class NoClassesWithMoreThanTwoInstanceVariables {
  private final UserCredentials credentials;
  private final UserContactInfo contactInfo;
  private String bio;
  private int age;

  public NoClassesWithMoreThanTwoInstanceVariables(UserCredentials credentials, UserContactInfo contactInfo, String bio, int age) {
    this.credentials = credentials;
    this.contactInfo = contactInfo;
    this.bio = bio;
    this.age = age;
  }

  public String getUsername() {
    return credentials.getUsername();
  }

  public String getEmail() {
    return contactInfo.getEmail();
  }

  public String getBio() {
    return bio;
  }

  public int getAge() {
    return age;
  }

  public void updateBio(String newBio) {
    this.bio = newBio;
  }
}


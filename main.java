// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    // System.out.println("Hello world!");

    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suit, rain coat

    String season = "kevad";

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    } else if (season == "spring") {
      System.out.println("Wear a t-shirt!");
    } else if (season == "summer") {
      System.out.println("Wear a swimming suit!");
    } else if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    } else {
      System.out.println("I do not recongize this season.");
    }

   

    int temp = 15;

    if (temp <= 5) {
      System.out.println("Wear a super warm jacket!");
    } else if (temp <= 15) {
      System.out.println("Wear a warm jacket!");
    } else if (temp <= 30) {
      System.out.println("Wear a t-shirt!");
    } else {
      System.out.println("Don't wear anything!");
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}

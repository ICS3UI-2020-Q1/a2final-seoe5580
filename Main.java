import java.util.Scanner;

/**
 * Program that lets you figure out the pricing of different pizzas 
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user's input
    Scanner input = new Scanner(System.in);

    // Asks the users the size of the pizza
    System.out.println("What is the size of the pizza (in cm):");

    // Gets the size of the pizza from the user
    int size = input.nextInt();

    // Calculates and shows the subtotal, tax, and the final total for the user 
    System.out.println("Subtotal: " + (0.75 + 0.99 + 0.50 * size));
    System.out.println("Taxes: " + 0.13 * (0.75 + 0.99 + 0.50 * size));
    System.out.println("Total: " + 1.13 * (0.75 + 0.99 + 0.50 * size));
    
    // Responds to the user differently depending on the size of the pizza they have
    if (size > 40){
    System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    } else if (size > 20){
    System.out.println("This will be delicious!");
    } else if (size > 0){
      System.out.println("We are going to make you a cute little pizza!");
    }
    
  }
}

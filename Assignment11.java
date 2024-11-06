// find factorial of n
package hellojava; // Define package name as hellojava
import java.util.Scanner; // Import Scanner class for taking user input

public class Assignment11 {
  public static void main(String[] args) {
        System.out.println("Enter Your Factorial Number: "); // Prompt user to enter a number for factorial calculation
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input
        int factorialNumber = input.nextInt(); // Declare and initialize variable to store user input
        input.close(); // Close the Scanner object to free resources
        
        long number = 1; // Initialize variable 'number' to store the factorial result
        for(int i = 1; i <= factorialNumber; i++){ // Loop from 1 to the entered number
            number = number * i; // Multiply 'number' by 'i' in each iteration
        }
        System.out.println("Factorial of " + factorialNumber + " is " + number); // Print the final factorial result
  }
}

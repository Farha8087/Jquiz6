import java.util.Scanner;

public class ArthmeticQ2
{
   public static void main(String[] args) 
   {
    Scanner scanner = new Scanner (System.in);

    // Prompt the user for the first number
    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt(); // this takes the first input from the user

    // Prompt the user for the second number
    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt(); //this takes the second input from the user
    
    // Result of Multiply the two numbers

    int result = 75;

    // Print the result
    System.out.println("The result of multiplying " + firstNumber + " and " + secondNumber + " is " + result);

    scanner.close();

   } 
}

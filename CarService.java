//This code below helps us build simple appplication to select an option with help of do while loop
//syntax below helps intake from user and imports scanner class 
import java.util.Scanner;
//The code beloww defines the main class showcasing dowhile scenario
public class CarService 
{
    //below is the methode used
    public static void main(String[] args)
    { 
        // Creates a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        // Create a variable to store user's selection
        int selection;

        do
        {
            //Codes below prints welcome message and shows options to the user on terminal
         System.out.println("Welcome to Car service app.Services we provide");
         System.out.println("1. Basic wash");
         System.out.println("2. Delux wash");
         System.out.println("3. Wax coating");
         System.out.println("4. Done");
         System.out.println("Choose an option");

         selection = scanner.nextInt();
            // Stores the user's selected option.

          //switches are based on user's selection of option and each case prints the option selected and breaks.
            switch (selection)
          {

            case 1 :
            System.out.println("Basic Car Wash Selected");
            break; 
            case 2 : 
            System.out.println("Delux Car Wash Selected");
            break; 
            case 3 : 
            System.out.println("Wax Service Selected"); 
            break;
            case 4 :
            System.out.println("Thank you for choosing our service");
            break;
            //code below handles invalid selection by printing error message
            default :
            System.out.println("Invalid selection,please select right option");
            break; 
            
          }


        }
        while (selection != 4); 
        //continues looping until the user selects done

        scanner.close();
        //closes the scanner to free resources
    }
}

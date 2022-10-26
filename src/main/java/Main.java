import java.util.Scanner;

/**
 * Created by aascone on 10/26/22.
 */
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);

        //Ask the user to input their name
        System.out.println("What is your name? ");
        String name = in.nextLine();

        //A quick test to make sure the input functionality works
        //System.out.println("Your name is: " + name);

        //Conditional to test if the name is 'Alice' or 'Bob'
        if (name.equals("Alice") || name.equals("alice") || name.equals("bob") || name.equals("Bob")){
            System.out.println("Hello " + name + "!");
        }
        else{
            System.out.println("Meh...");
        }
    }
}

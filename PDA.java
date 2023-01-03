import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    Scanner scanner = new Scanner(System.in);
    int age;
    int LOWER_BOUND = 14;
    boolean shouldContinue = true;
    
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (shouldContinue) {
            System.out.println("How old are you?");
            System.out.println("Input '0' to exit program");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    if (age == 0) {
                        shouldContinue = false;
                    } else {
                        System.out.println(age + " is too young!!");
                    }
                } else {
                    System.out.println(getYoungerAge(age) + " - " + getOlderAge(age));                
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
    
    public int getYoungerAge(int age) {
        if (age%2 == 0) {
            return (age/2) + 7;
        } else {
            return (age/2) + 8;
        }
    }
    
    public int getOlderAge(int age) {
        return (age*2) -7;
    }
}

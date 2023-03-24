import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lets the user select N for the Fibonacci calculator function, and prints the results.
        Scanner scan = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers would you like to be displayed?:  ");
        try {
            int userInput = scan.nextInt();
            System.out.println(Fibonacci.getFibonacciNumbers(userInput));
        } catch (Exception e) {
            System.out.println("Invalid input: must be integer.");
        }
    }
}
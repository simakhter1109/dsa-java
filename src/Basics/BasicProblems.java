import java.util.Scanner;

public class BasicProblems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Problem 1: Positive and Negative

        System.out.println("Problem 1: Positive or Negative");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }


        // Problem 2: Larger Number

        System.out.println("\nProblem 2: Larger Number");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Larger number is " + a);
        } else {
            System.out.println("Larger number is " + b);
        }


        // Problem 3: Even or Odd

        System.out.println("\nProblem 3: Even or Odd");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }


        // Problem 4: Square

        System.out.println("\nProblem 4: Square of a Number");

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int square = x * x;

        System.out.println("Square is " + square);
    }
}
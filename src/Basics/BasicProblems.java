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

        // Problem 5: Voting eligibility

        System.out.println("\nProblem 5: Voting Eligibility");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote.");
        }

        // Problem 6: Smaller Number

        System.out.println("\nProblem 6: Smaller Number");

        System.out.println("Enter first number: ");
        int a1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int a2 = sc.nextInt();

        if(a1 < a2){
            System.out.println("Smaller Number is " + a1);
        }else{
            System.out.println("Smaller Number is " + a2);
        }

        // Problem 7: Print numbers

        System.out.println("\nProblem 7: Print numbers");

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++){
            System.out.println(i);
        }

        // Problem 8: Multiplication Table

        System.out.println("\nProblem 8: Multiplication Table");

        System.out.println("Enter a number: ");
        int table = sc.nextInt();

        for(int i = 1; i <= 10; i ++){
            System.out.println(table + "x" + i + "=" + (table*i));
        }

        // Problem 9: Backward Counting

        System.out.println("\nProblem 9: Backward Counting");

        System.out.println("Enter a number: ");
        int count = sc.nextInt();

        for(int i = count; i >= 1; i--){
            System.out.println(i);
        }
    }
}

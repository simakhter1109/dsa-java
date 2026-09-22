import java.util.Scanner;
public class GreetFunc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your surname: ");
        String surname = sc.next();
        String personalised = myGreet(name, surname);
        System.out.println(personalised);
        String message = greet(name, surname);
        System.out.println(message);

    }

    static String myGreet(String name, String surname){
        String message = "Hello " + name + " "+ surname;
        return message;
    }

    static String greet(String name, String surname) {
        String greeting = "How are you? " + name + " " + surname;
        return greeting;
    }

}
import java.util.Scanner;
public class GreetFunc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
        String message = greet(name);
        System.out.println(message);

    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static String greet(String name) {
        String greeting = "How are you?" + name;
        return greeting;
    }

}
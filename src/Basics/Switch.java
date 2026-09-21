import java.util.Scanner;
public class Switch{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits.");
                break;
            case "Apple":
                System.out.println("Red fruit.");
                break;
            case "Orange":
                System.out.println("A round fruit.");
                break;
            case "Grapes":
                System.out.println("Small round fruit.");
                break;
            default:
                System.out.println("Enter a valid fruit.");
        }

    }
}
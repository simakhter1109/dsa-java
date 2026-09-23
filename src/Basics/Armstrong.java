import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int org = n;

        // count digits
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp/10;
            count++;
        }

        // calcuulate armstrong
        int sum = 0;
        temp = n;
        while (temp != 0){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp /10;
        }
         if ( sum == org){
             System.out.println("Armstrong number.");
         } else{
             System.out.println("Not an Armstrong number.");
         }
    }
}
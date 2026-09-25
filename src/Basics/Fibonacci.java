import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }


        // USING WHILE LOOP
        System.out.print("Enter number of terms: ");
        int p = sc.nextInt();

        int d = 0;
        int r = 1;
        int count = 0;

        while (count < n) {

            System.out.print(d + " ");

            int next = d + r;
            d = r;
            r = next;

            count++;
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Loops {
    public static void main (String[] args){

        // PROBLEM 1: PRINT NUMBER 1 TO 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // PROBLEM 2: PRINT NUMBER FROM 1 TO N
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i<=n; i ++){
            System.out.println(i);
            System.out.println("Sim Akhter");
        }

    }
}
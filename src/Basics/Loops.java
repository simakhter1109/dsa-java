import java.util.Scanner;

public class Loops {
    public static void main (String[] args){

//        // PROBLEM 1: PRINT NUMBER 1 TO 10
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//
//        // PROBLEM 2: PRINT NUMBER FROM 1 TO N
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for(int i = 1; i<=n; i ++){
//            System.out.println(i);
//            System.out.println("Sim Akhter");
//        }
//
//        // WHILE LOOP   (YOU NEED TO RUN A WHILE LOOP WHEN YOU DONT KNOW HOW  MANY TIMES THE LOOP WILL RUN)
//        int num = 1;
//        while (num <=10){
//            System.out.println(num);
//            num += 1;
//        }
//
//        // PROBLEM 3: PRINT NUMBERS FROM 20 TO 1
//        for (int i = 20; i >= 1; i --){
//            System.out.println(i);
//        }

//          // PROBLEM 4: PRINT EVEN NUMBERS FORM 1 TO 20
//           for (int i = 1; i <= 20; i ++){
//               if (i % 2 == 0){
//                   System.out.println(i);
//               }
//           }

           Scanner in = new Scanner(System.in);

           System.out.println("Enter the initial number: ");
           int a = in.nextInt();
           System.out.println("Enter the last number: ");
           int b = in.nextInt();

           System.out.println("Even numbers are: ");

           for (int i = a; i <= b; i ++) {
               if (i % 2 == 0) {
                   System.out.println(i);
               }
           }

           System.out.println("Odd numbers are: ");

           for (int i = a; i <= b; i ++){
               if (i % 2 != 0){
                   System.out.println(i);
               }
           }

    }
}
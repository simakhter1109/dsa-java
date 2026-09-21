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
//
             // GET THE EVEN AND ODD NUMBERS

           Scanner in = new Scanner(System.in);
//
//           System.out.println("Enter the initial number: ");
//           int a = in.nextInt();
//           System.out.println("Enter the last number: ");
//           int b = in.nextInt();
//
//           System.out.println("Even numbers are: ");
//
//           for (int i = a; i <= b; i ++) {
//               if (i % 2 == 0) {
//                   System.out.println(i);
//               }
//           }
//
//           System.out.println("Odd numbers are: ");
//
//           for (int i = a; i <= b; i ++){
//               if (i % 2 != 0){
//                   System.out.println(i);
//               }
//           }

//            // PROBLEM 5: SUM OF NUMBERS FROM 1 TO N
//            int sum = 0;
//            for (int i = a; i <= b; i++){
//                sum = sum + i;
//            }
//            System.out.println("Sum is " + sum);


//              // PROBLEM 6: COUNT DIGITS
//              System.out.println("Enter a number: ");
//              int num = in.nextInt();
//              int count = 0;
//              while (num != 0){
//                  num = num/10;
//                  count ++;
//              }
//              System.out.println("Number of digits: " + count);


//                // PROBLEM 7: SUM OF THE DIGITS
//                System.out.println("Enter a number: ");
//                int num = in.nextInt();
//                int sum = 0;
//                while (num != 0){
//                    int digit = num % 10;
//                    sum = sum + digit;
//                    num = num/10;
//                }
//                System.out.println("Sum of digits: " + sum);


                  // PROBLEM 8: REVERSE A NUMBER
                  System.out.println("Enter a number: ");
                  int num = in.nextInt();
                  int reverse = 0;
                  while (num != 0){
                      int digit = num % 10;
                      reverse = reverse * 10 + digit;
                      num = num / 10;
                  }
                  System.out.println("Reverse number: " + reverse);


    }
}
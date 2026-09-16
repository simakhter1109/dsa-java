import java.util.Scanner;
public class ArrayBasics {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // PROBLEM 1: TAKE NUMBERS AS INPUT AND PRINT THEM
         System.out.println("Enter the size of array: ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter " + n + " numbers: ");
         for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         System.out.println("Array elements: ");
         for(int i = 0; i < n; i++){
             System.out.print(arr[i] + " ");
         }

         sc.close();
    }
}
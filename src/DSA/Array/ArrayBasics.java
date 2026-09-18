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

         // PROBLEM 2: FIND THE SUM OF ARRAY ELEMENTS
         int sum = 0;
         for(int i =0; i<n; i++){
             sum= sum + arr[i];
         }
         System.out.println();
         System.out.println("Sum of array elements = " + sum);

         // PROBLEM 3: FIND THE AVERAGE OF ARRAY ELEMENTS
         double average = (double) sum / n;
         System.out.println("Average of array elements = " + average);

         // PROBLEM 3: FIND THE LARGEST ELEMENT
         int largest = arr[0];
         for(int i = 1; i<n; i ++){
             if (arr[i] > largest){
                 largest = arr[i];
             }
         }
         System.out.println("Largest element = " + largest);

         // PROBLEM 4: FIND THE SMALLEST ELEMENT
        int smallest = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
         System.out.println("Smallest element = " + smallest);


         sc.close();
    }
}
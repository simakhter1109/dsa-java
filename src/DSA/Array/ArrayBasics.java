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

        // PROBLEM 5: COUNT EVEN AND ODD NUMBERS
        int even = 0;
        int odd = 0;
        for(int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even numbers = " + even );
        System.out.println("Odd numbers = " + odd);

        // PROBLEM 6: COUNT POSITIVE, NEGATIVE AND ZEROS
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for(int i = 0; i < n; i ++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zeros);


        // PROBLEM 7: SEARCH FOR A NUMBER
        System.out.println("Enter number to search = ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i = 0; i<n; i++){
            if (arr[i] == search){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Number found.");
        } else{
            System.out.println("Number not found.");
        }


         sc.close();
    }
}
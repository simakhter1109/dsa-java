import java.util.Scanner;
public class LargerNumber {
    public static void main(String[] args){
//    public static void main (String [] args) {
//        int a = 15;
//        int b = 29;
//        if(a>b) {
//            System.out.println("Larger is " + a);
//        }else{
//            System.out.println("Larger is " + b);
//        }
//    }
//}

        // FIND THE LARGEST NUMBER

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);

    }
}
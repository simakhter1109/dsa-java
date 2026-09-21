import java.util.Scanner;
public class NestedSwitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1:
                System.out.println("Sim Akhter");
                break;
            case 2:
                System.out.println("Aayushi Banerjee");
                break;
            case 3:
                System.out.println("Sejuti Sarah");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    case "Finance":
                        System.out.println("Finance Department");
                    default:
                        System.out.println("No Department entered");
                }

                break;
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
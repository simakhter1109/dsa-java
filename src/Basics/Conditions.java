public class Conditions{
    public static void main (String[] args){

        int salary = 254000;
        if(salary > 100000){
            salary = salary + 20000;
        } else{
            salary = salary + 10000;
        }
        System.out.println(salary);
    }
}
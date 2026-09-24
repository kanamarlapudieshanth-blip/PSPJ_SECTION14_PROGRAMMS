import java.util.Scanner;
public class NetSalary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextFloat();

        double hra = salary * 0.20;
        double da = salary * 0.10;

        double netSalary = salary + hra + da;

        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Net Salary: " + netSalary);
        
        input.close();
    }
}









         
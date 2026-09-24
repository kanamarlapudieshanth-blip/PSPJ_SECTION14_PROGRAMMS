import java.util.Scanner;
public class speed {
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed in kmph: ");
        System.out.println("Enter the time in hours: ");
        double speed = input.nextInt();
        double time = input.nextInt();

        double Distance = speed*time;
        System.out.println("The speed is: " + speed);
        System.out.println("The time is: " + time);
        System.out.println("The distance is:" + Distance + " km");



        input.close();

        }
    }
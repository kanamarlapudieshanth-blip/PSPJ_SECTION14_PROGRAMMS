import java.util.Scanner;

public class kdfbhgis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int marks[] = new int [n];

        int max = marks[0];
        int min = marks[0];

        for(int i = 0; i < n; i++){{
            System.out.println("Enter marks: ");
            marks[i] = input.nextInt();
        }for(int num : marks){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }}
        }

        System.out.println("max is: " + max);
        System.out.println("min is: " + min);
    }
}
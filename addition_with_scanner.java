#addition with scanner statement 
import java.util.Scanner;
public class add {
    public static void main (String[] add){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1=scanner.nextInt();

        System.out.println("Enter the Second Number: ");
        int num2=scanner.nextInt();

        int sum=num1 + num2;

        System.out.println("Sum is: " + sum);

        scanner.close();
    }

}

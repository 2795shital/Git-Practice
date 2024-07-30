import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Calculate sum of the largest two numbers
        int sum;
        if (num1 >= num2 && num1 >= num3) {
            sum = num1 + (num2 >= num3 ? num2 : num3);
        } else if (num2 >= num1 && num2 >= num3) {
            sum = num2 + (num1 >= num3 ? num1 : num3);
        } else {
            sum = num3 + (num1 >= num2 ? num1 : num2);
        }

        // Display the calculated sum
        System.out.println("Sum of the largest two numbers: " + sum);

        scanner.close();
    }
}

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();
        
        double largest = num1;
        
        if (num2 > largest) {
            largest = num2;
        }
        
        if (num3 > largest) {
            largest = num3;
        }
        
        double average = (num1 + num2 + num3) / 3;
        
        System.out.println("The largest number is: " + largest);
        System.out.println("The average of the three numbers is: " + average);
    }
}

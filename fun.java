import java.util.Scanner;

public class fun {
    public static void printHelloWorld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        
        calculateSum(a, b);

        // Close the scanner
        sc.close();
    }
}

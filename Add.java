package JAVA;

public class Add {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int c = 2;
        int d = 13;
        int sum = a + b + c + d;
        int difference = a - b - c - d;
        int multiplication = a * b * c * d;
        double division = 0;

        if (b != 0 && c != 0 && d != 0) {
            division = (double) a / b / c / d;
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Multiplication: " + multiplication);
        if (b != 0 && c != 0 && d != 0) {
            System.out.println("Division: " + division);
        }
    }
}


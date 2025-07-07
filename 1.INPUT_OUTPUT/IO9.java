// Sample Input 0
// 25.0
// 3.0

// Sample Output 0
// Square Root of first number: 5.0
// First number raised to the power of second number: 15625.0
// Absolute value of first number: 25.0
// Absolute value of second number: 3.0

// Sample Input 1
// 9.0
// 2.0

// Sample Output 1
// Square Root of first number: 3.0
// First number raised to the power of second number: 81.0
// Absolute value of first number: 9.0
// Absolute value of second number: 2.0

import java.util.Scanner;

public class IO9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n1 =sc.nextDouble();
        double n2 =sc.nextDouble();
        System.out.printf("Square Root of first number: %.1f\n",Math.sqrt(n1));
        System.out.printf("First number raised to the power of second number: %.1f\n",Math.pow(n1, n2));
        System.out.printf("Absolute value of first number: %.1f\n",Math.abs(n1));
        System.out.printf("Absolute value of second number: %.1f\n",Math.abs(n2));
        sc.close();
    }
}

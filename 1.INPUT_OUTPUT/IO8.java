// Sample Input 0
// 54.5

// Sample Output 0
// 54
// 55
// 54

// Explanation 0
// The user inputs the float value 54.5.
// The program calculates:
// The integer part (truncated): 54
// The rounded-up value using ceil(): 55
// The rounded-down value using floor(): 54
// The program prints the results in the specified order:
// 54
// 55
// 54

// Sample Input 1
// 99.99

// Sample Output 1
// 99
// 100
// 99

import java.util.Scanner;

public class IO8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n =sc.nextDouble();
        System.out.println((int)(n));
        System.out.println((int)(Math.ceil(n)));
        System.out.println((int)(Math.floor(n)));
        sc.close();
    }
}

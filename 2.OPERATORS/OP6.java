// Sample Input 0
// 1001

// Sample Output 0
// 2

// Explanation 0
// The four-digit number on the door is 1001.
// The first digit is 1, and the last digit is 1.
// Sum of the first and last digit: 1 + 1 = 2.
// So, the door unlocks when they enter 2.

// Sample Input 1
// 1234

// Sample Output 1
// 5

import java.util.Scanner;
public class OP6 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int fd =n/1000;
        int ld =n%10;
        System.out.println(fd+ld);
        sc.close();
    }
}

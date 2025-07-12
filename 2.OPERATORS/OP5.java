// Sample Input 0
// 1000
// 2
// 1

// Sample Output 0
// 900

// Explanation 0
// The Herald sells 1000 copies.
// Each copy is sold for 2 rupees.
// The cost to print each copy is 1 rupee.
// Total Revenue: Total Revenue = 1000 × 2 = 2000 rupees
// Total Cost: Total Cost = (1000 × 1) + 100 = 1000 + 100 = 1100 rupees
// Profit: Profit = Total Revenue - Total Cost = 2000 - 1100 = 900 rupees

// Sample Input 1
// 500
// 5
// 3

// Sample Output 1
// 900

import java.util.Scanner;
public class OP5 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        int tr =x*y;
        int tc =(x*z)+100;
        System.out.println(tr -tc);
        sc.close();
    }
}

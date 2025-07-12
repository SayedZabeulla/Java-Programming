// Sample Input 0
// 100
// 1
// 10

// Sample Output 0
// Interest: 10.00
// Total Amount: 110.00
// Discount: 0.20
// Final Settlement Amount: 109.80

// Explanation 0
// Interest Calculation:
// This formula calculates the total interest that Leena will owe over the entire loan period. 
// For example, if Leena borrows Rs. 100 at a rate of 1% for 10 years, the interest will be calculated as:
// Interest = (100 * 1 * 10) / 100 = 10.00
// This means Leena will owe Rs. 10 in interest after 10 years.

// Total Amount Calculation:
// This calculates the total amount Leena will need to repay to Meena after 10 years. Continuing with our example:
// Total Amount = 100 + 10 = 110.00
// Therefore, the total amount Leena will repay after 10 years is Rs. 110.

// Discount Calculation:
// Since Meena offers a 2% discount on the total interest, we calculate how much this discount is. For our example:
// Discount = 0.02 * 10 = 0.20
// This indicates that Leena will receive a Rs. 0.20 discount on the interest.

// Final Settlement Calculation:
// The final settlement amount is the total amount to be paid after applying the discount. Using our figures:
// Final Settlement = 110 - 0.20 = 109.80
// Thus, the final amount Leena needs to repay after applying the discount is Rs. 109.80.

// Sample Input 1
// 2000
// 5
// 8

// Sample Output 1
// Interest: 800.00
// Total Amount: 2800.00
// Discount: 16.00
// Final Settlement Amount: 2784.00

import java.util.Scanner;
public class OP9 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        float x =sc.nextInt();
        float y =sc.nextInt();
        float z =sc.nextInt();
        float in =(x*y*z)/100;
        float ta =x+in;
        double dc =0.02*in;
        double fr =ta -dc;
        System.out.printf("Interest: %.2f\n",in);
        System.out.printf("Total Amount: %.2f\n",ta);
        System.out.printf("Discount: %.2f\n",dc);
        System.out.printf("Final Sattelment Amount: %.2f\n",fr);
        sc.close();
    }
}

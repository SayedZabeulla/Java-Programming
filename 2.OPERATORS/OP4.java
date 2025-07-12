// Sample Input 0
// 4
// 5

// Sample Output 0
// 8

// Explanation 0
// Here, X = 4 and Y= 5 and their product is 4*5=20. Therefore, 8 is returned as the output in 12-hour system.

// Sample Input 1
// 2
// 5

// Sample Output 1
// 10

// Explanation 1
// Here X= 2 and Y= 5 and these product is 2*5=10, Therefore, 10 is returned as the output in 12-hour system.

import java.util.Scanner;
public class OP4 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        int y =sc.nextInt();
        int r =(x*y)%12;
        int fr = r==0?12:0;
        System.out.println(fr);
        sc.close();
    }
}

// Sample Input 0
// 348
// 327
// 5

// Sample Output 0
// 4

// Explanation 0
// Here, S=348, D=327 and N=5. 
// The user needs to take 21 more steps (348-327=21). 
// Since they have been tracking their steps for 5 days, 
// the average steps per day needed to reach the target is 21/5, 
// which is approximately 4. Hence, 4 is returned as output

// Sample Input 1
// 6000
// 2455
// 7

// Sample Output 1
// 506

// Explanation 1
// Here, S=6000, D=2455 and N=7. 
// The user needs to take 3545 more steps (6000- 2455). 
// Since they have been tracking their steps for 7 days, 
// the average steps per day needed to reach the target is 3545/7, 
// which is approximately 506, Hence 506 is returned as output

import java.util.Scanner;
public class OP8 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int s =sc.nextInt();
        int d =sc.nextInt();
        int n =sc.nextInt();
        int sub =s-d;
        int fr =Math.round((float)(sub/n));
        System.out.println(fr);
        sc.close();
    }
}

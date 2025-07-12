// Sample Input 0
// 5

// Sample Output 0
// 300

// Explanation 0
// Here, N = 5. The conversion of 5 minutes will be 5 x 60 = 300 seconds. Hence, 300 is returned as output

// Sample Input 1
// 3

// Sample Output 1
// 180

// Explanation 1
// Here, N = 3. The conversion of 53minutes will be 3 x 60 = 300 seconds. Hence, 180 is returned as output.

import java.util.Scanner;
public class OP3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(n*60);
        sc.close();
    }
}

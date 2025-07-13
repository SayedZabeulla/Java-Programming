// Sample Input 0
// 5
// 10

// Sample Output 0
// 785

// Explanation 0
// Here, the given values are R = 5 and H = 10. 
// The amount of water that can be stored on this day is 3.14*5*5*10=785. 
// Therefore, 785 is returned as the output.

// Sample Input 1
// 7
// 9

// Sample Output 1
// 1385

// Explanation 1
// Here, the given values are R = 7 and H = 9. 
// The amount of water that can be stored on this day is 3.14*7*7*9=1384.7, 
// which can be rounded up to the value 1385. Therefore, 1385 is returned as the output.

import java.util.Scanner;
public class OP2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int r =sc.nextInt();
        int h =sc.nextInt();
        double pi =3.14;
        double res =pi*r*r*h;
        double fr =Math.ceil(res);
        System.out.printf("%.0f\n",fr);
        sc.close();
    }
}

// Sample Input 0

// a
// Sample Output 0

// 97
// Sample Input 1

// A
// Sample Output 1

// 65

import java.util.Scanner;

public class IO6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        char ch =str.charAt(0);
        System.out.println((int)(ch));
        sc.close();
    }
}

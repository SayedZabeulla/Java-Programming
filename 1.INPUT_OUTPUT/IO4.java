// Sample Input 0

// 25
// Alice
// Sample Output 0

// User Details:
// Name: Alice
// Age: 25
// Sample Input 1

// 18
// John
// Sample Output 1

// User Details:
// Name: John
// Age: 18

import java.util.Scanner;

public class IO4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();
        sc.nextLine(); //To read empty space after int input
        String name =sc.nextLine();
        System.out.println("User Details:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        sc.close();
    }
}

// Sample Input 0

// John Doe
// Monthly
// Sample Output 0

// Member Name: John Doe
// Selected Membership: Monthly
// Sample Input 1

// Alice Smith
// Yearly
// Sample Output 1

// Member Name: Alice Smith
// Selected Membership: Yearly

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
        String membership =sc.nextLine();
        System.out.println("Member Name: "+name);
        System.out.println("Selected Membership: "+membership);
        sc.close();
    }
}
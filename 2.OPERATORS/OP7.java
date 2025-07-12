// Sample Input 0
// 60
// 8

// Sample Output 0
// The number of friends in each team is 7 and left out is 4

// Explanation 0
// Ross has 60 friends and he wants to split them into 8 teams.
// If 60 friends are divided into 8 teams, each team will have 7 friends (60 // 8 = 7).
// There will be 4 friends left out (60 % 8 = 4), who will assist Ross in managing the games.

// Sample Input 1
// 45
// 6

// Sample Output 1
// The number of friends in each team is 7 and left out is 3

import java.util.Scanner;
public class OP7 {
    public void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int r =n%m;
        int q =n/m;
        System.out.println("The number of friends in each team is "+q+" and the left out is "+r);
        sc.close();
    } 
}

// Sample Input 0
// helloworld
// 10
// l

// Sample Output 0
// 3

// Explanation 0
// Here the given string is "helloworld" and the length of the string is 10 and the character whose count is to be found is "I". 
// The number of times "I" occurs in the string is 3. Therefore, 3 is returned as the output.

// Sample Input 1
// mercermettl
// 11
// t

// Sample Output 1
// 2

// Explanation 1
// Here the given string is "mercermettl" and the length of the string is 11 and the AOS character whose count is to be found is "t". 
// The number of times "t" occurs in the string is 2. Therefore, 2 is returned as the output.

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int n =sc.nextInt();
        char ch =sc.next().charAt(0);
        int c =0;
        for (int i =0; i<str.length(); i++){
            char check =str.charAt(0);
            if (check == ch){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}

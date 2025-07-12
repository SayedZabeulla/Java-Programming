// Sample Input 0
// Ram scored 91.62% in class 12 Board Exams.

// Sample Output 0
// 32

// Explanation 0
// Total alphabetic characters: 26
// Total numeric characters: 6
// Total alphanumeric characters: 26 + 6 = 32

// Sample Input 1
// Happy New Year 2016!!

// Sample Output 1
// 16

// Explanation 1
// Total alphabetic characters: 14
// Total numeric characters: 2
// Total alphanumeric characters: 14 + 2 = 16

import java.util.Scanner;
public class STR10 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int c =0;
        for (int i=0; i<str.length(); i++){
            char ch =str.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}

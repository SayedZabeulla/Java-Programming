// Sample Input 0
// Knowledge is the greatest gift

// Sample Output 0
// 9

// Explanation 0
// Words and their number of alphabetic characters:
// Knowledge: 9
// is: 2
// the: 3
// greatest: 8
// gift: 4
// The longest word is "Knowledge" with 9 characters.

// Sample Input 1
// Length of the longest word

// Sample Output 1
// 7

// Explanation 1
// Words and their number of alphabetic characters:
// Length: 6
// of: 2
// the: 3
// longest: 7
// The longest word is "longest" with 7 characters.

import java.util.Scanner;
public class STR4 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str0 =sc.nextLine();
        String arr[] =str0.split(" ");
        int max =0;
        for (String w :arr){
            int count =0;
            for (int i=0; i<w.length(); i++){
                char ch =w.charAt(i);
                if (Character.isLetter(ch)){
                    count++;
                }
                if (count>max){
                    max =count;
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}
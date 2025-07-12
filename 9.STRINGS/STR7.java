// Sample Input 0
// aaabbccddeffggg

// Sample Output 0
// gfedcba

// Explanation 0
// The input string aaabbccddeffggg is first compressed to abcdefg by replacing multiple consecutive occurrences of each character with a single occurrence.
// The compressed string is then reversed to give gfedcba.

// Sample Input 1
// xxxyyyzzzppqqqrrrss

// Sample Output 1
// srqpzyx

// Explanation 1
// The input string xxxyyyzzzppqqqrrrss is first compressed to sqrpzyx.
// The compressed string is then reversed to give srqpzyx.

import java.util.Scanner;
public class STR7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        str =str.toLowerCase();
        String cstr ="";
        for (int i=0; i<str.length(); i++){
            if (i==0 || str.charAt(i) != str.charAt(i-1)){
                cstr =cstr+str.charAt(i);
            }
        }
        StringBuilder sb =new StringBuilder(cstr);
        System.out.print(sb.reverse().toString());
        sc.close();
    }
}
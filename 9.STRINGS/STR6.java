// Sample Input 0
// trumpet

// Sample Output 0
// 2

// Explanation 0
// The word "trumpet" has the letter 't' repeated 2 times, and all other letters appear only once.
// The highest number of repeating letters is 2.

// Sample Input 1
// reiterate

// Sample Output 1
// 3

// Explanation 1
// The word "reiterate" has the letter 'e' repeated 3 times, and other letters appear once or twice.
// The highest number of repeating letters is 3.

import java.util.Scanner;
public class STR6 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        str =str.toLowerCase();
        int max =0;
        for (int i=0; i<str.length(); i++){
            int c =0;
            for (int j=0; j<str.length(); j++){
                char ch1 =str.charAt(i);
                char ch2 =str.charAt(j);
                    if (ch1 == ch2){
                        c++;
                    }
            }
            if (max<c){
                max =c;
            }
        }
        System.out.print(max);
        sc.close();
    }
}

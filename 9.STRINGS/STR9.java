// Sample Input 0
// qlewldoaa life ace by fantasy

// Sample Output 0
// 11

// Explanation 0
// qlewldoaa: Hard (more consonants than vowels)
// life: Easy
// ace: Easy
// by: Hard (3 consecutive consonants)
// fantasy: Hard (more consonants than vowels)

// Calculating Difficulty Quotient:
// Difficulty quotient = (5 * 3) - (2 * 2) = 15 - 4 = 11

// Sample Input 1
// openai is awesome

// Sample Output 1
// -6

// Explanation 1
// openai: Easy
// is: Easy
// awesome: Easy

// Calculating Difficulty Quotient:
// Difficulty quotient = (5 * 0) - (2 * 3) = 0 - 6 = -6

import java.util.Scanner;
public class STR9 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String str0 =sc.nextLine();
        String word [] =str0.split(" ");
        int hard =0;
        int easy =0;
        for (String w : word){
            int v =0;
            int c =0;
            for (int i=0; i<w.length(); i++){
                char ch = Character.toLowerCase(w.charAt(i));
                if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                    v++;
                }
                else {
                    c++;
                }
                }
            if (c>v){
                hard++;
            }
            else{
                easy++;
            }
        }
        int sum = (5 * hard) - (2 * easy);
        System.out.println(sum);
        sc.close();
    }
}

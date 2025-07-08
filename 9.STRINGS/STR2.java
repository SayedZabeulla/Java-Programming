// Sample Input 0
// HelloWorld
// 10

// Return a string representing the lowercase letters and the total count.
// Sample Output 0
// elloorld 8

// Sample Input 1
// JavaProgramming
// 15

// Sample Output 1
// avarogramming 13

import java.util.Scanner;
public class STR2 {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int n =sc.nextInt();
        String str1 ="";
        int count =0;
        for (int i=0; i<str.length(); i++){
            char check =str.charAt(i);
            if (check>='a' && check<='z'){
                count++;
                str1 =str1+check;
            }
        }
        System.out.print(str1+" "+count);
        sc.close();
    }
}
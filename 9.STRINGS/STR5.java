// Sample Input 0
// abcxyzgh

// Sample Output 0
// 5

// Explanation 0
// In this input:
// Letters a, b, c, g, and h are correctly positioned at 1, 2, 3, 7, and 8 respectively.
// The rest of the letters are not in their correct positions.

// Sample Input 1
// abcxyz

// Sample Output 1
// 3

// Explanation 1
// In this input:
// Letters a, b, and c are correctly positioned at positions 1, 2, and 3, respectively.
// The other letters x, y, and z are not in their correct positions.

import java.util.Scanner;
public class STR5 {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        String str0 =sc.nextLine();
        str0 =str0.toLowerCase();
        int count=0;
        for (int i=0; i<str0.length(); i++){
            char check =str0.charAt(i);
            char check1 =(char)('a'+i);
            if (check == check1){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

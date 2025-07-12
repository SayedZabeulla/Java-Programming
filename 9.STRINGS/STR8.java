// Sample Input 0
// Hello world

// Sample Output 0
// world Hello

// Explanation 0
// The words "Hello" and "world" have been reversed to "world Hello".

// Sample Input 1
// Coding is awesome

// Sample Output 1
// awesome is Coding

// Explanation 1
// The words "Coding", "is", and "awesome" have been reversed to "awesome is Coding".

import java.util.Scanner;
public class STR8 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        String word [] =str.split(" ");
        for (int i =word.length-1; i>=0; i--){
            System.out.print(word[i]+" ");
        }
        sc.close();
    }
}

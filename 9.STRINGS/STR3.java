// Sample Input 0
// welcome to mettl
// l

// Sample Output 0
// wecome to mett

// Explanation 0
// As l is the character which is required to be removed, 
// therefore all the occurrences of l are removed, 
// keeping all other characters.

// Sample Input 1
// Lord out of Rings
// o

// Sample Output 1
// Lrd ut f Rings

// Explanation 1
// As o is the character which is required to be removed, 
// therefore all the occurrences of o are removed, 
// keeping all other characters.

import java.util.Scanner;
public class STR3 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        String str0 =sc.nextLine();
        char ch =sc.next().charAt(0);
        String str1 ="";
        for (int i=0; i<str0.length(); i++){
            char check =str0.charAt(i);
            if (check!=ch){
                str1 =str1+check;
            }
        }
        System.out.println(str1);
        sc.close();
    }
}

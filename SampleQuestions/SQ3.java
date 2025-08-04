import java.util.Scanner;
public class SQ3 {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        String str0 =sc.nextLine();
        String str1 =sc.nextLine();
        int c0 =0;
        char ch1 [] = str0.toCharArray();
        char ch2 [] =str1.toCharArray();
        for(int i=0 ; i<str1.length(); i++){
            for (int j=0; j<str0.length(); j++){
                if (ch2[i] == ch1[j]){
                    c0++;
                }
            }
        }
        int c1 =0;
        for (int i=0; i<str1.length(); i++){
            c1++;
        }
        System.out.println(c0/c1);
    }
}
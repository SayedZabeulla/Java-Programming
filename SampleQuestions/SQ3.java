import java.util.Scanner;
public class SQ3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str0 =sc.nextLine();
        String str1 =sc.nextLine();
        int c =0;
        while(str0.length()>0){
            for(int i=0; i<str1.length(); i++){
                if (str1 == str0){
                    c++;
                }
            }
            
        }
        System.out.println(c);
    }
}

import java.util.Scanner;
public class temp {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str0 =sc.nextLine();
        str0 =str0.toLowerCase();
        char ch[] =str0.toCharArray();
        int c =0;
        for(int i=0; i<str0.length(); i++){
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                c++;
            }
        }
        // StringBuilder sb =new StringBuilder(str0);
        // String rev =sb.reverse().toString();
        System.out.print(c);
        sc.close();
    }
}
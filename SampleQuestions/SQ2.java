import java.util.Scanner;
public class SQ2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] =new int[n];
        for (int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        
        int temp[] =new int [n];
        int fin[] =new int [n];
        for (int i=0; i<n; i++){
            while(arr[i]>0){
                temp[i] =arr[i]%10;
                fin[i] =fin[i]+temp[i];
                arr[i]/=10;
            }
        }

        for (int i=0; i<n; i++){
            System.out.print(fin[i]+" ");
        }
        sc.close();
    }
}
import java.util.Scanner;
public class SQ1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int r =sc.nextInt();
        int c =sc.nextInt();
        int arr[][] =new int[r][c];

        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                arr[i][j] =sc.nextInt();
            }
        }

        int count =0;
        for(int i=0; i<r; i++){
            for (int j=0; j<c-1; j++){
                if (arr[i][j]==1 && arr[i][j+1]==1){
                    count++;
                }
            }
        }

        for(int j=0; j<c; j++){
            for (int i=0; i<r-1; i++){
                if(arr[i][j]==1 && arr[i+1][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count-1);
        sc.close();
    }
}
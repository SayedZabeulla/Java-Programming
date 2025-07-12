// Sample Input 0
// 5
// 101 105 110 120 130
// 107

// Sample Output 0
// 101 105 107 110 120 130

// Explanation 0
// The array is initially sorted as [101, 105, 110, 120, 130]. 
// The new product ID 107 is inserted in the correct position, 
// between 105 and 110, resulting in the array [101, 105, 107, 110, 120, 130].

// Sample Input 1
// 4
// 100 200 300 400
// 150

// Sample Output 1
// 100 150 200 300 400

// Explanation 1
// The array is initially sorted as [100, 200, 300, 400]. 
// The new product ID 150 is inserted in the correct position, 
// between 100 and 200, resulting in the array [100, 150, 200, 300, 400].

import java.util.Scanner;
public class A1D1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();    
        int arr[] =new int[n+1];
        int i;
        for (i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int newId =sc.nextInt();
        for (i=n-1; i>=0 && arr[i]>newId; i--){
            arr[i+1]=arr[i];
        }

        arr[i+1]=newId;
        for (i=0; i<=n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
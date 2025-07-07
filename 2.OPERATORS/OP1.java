// Sample Input 0
// 50
// 20

// Sample Output 0
// The required length is 140 m
// The required area of carpet is 1000 sqm

// Explanation 0
// The user inputs 50 for the length and 20 for the breadth. 
// This means the fighting ground is 50 meters long and 20 meters wide.
// Perimeter (Length of Rope): Perimeter = 2 × (Length + Breadth) = 2 × (50 + 20) = 2 × 70 = 140 meters 
// Area (Carpet Area): Area = Length × Breadth = 50 × 20 = 1000 square meters
// The required length is 140 m" indicating the length of the rope needed for the fence. 
// The required area of carpet is 1000 sqm" indicating the area that the carpet should cover.

// Sample Input 1
// 30
// 15

// Sample Output 1
// The required length is 90 m
// The required area of carpet is 450 sqm

import java.util.Scanner;
public class OP1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int length =sc.nextInt();
        int breadth =sc.nextInt();
        int perimeter =0;
        int area =0;
        perimeter =2*(length+breadth);
        area =length*breadth;
        System.out.println("The required length is "+perimeter+" m");
        System.out.println("The required area of carpet is "+area+" m");
        sc.close();

    }
}
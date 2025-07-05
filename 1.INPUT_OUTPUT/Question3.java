// Input & Output - Student Information Management System  
// Sample Input 0

// Rajeev
// 20
// 8.6467
// B
// Sample Output 0

// Name: Rajeev
// Age: 20
// CGPA: 8.64
// Grade: B
// Sample Input 1

// Alice
// 22
// 9.7564
// A
// Sample Output 1

// Name: Alice
// Age: 22
// CGPA: 9.75
// Grade: A

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name =sc.nextLine();
        int age =sc.nextInt();
        double cgpa =sc.nextDouble();
        char grade =sc.next().charAt(0);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: "+grade);
        sc.close();
    }
}
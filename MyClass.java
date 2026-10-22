import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        
        if (marks > 90) {
            System.out.println("Grade: A+ (Outstanding)");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Excellent)");
        } else if (marks >= 70) {
            System.out.println("Grade: B+ (Very Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 50) {
            System.out.println("Grade: C (Average)");
        } else if (marks >= 40) {
            System.out.println("Grade: D (Below Average)");
        } else {
            System.out.println("Grade: F (Needs Improvement)");
            System.out.println("Time to lock in and grind harder!");
        }
    }
}

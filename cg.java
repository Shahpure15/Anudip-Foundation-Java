// Calculate CGPA of three subjects out of 100

import java.util.Scanner;

public class cg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1 : ");
        float a = scan.nextFloat();
        System.out.println("Enter Marks of Subject 2 : ");
        float b = scan.nextFloat();
        System.out.println("Enter Marks of Subject 3 : ");
        float c = scan.nextFloat();
        float cgpa = (a+b+c)/30;
        System.out.println("CGPA is : " + cgpa);

    }
}

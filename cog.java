
// JAVA PRACTICE SET 2

// Write a java program to Encrypt a grade by adding 8 to it . Decrypt it to show the Correct grade

import java.util.Scanner;

public class cog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char a = scan.next().charAt(0);
        //encrypting
        a = (char)(a+8);
        System.out.println(a);
        //decrypting
        a =(char)(a-8);
        System.out.println("Real Grade is : " + a);



        // use the comparisoon operator to check which is greater
        // given number is 35

        int b = 35;
        System.out.println("Enter a expected number for Checking ");
        int c = scan.nextInt();
        System.out.println(c>b);


        // show given equation in jawa

        System.out.print("Enter Final Velocity : ");
        float v = scan.nextFloat();
        System.out.print("Enter initial Velocity : ");
        float u = scan.nextFloat();
        System.out.print("Enter Displacement : ");
        float s = scan.nextFloat();
        System.out.print("Enter Acceleration : ");
        float A = scan.nextFloat();
        System.out.print("Final Result   ");
        float R = ((v*v)-(u*u))/(2*A*s);
        System.out.println(R);

        // Interpret the Result
      
        int x = 7;
        int y = x*49/7 + 35/7;
        System.out.println(y);

    }
}

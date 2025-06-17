// Take in input from user as his/her name and returns the o/p as Hello <name> , have a good day !! 

import java.util.Scanner;
public class greet {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter Your Name :-)  ");
            String a = scan.nextLine();
            System.out.println("Hello " + a + " have a good day !!");
        }

    }
}

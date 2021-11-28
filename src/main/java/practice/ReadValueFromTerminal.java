package practice;

import java.util.Scanner;

public class ReadValueFromTerminal {
    public void getUserInput() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String s = in.nextLine();
        System.out.println("Your entered string: " + s);

        System.out.print("Enter Your Age: ");
        int a = in.nextInt();
        System.out.println("Your Entered Age: " + a);
    }
}

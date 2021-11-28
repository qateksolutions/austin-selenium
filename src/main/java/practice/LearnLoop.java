package practice;

public class LearnLoop {
    public void whileLoop() {
        // Print numbers from 1 to 100
        int x = 1;
        while (x <= 100) {
            System.out.println("Value of x: " + x);
            x++;
        }
    }

    public void forLoop() {
        // Print numbers from 1 to 100
        for (int x = 1; x <= 100; x++) {
            System.out.println("Value of x: " + x);
        }
    }

    public void doWhileLoop() {
        // Print numbers from 1 to 100
        int x = 1;
        do {
            System.out.println("Value of x: " + x);
            x++;
        } while (x <= 100);
    }
}

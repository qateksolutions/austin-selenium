package practice;

public class LearnRecursion {
    public int sum(int k) {
        if (k > 0) {
            return k + sum(k -1);
        } else {
            return 0;
        }
    }

    // Print 1 to 100 without the loop
    public void printNumbers(int number) {
        if (number <= 100) {
            System.out.println(number);
            printNumbers(number + 1);
        }
    }
}

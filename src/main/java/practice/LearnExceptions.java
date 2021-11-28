package practice;

public class LearnExceptions {
    public void addArrayNumbers() {
        try {
            int a = 1;
            int b = 2;
            int result = a + b;
            System.out.println("Summation: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void subtractArrayNumbers() {
        try {
            int[] numbers = {1,2,3};
            int result = numbers[2] - numbers[0];
            System.out.println("Subtraction: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void multiplyArrayNumbers() {
        try {
            int[] numbers = {1,2,3};
            int result = numbers[4] * numbers[0];
            System.out.println("Multiplication: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

package practice;

public class LearnVariables {
    public int salary = 2000;

    public void intVariables() {
        int mySalary = 2000;
        System.out.println("My salary is: " + mySalary);
    }

    public void floatVariables() {
        float price = 45.6f;
        System.out.println("Product price is: " + salary);
    }

    public void booleanVariables() {
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is: " + red + " green list is: " + green);
    }

    public void characterVariables() {
        char alphabet = 'A';
        System.out.println("Alphabet is: " + salary);
    }

    public void stringVariables() {
        String name = "Robin";
        String city = "Philadelphia";
        System.out.println("My name is " + name + " I live in " + city);
    }

    int addNumbers(int a, int b) {
        intVariables();
        int sum = a + b;
        return sum;
    }
}

package practice;

import java.util.Arrays;

public class LearnStringMethods {
    public void learnIndexOff() {
        String myStr = "Hello planet earth, you are a great planet.";
        int positionOfPlanet = myStr.indexOf("planet");
        System.out.println(positionOfPlanet);
        System.out.println(myStr.indexOf("planet", 15));
        System.out.println(myStr.indexOf("test"));

        String spaceCount = "             ";
        System.out.println("Length of Empty String " + spaceCount.length());
    }

    public void learnSubstring() {
        String str = "JavaPoint";
        String subStr1 = str.substring(2); //vaPoint
        System.out.println(subStr1);

        String subStr2 = str.substring(0,4); //Java
        System.out.println(subStr2);

        //Print java from the above String
        // length of Java word is 4
        String searchWord = "Java";
        int searchWordStartingPosition = str.indexOf("Java");
        String subStrJava = str.substring(searchWordStartingPosition, searchWord.length());
        System.out.println("Search Keyword: " + subStrJava);
    }

    public void learnReplace() {
        String str = "Hello World Hello";
        String replacedStr = str.replace('l', 'p');
        String replaceWord = str.replaceAll("World", "Florida");
        String replaceFirst = str.replaceFirst("Hello", "Hi");
        System.out.println(replaceFirst);
    }

    public void learnTrim() {
        String str = "      Hello World!        ";
        System.out.println(str);
        System.out.println(str.trim());
    }

    public void learnCharAt() {
        // Print a word in reverse order
        // Hello => olleH
        String str = "Hello";
        String reverseWord = "";
        for(int i = str.length()-1; i >= 0; i--) {
            char result = str.charAt(i);
            reverseWord += String.valueOf(result);
        }
        System.out.println(reverseWord);
    }

    public void learnFormat() {
        // My name is Jonathan, and I am 20 years old and my salary is $40000 yearly";
        // My name is Michael, and I am 30 years old and my salary is $50000 yearly";
        String name = "Jonathan";
        int age = 20;
        int salary = 40000;

        System.out.println("My name is " + name + ", and I am " + age + " years old and my salary is $" + salary + " yearly");

        // Using the format() to format a string
        String s = String.format("My name is %s, and I am %d years old and my salary is $%d yearly", name, age, salary);
        System.out.println(s);
    }

    public void learnContains() {
        String str = "My name is John";
        System.out.println(str.contains("Jo"));
    }

    public void learnSplitMethod() {
        String names = "John,Ali,Mathew,Abraham";
        String[] nameArray = names.split(",");
        System.out.println(Arrays.toString(nameArray));
        for(String name : nameArray) {
            System.out.println("Individual Name: " + name);
        }
    }
}

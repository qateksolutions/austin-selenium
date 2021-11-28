package practice;

public class HomeWork {
    public int[] arrayFirstElement(int[] a, int[] b) {
        int[] newArray = {6,7,8,9}; // length = 4
        int middleElementIndex = newArray.length/2; // 4/2 = [2]
        int[] middleArray = {newArray[middleElementIndex - 1],newArray[middleElementIndex]};
        return newArray;
    }

    public int countHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) { // "abc hi ho"
            String name = str.substring(i, i + 2);
            if (name.equals("hi")) {
                counter++;
            }
        }
        return counter;
    }

}

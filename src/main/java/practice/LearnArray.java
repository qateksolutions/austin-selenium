package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnArray {
    public void stringArray() {
        String[] statesName = {"Florida", "California", "Georgia", "Texas"};
        Arrays.sort(statesName, Collections.reverseOrder());
        System.out.println(Arrays.toString(statesName));
    }

    public void listArray() {
        List<String> lists = new ArrayList<>();

        lists.add("One");
        lists.add("Two");
        lists.add("Three");

        //System.out.println(lists);

//        for(String list : lists) {
//            System.out.println("Print value of list is: " + list);
//        }

        for(int i = 0; i < lists.size(); i++) {
            System.out.println("Print value of list is: " + lists.get(i));
        }

        lists.remove(1);
        lists.add("Four");

        System.out.println(lists);
    }

    List<String> list;
    String[] array;

    public void convertArrayToList() {
        array = new String[]{"Java", "Python", "PHP", "C++"};
        System.out.println("Printing Array: " + Arrays.toString(array));

        //Converting Array to List
        list = new ArrayList<>();
        for(String language : array) {
            list.add(language);
        }

        System.out.println("Printing List: " + list);

        // Adding value into the list
        list.add("Ruby");
        list.add("Visual Basic");

        System.out.println("Printing List after adding new languages: " + list);
    }

    public void convertListToArray() {
        array = list.toArray(new String[list.size()]);
        System.out.println("Printing Array upon converting from list: " + Arrays.toString(array));
    }


}

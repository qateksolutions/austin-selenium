package practice;

import java.util.HashMap;

public class LearnHashMap {
    public void AddHashMapValue() {
        HashMap<String,String> hmap = new HashMap<>();
        hmap.put("IE", "Internet Explorer");
        hmap.put("Chrome", "Google Chrome");
        hmap.put("Firefox", "Mozilla Firefox");
        hmap.put("Safari", "Macbook browser");

        System.out.println("Browser Name: " + hmap.get("IE"));
        System.out.println(hmap);
    }

    public void hashMapProblem() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vishal", 10);
        map.put("Sachin", 30);
        map.put("Shekar", 20);

        System.out.println("Size of map: " + map.size());

        //Check if a key called "Vishal" and if present print the value
        if(map.containsKey("Vishal")) {
            System.out.println(map.get("Vishal"));
        }
    }
}

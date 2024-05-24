package CHUONG4;

import java.util.LinkedHashMap;
import java.util.Set;

public class slide96chuong4 {
     public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        linkedHashMap.put(3,"C");
        linkedHashMap.put(4, "D");

        System.out.println("Before remove: ");
        show(linkedHashMap);
        linkedHashMap.remove(4);
        
        System.out.println("After remove: ");
        show(linkedHashMap);
    }

    private static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet)
            System.out.println(key + " " + linkedHashMap.get(key));
    } 
}

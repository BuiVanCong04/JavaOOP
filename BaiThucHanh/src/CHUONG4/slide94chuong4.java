package CHUONG4;

import java.util.LinkedHashMap;
import java.util.Map;

public class slide94chuong4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> humg = new LinkedHashMap<Integer,String>();
        humg.put(1, "DH");
        humg.put(2, "Mo");
        humg.put(3, "Dia");
        humg.put(4, "Chat");

        for(Map.Entry<Integer, String> m:humg.entrySet())
            System.out.println(m.getKey() +" "+m.getValue());

        System.out.println("Ten truong truoc khi bi xoa: " + humg);
        humg.remove(2);
        System.out.println("Ten truong sau khi bi xoa: " + humg);
        
    }
}

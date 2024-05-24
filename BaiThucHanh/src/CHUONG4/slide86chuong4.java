package CHUONG4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide86chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSDL", "Co so du lieu");
        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("KTMT","Kien truc may tinh");
        hashMap.put("MMT", "Mang may tinh");

        Set<Map.Entry<String, String>> setHashmap = hashMap.entrySet();
        System.out.println("Cac mon hoc co trong setHashMap la: ");
        System.out.println(setHashmap);
    }
}

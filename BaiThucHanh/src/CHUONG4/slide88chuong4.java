package CHUONG4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide88chuong4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("HN", "Ha Noi");
        hashMapCity.put("TB", "Thai Binh");
        hashMapCity.put("HP", "Hai Phong");
        hashMapCity.put("ND", "Nam Dinh");

        System.out.println("Danh sach cac thanh pho co trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("TB: " + hashMapCity.get("TB"));

        System.out.println("QN: " + hashMapCity.get("QN"));
        if (hashMapCity.containsValue("Ha Noi")) {
            System.out.println("Co thanh pho Ha Noi trong hashMapCity");
        }
    
    }
}

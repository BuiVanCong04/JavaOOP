package CHUONG4;

import java.util.HashSet;
import java.util.Scanner;

public class slide56chuong4 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSetString = new HashSet<>();
        hashSetString.add("Samsung");
        hashSetString.add("Iphone");
        hashSetString.add("Nokia");
        hashSetString.add("Samsung");
        hashSetString.add("Xiaomi");

        System.out.println("Cac phan tu co trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa");
        name = sc.nextLine();

        if(hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai co trong heshSetString la: ");
            System.out.println(hashSetString);
        }
        else{
            System.out.println("Xoa khong thanh cong!");
        }
    }
}

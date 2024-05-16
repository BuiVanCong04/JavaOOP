package CHUONG4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class slide60chuong4 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("C++");
        linkedHashSet.add("C#");
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");

        System.out.println("cac phan tu trong linkendHashSet: ");
        System.out.println(linkedHashSet);
        System.out.println("Nhap phan tu can xoa: ");
        a = sc.nextLine();

        if(linkedHashSet.contains(a)) {
            linkedHashSet.remove(a);
            System.out.println("cac phan tu trong linkedHashSet sau khi xoa laf: ");
            System.out.println(linkedHashSet);
        }
        else {
            System.out.println("Phan tu" + a + " khong ton tai! ");
        }
    }
}

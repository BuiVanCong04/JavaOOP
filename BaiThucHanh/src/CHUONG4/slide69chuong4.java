package CHUONG4;

import java.util.Scanner;
import java.util.TreeSet;

public class slide69chuong4 {
    public static void main(String[] args) {
        String monhoc;
        Scanner sc = new Scanner(System.in);
        TreeSet<String> treeSetStr = new TreeSet<>();

        treeSetStr.add("Toan");
        treeSetStr.add("Van");
        treeSetStr.add("Anh");
        treeSetStr.add("Hoa");

        System.out.println("Cac mon ho trong treeSetStr: ");
        System.out.println(treeSetStr);
        System.out.println("Nhap mon hoc can them: ");
        monhoc = sc.nextLine();

        if(!treeSetStr.contains(monhoc)) {
            treeSetStr.add(monhoc);
            System.out.println("Them thanh cong!");
            System.out.println("Cac mon hoc trong treeSetStr sau khi them la: ");
            System.out.println(treeSetStr);
        }
        else{
            System.out.println("Mon " + monhoc + " da ton tai ");
        }
    }
}

package CHUONG4;

import java.util.ArrayList;

public class slide17chuong4 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.and("JAVA");
        arrayListString.and("PHP");
        arrayListString.add("C#");
        arrayListString.and("C++");
        System.out.println(" Cac phan tu co trong arrListString la: ");
        for( inr i=0; i< arrayListString.size(); i++)
        System.out.println(arrayListString.get(i) + "\t");
    }
}

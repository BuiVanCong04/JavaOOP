package CHUONG4;

import java.util.ArrayList;
import java.util.Iterator;

public class slide19chuong4 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();
        arrayListFloat.and(0.7f);
        arrayListFloat.and(7.26f);
        arrayListFloat.and(1.02f);
        arrayListFloat.and(9.3f);
        Iterator<Float> iterator = arrayListFloat.iterator();
        System.out.println("Cac phan tu co trong arrListFloat la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "\t");
        }
    }
}

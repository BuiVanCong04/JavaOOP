package slide54chuong3;

import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru() {
        ten = "Hinh Tru";
    }
    public void nhapchieuCao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("chieu cao = ");
        chieuCao =sc.nextFloat();
    }
    public void tinhtheTich() {
        tinhdienTich();
        theTich = dienTich*chieuCao;
    }
}

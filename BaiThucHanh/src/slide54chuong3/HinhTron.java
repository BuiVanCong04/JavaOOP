package slide54chuong3;

import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float banKinh;
    public HinhTron() {
        ten = "Hinh Tron";
    }
    public void nhapbanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban kinh = ");
        banKinh = sc.nextFloat();
    }
    public void tinhchuVi() {
        chuVi = 2*PI*banKinh;
    }
    public void tinhdienTich() {
        dienTich = PI*banKinh*banKinh;
    }
    
}

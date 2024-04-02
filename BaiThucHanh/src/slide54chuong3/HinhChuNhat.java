package slide54chuong3;

import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float chieuDai;
    public float chieuRong;
    public HinhChuNhat() {
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu dai = ");
        chieuDai = sc.nextFloat();
    }
    public void nhapChieuRong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chieu rong = ");
        chieuRong = sc.nextFloat();
    }
    public void tinhchuVi() {
        chuVi = 2*( chieuDai + chieuRong); 
    }
    public void tinhdienTich() {
        dienTich = chieuDai*chieuRong;
    }
    
}

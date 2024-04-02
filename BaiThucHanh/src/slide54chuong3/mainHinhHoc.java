package slide54chuong3;
import slide54chuong3.HinhTron;
import slide54chuong3.HinhTru;
import slide54chuong3.HinhChuNhat;
import slide54chuong3.HinhVuong;
public class mainHinhHoc {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapbanKinh();
        ht.tinhchuVi();
        ht.tinhdienTich();
        ht.inchuVi();
        ht.indienTich();
        
        HinhTru htr = new HinhTru();
        htr.xuatTen();
        htr.nhapchieuCao();
        htr.nhapbanKinh();
        htr.tinhtheTich();
        htr.intheTich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhchuVi();
        hcn.tinhdienTich();
        hcn.inchuVi();
        hcn.indienTich();

        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhchuVi();
        hv.tinhdienTich();
        hv.inchuVi();
        hv.indienTich();
    }

    
}

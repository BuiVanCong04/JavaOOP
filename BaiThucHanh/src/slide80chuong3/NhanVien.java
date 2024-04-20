package slide80chuong3;

public class NhanVien {
    protected String ten;
    protected long luong;
    public NhanVien() {
        ten = "";
        luong = 0;
    }
    public NhanVien(String ten){
        this.ten = ten;
    }
    protected String loaiNhanVien() {
        return"";
    }
    public void Display() {
        System.out.print("Nhan vien: " + ten );
        System.out.print(" - Loai nhan vien: " + loaiNhanVien() );
        System.out.print("- Luong = " + luong + "VND");
    }
}

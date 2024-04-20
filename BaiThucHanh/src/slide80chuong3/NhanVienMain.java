package slide80chuong3;

public class NhanVienMain {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Bui Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Tran Van Linh ", 3);
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Nguyen Thi Linh ", 0);
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienPartTime thoivu = new NhanVienPartTime("Vu Van Duy", 200);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoivu.tinhLuong();
        //xuat thong tin 
        sep.Display();
        linh1.Display();
        linh2.Display();
        thoivu.Display();

    }
}

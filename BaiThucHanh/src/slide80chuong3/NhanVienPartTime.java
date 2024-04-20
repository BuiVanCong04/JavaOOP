package slide80chuong3;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;
    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        thic.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien() {
        return "nhan vien thoi vu";
    }
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}

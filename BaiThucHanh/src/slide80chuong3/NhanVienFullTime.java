package slide80chuong3;

public class NhanVienFullTime extends NhanVien {
    public NhanVienFullTime(String ten){
        this.ten = ten;
    }
    private int ngayLamThem;
    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    private int loaiChucVu;
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien() {
        return "nhan vien toan thoi gian";
    }
    public void tinhLuong(){
       if(loaiChucVu==1) {
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
       }
       else if(loaiChucVu==2) {
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
       }
    }        
}

import java.util.Scanner;
public class Employee {
    public String name;
    public int tuoi;
    public int songaylam;
    public double luong = 200000;
    public double tienluong;

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien: ");
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap so ngay lam: ");
        songaylam = sc.nextInt();
        
    }
    void inThongTin() {
        System.out.println("Hien thi thong tin nhan vien: ");
        System.out.println("Ho ten: " + name);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("So ngay lam: " + songaylam);
        System.out.println("Luong: " + luong);
    }
    void tinhTienluong() {
        tienluong = luong*songaylam;
    }
    void inTienluong() {
        System.out.print("Tien luong: " + tienluong);
    }
    public static void main(String[] args) {
        Employee nv = new Employee();
        nv.nhapThongTin();
        nv.inThongTin();
        nv.tinhTienluong();
        nv.inTienluong();
    }
}

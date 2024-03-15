import java.util.Scanner;
public class Student {
    public String name;
    public double diemToan;
    public double diemLy;
    public double diemHoa;
    public double dTB;

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        System.out.print("Nhap ho ten:");
        name = sc.nextLine();
        System.out.print("Nhap diem Toan:");
        diemToan = sc.nextDouble();
        System.out.print("Nhap diem Ly:");
        diemLy = sc.nextDouble();
        System.out.print("Nhap diem Hoa:");
        diemHoa = sc.nextDouble();
    }
    void inThongTin() {
        System.out.println("Hien thi: ");
        System.out.println("Ho ten: " + name);
        System.out.println("diem Toan: " + diemToan);
        System.out.println("diem Ly: " + diemLy);
        System.out.println("diem Hoa: " + diemHoa);
    }
    void tinhDiemTrungBinh() {
        dTB = (diemToan + diemLy + diemHoa)/3;        
    }
    void inDiemTrungBinh() {
        System.out.print("diem Trung Binh mon: " + dTB);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.nhapThongTin();
        student.inThongTin();
        student.tinhDiemTrungBinh();
        student.inDiemTrungBinh();
    }
}

package People;

import java.util.Scanner;

public class Employee extends Person {
    public String chucVu;
    public double luong = 20000;
    public String IDnhanvien;
    Scanner sc = new Scanner(System.in);
    public Employee() {
        chucVu = "";
        IDnhanvien = "";
    }
    public void xuatvitri() {
        System.out.print("=====" + chucVu + "=====");
    }
    public void EnterData() {
        super.EnterData();
        System.out.print("ID nhan vien: ");
        IDnhanvien = sc.nextLine();
    }
    public void Display() {
        super.Display();
        System.out.println("ID nhan vien: " + IDnhanvien);
        System.out.println("Luong: " + luong + "VND");
    }
}

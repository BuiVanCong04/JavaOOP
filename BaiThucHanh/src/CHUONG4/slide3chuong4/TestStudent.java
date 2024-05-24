package CHUONG4.slide3chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrayListStudent = new ArrayList<>();
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        Student.Add(arrayListStudent, n);
        System.out.println("Danh sach sinh vien: ");
        Student.Hienthidulieu(arrayListStudent);

        Student.Update(arrayListStudent);
        System.out.println("Danh sach sinh vien sau khi cap nhat: ");
        Student.Hienthidulieu(arrayListStudent);

        Student.Delete(arrayListStudent);
        System.out.println("Danh sach sinh vien sau khi xoa: ");
        Student.Hienthidulieu(arrayListStudent);
    }
}

package CHUONG4.slide3chuong4;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Student {
    private String Fullname;
    private int Age;
    public Student() {
    }
    public Student (String Fullname, int Age) {
        this.Fullname = Fullname;
        this.Age = Age;
    }
    public String getFullname() {
        return Fullname;
    }
    public void setFullName() {
        this.Fullname = Fullname;
    }
    public int getAge() {
        return Age;
    }
    public void setAge() {
        this.Age = Age;
    }
    public void Nhapdulieu() {
        System.out.println("Nhap thong tin sinh vien: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        Fullname = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        Age = sc.nextInt();
    }
    //hien thi toan bo du lieu cac phan tu trong ListStudent
    public static void Hienthidulieu(List<Student> listStudent) {
        for( int i=0; i<listStudent.size(); i++) {
            String fName = listStudent.get(i).Fullname;
            int age = listStudent.get(i).Age;
            System.out.println("Sinh vien " + fName + "\n tuoi = " + age );
        }
    } 
    //hien thi toan bo du lieu cac phan tu trong setStudent
    public static void Hienthidulieu(Set<Student> setStudent) {
        for(Student std : setStudent) {
            String fName = std.Fullname;
            int age = std.Age;
            System.out.println("Sinh vien " + fName + "\n tuoi = " + age );
        }
    } 
    public static void Add(List<Student> listStudent, int n) {
        for(int i=0; i<n; i++) {
            Student std = new Student();
            std.Nhapdulieu();
            listStudent.add(std); //add vao listStudent
        }
    }
    public static void Add(Set<Student> setStudent, int n) {
        for(int i=0; i<n; i++) {
            Student std = new Student();
            std.Nhapdulieu();
            setStudent.add(std); //add vao listStudent
        }
    }
    public static void Update(List<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin muon thay doi: ");
        String fName = sc.nextLine();
        //tim kiem co thong tin trung hay khong
        for(int i=0; i<listStudent.size(); i++) {
            if(listStudent.get(i).Fullname.equals(fName)) {
                //neu thay ttin trung thi nhap ttin moi va cap nhap vao list
                Student std = new Student();
                std.Nhapdulieu();
                listStudent.set(i,std);
            }
        }
    }
    public static void Update(Set<Student> setStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin muon thay doi: ");
        String fName = sc.nextLine();
        for (Student std : setStudent) {
            if(std.Fullname.equals(fName)) {
                Student newStd = new Student();
                newStd.Nhapdulieu();
                setStudent.remove(std);
                setStudent.add(std);
                break;
            }
        }
    }
    public static void Delete(List<Student> listStudent) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin muon xoa: ");
        String fName = sc.nextLine();
        for(int i=0; i<listStudent.size(); i++) {
            if(listStudent.get(i).Fullname.equals(fName))
                listStudent.remove(i);
        }
    } 
}

package People;

import java.util.Scanner;
public class Person {
    public String Hoten;
    public int tuoi;
    public String diaChi;
    public int sdt;

    Scanner sc = new Scanner(System.in);
    public Person() {
        Hoten = "";
        tuoi = 0;
        diaChi = "";
        sdt = 0;
    }
    public void EnterData() {
        System.out.print("Hoten = ");
        Hoten = sc.nextLine();
        System.out.print("tuoi = ");
        tuoi = sc.nextInt();
        System.out.print("diaChi = ");
        diaChi = sc.next();
        System.out.print("sdt = ");
        sdt = sc.nextInt();
    }
    public void Display() {
        System.out.println("Hoten: " + Hoten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("diaChi: " + diaChi);
        System.out.println("sdt: " + sdt);
    }
}

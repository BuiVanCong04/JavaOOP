import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double a, b, Tong, Hieu, Tich, Thuong, Chiadu;
        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("nhap a = ");
        a= sc.nextDouble();
        System.out.print("nhap b = ");
        b= sc.nextDouble();
        Tong = a + b;
        System.out.println("Tong = " + Tong );
        Hieu = a - b;
        System.out.println("Hieu = " + Hieu );
        Tich = a * b;
        System.out.println("Tich = " + Tich );
        Thuong = a / b;
        System.out.println("Thuong = " + Thuong );
        Chiadu = a % b;
        System.out.println("Chiadu = " + Chiadu );
        if ( a > b ) {
            System.out.println(" a > b ");
        }
        else if ( a < b ) {
            System.out.println(" a < b ");
        }
        else {
            System.out.println(" a = b ");
        }
    }
}
/**
 * PhuongTrinhBacNhat
 */

import java.util.Scanner;

public class PhuongTrinhBacNhat {

    public static void main(String[] args) {
        double heSoA, heSoB, nghiemX;
        Scanner sc = new Scanner(System.in);
        System.out.print( "A= ");
        heSoA = sc.nextDouble();
        System.out.print( "B= ");
        heSoB = sc.nextDouble();
        sc.close();
        if(heSoA == 0){
            System.out.println( "Khong phai phuong trinh bac nhat");
        }
        else{
            nghiemX = (double) -heSoB / heSoA;
            System.out.println("Phuong trinh co nghiem la: " + nghiemX);
        }
    }
}
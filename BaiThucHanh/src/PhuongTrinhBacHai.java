import java.util.Scanner;

/**
 * PhuongTrinhBacHai
 */
public class PhuongTrinhBacHai {

    public static void main(String[] args) {
        double heSoA, heSoB, heSoC, nghiemX1, nghiemX2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.print( "A= ");
        heSoA = sc.nextDouble();
        System.out.print( "B= ");
        heSoB = sc.nextDouble();
        System.out.print( "C= ");
        heSoC = sc.nextDouble();
        sc.close();
        if(heSoA == 0){
            System.out.println("Khong phai la phuong trinh bac hai ");
        }
        else{
            delta = Math.pow(heSoB, 2) - 4*heSoA*heSoC;
            if(delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if(delta == 0){
                nghiemX1 = nghiemX2 = -heSoB / (2*heSoA);
                System.out.println("Phuong trinh co nghiem kep la: " + nghiemX1);}
            if(delta>0){
                nghiemX1 = (-heSoB + Math.sqrt(delta)) / (2* heSoA);
                nghiemX2 = (-heSoB - Math.sqrt(delta)) / (2* heSoA);
                System.out.println("Phuong trinh co 2 nghiem phan biet la: " + "x1=" + nghiemX1 + "&" + "x2=" + nghiemX2);}    
        }
    }    
}
import java.util.Scanner;

/**
 * Bai10
 */
public class Bai10 {

    public static void main(String[] args) {
        int dem=0;
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap chuoi: ");
            chuoi = sc.nextLine();
        }while(chuoi.length() > 80);
        System.out.print("Nhap ky tu: ");
        kyTu = sc.next().charAt(0);
        for(int i=0; i<chuoi.length(); i++)
        if(kyTu == chuoi.charAt(i))
        dem++;
        System.out.println("So ky tu " + kyTu + " xuat hien trong chuoi " + chuoi + " = " + dem);
    }
}
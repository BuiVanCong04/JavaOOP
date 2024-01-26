import java.util.Scanner;
/**
 * slide47chuong2
 */
public class slide47chuong2 {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        while(sum <= 100) {
            System.out.print("Nhap so nguyen n :" );
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("Tong = " +sum);
    }
}
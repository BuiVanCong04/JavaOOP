import java.util.Scanner;

/**
 * slide74chuong2
 */
public class slide74chuong2 {

    public static void main(String[] args) {
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i = 0; i < n ; i++ ) {
            arr[i] = sc.nextDouble();
            if (arr[i] % 2 == 0 ) {
                sum += arr[i];
            }
        }
        System.out.println("Tong cac so chan trong mang la: " + sum );
    }
}
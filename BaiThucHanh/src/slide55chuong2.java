import java.util.Scanner;
/**
 * slide55chuong2
 */
public class slide55chuong2 {

    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Cac so chia het cho 5 la: ");
        for(n = 0; n <= 20; n++)
        if (n % 5 == 0 )
        System.out.println(n);
    }
}
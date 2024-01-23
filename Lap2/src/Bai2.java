import java.util.Scanner;

/**
 * Bai2
 * chanle
 */
public class Bai2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print(" a = ");
        a = sc.nextInt();
        if ( a % 2 == 0) {
            System.out.println( " a la so chan ");
        }
        else {
            System.out.println( " a la so le ");
        }
    }
}
import java.util.Scanner;
/**
 * sosanhhaisotrang35
 */
public class sosanhhaisotrang35 {
    public static void main(String[] args) {
        double a, b, min;
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        if(a > b){
            min = b;
            System.out.println("So nho nhat la: " + min );
        }    
        else if(a < b){
            min = a;
            System.out.println("So nho nhat la: " + min );
        }
    }
}
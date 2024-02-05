import java.util.Scanner;
/**
 * slide81chuong2
 */
public class slide81chuong2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int h = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int c = sc.nextInt();
        int[][] matran = new int[h][c];
        System.out.println("Nhap cac phan tu trong ma tran: ");
        for(int i=0; i < h; i++)
        for(int j=0; j < c; j++)
        matran[i][j] = sc.nextInt();
        int max = matran[0][0];
        for(int i=0; i < h; i++)
        for(int j=0; j < c; j++)
        if(max < matran[i][j]) max = matran[i][j];
        System.out.println("Phan tu lon nhat cua ma tran la: " + max);
    }
}
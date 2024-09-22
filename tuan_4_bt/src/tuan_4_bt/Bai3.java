import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n:");
        int n = sc.nextInt();
        int i = 1;
        int gt = 1;
        for (i=1;i<=n;i++)
        {
            gt = gt * i;
        }
        System.out.println("Giai thua cua n la:"+gt);
    }//
}


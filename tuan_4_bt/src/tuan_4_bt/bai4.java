package tuan_4_bt;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so nguyen :");
        int n = new Scanner(System.in).nextInt();
        int dem=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0)
              dem++;
        }
        if (dem==2)
            System.out.println(n+" la so nguyen to");
        else
            System.out.println(n+" khong phai la so nguyen to");
    }
}

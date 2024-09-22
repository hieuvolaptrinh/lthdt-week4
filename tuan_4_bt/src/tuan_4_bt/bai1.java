/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan_4_bt;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int tong = 0;
        for(int i=1;i<=n;i++)
            tong = tong + i;
        System.out.println("Tổng các số từ 1 đến n: "+tong);
    }
}

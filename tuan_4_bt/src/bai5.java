import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao hai so nguyen:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int num1=a;
        int num2=b;
        int UCLN;
        while (b != 0) {
            UCLN = b;
            b = a % b;
            a = UCLN;
        }
        UCLN=a;
        int BCNN=(num1 * num2) / a;
        System.out.println("UCLN của " + num1 + " và " + num2 + " là: " + UCLN);
        System.out.println("BCNN của " + num1 + " và " + num2 + " là: " + BCNN);
    }
}

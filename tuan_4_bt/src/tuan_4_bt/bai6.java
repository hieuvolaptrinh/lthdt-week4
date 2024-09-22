
import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vui lòng nhập số n bạn muốn kiểm tra đối xứng: ");
        int n = sc.nextInt();
        // Đếm số chữ số của n
        int dem = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            dem++;
        }
        
        boolean checkDoiXung = true;
        temp = n;
        while (dem > 1) {
            int dau = temp / (int) Math.pow(10, dem - 1);   // vì mình để trên temp >10
            int cuoi = temp % 10;                           
            if (dau != cuoi) {
                checkDoiXung = false;  
                break;
            }
            temp = (temp % (int) Math.pow(10, dem - 1)) / 10;
            dem -= 2;
        }

        if (checkDoiXung) {
            System.out.println(n + " là số đối xứng.");
        } else {
            System.out.println(n + " không phải là số đối xứng.");
        }
    }
}

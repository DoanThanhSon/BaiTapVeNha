package buoi23Thang2;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.print("nhap so thu " + (i+1) + ": ");
            int num = sc.nextInt();
            sum += num;
            if (sum>100) {
            	break;
            }
            System.out.println("Tong gia tri da nhap: " + sum+ " so gia tri da nhap "+(i+1));
        }
        System.out.println("Gia tri dung lai o: " + sum);
    }
	//

}

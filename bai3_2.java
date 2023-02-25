package buoi23Thang2;
import java.util.Scanner;
import java.util.Arrays;

public class bai3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập số giá trị trong hàm
        int number = sc.nextInt();
        //khai mảng
        int[] arr = new int[number];
        //tạo mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("gia tri thu " + (i + 1) + " bang: ");
            arr[i] = sc.nextInt();

        }

        //in ket qua
        System.out.print("Cac so nguyen to trong mang la: ");
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i])) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println();
        System.out.print("Mang ban dau la: ");
        System.out.print(Arrays.toString(arr));

    }

    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


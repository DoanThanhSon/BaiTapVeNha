package buoi23Thang2;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhap gia tri cua phan tu thu " + (i + 1) + ": ");
            int value = sc.nextInt();
            arr[i] = value;
        }

        int max = giaTriLonNhat(arr);
        int min = giaTriNhoNhat(arr);
        System.out.println("gia tri lon nhat trong mang la: " + max);
        System.out.println("gia tri nho nhat trong mang la: " + min);
    }

    public static int giaTriLonNhat(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int giaTriNhoNhat(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

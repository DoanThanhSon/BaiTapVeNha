package buoi23Thang2;

import java.util.Scanner;
import java.util.Arrays;

public class bai2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Nhập vào vị trí cần xóa phần tử
        int index = sc.nextInt();

        // Xóa phần tử tại vị trí đã nhập
        removeElement(arr, index);

        // In ra mảng sau khi xóa phần tử
        System.out.println(Arrays.toString(arr));
    }

    public static void removeElement(int[] arr, int index) {
        // Di chuyển các phần tử phía sau phần tử cần xóa về bên trái
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Giảm kích thước của mảng đi 1 đơn vị
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        arr = newArr;
    }
}
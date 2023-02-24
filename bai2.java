package buoi23Thang2;

import java.util.Scanner;

public class bai2 {

		// TODO Auto-generated method stub
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
	        int chan=timChan(arr);
	        int le=timLe(arr);
//	        System.out.println("gia tri le: "+timLe(arr));
//	        System.out.println("gia tri chan: "+timChan(arr));
	}
	    public static int timChan(int[] arr) {
	        int chan = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {
	                chan = arr[i];
	                System.out.println("gia tri chan: "+arr[i]);

	            }
	        }
	        return chan;
	    }

	    public static int timLe(int[] arr) {
	        int le = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 != 0) {
	                le = arr[i];	
	                System.out.println("gia tri le: "+arr[i]);

	            }
	        }
	        return le;
	    }
}
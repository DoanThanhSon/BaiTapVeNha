package buoi23Thang2;

import java.util.Scanner;

public class bai3 {


		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("gia tri can tra: ");
	        int n = sc.nextInt();
	        int[] arr = {8,9,10,100,90};
	        boolean timThay=false;

	        for (int i = 0; i < arr.length; i++) {
	        	if(arr[i]==n) {
	        		System.out.println(" tim thay so "+n+" o vi tri "+i);
	        		timThay = true;
	        	}
	        }
	        if (!timThay) {
	        	System.out.println("khong tim thay gia tri "+n);
	        }
	}

}

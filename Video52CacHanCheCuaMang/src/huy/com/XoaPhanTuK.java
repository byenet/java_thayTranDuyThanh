package huy.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class XoaPhanTuK {

	public static void nhapMangRandom(int M[]) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		for (int i = 0; i<M.length; i++) {
			M[i] = random.nextInt(10);
		}
	}
	
	
	public static int [] xoaPhanTu(int []arr, int k) {
		int [] brr = new int [arr.length];
		int bSize = 0;
		for( int i = 0; i< arr.length; i++) {
			if(arr[i] != k ) {
				brr[bSize++] = arr[i];
			}
		}
		brr = Arrays.copyOfRange(brr, 0, bSize);
		return brr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao so luong phan tu: ");
		int n = sc.nextInt();
		int M[] = new int[n];
		nhapMangRandom(M);
		System.out.println("Cac phan tu cua mang duoc phat sinh ngau nhien la:");
		System.out.println(Arrays.toString(M));
		System.out.println("Kieu du lieu duoc xuat ra la: "+(Arrays.toString(M)).getClass().getSimpleName());
		System.out.print("Nhap vao phan tu can xoa: ");
		int k = sc.nextInt();
		M = xoaPhanTu(M, k);
		System.out.println("Mang sau khi xoa la: "+ Arrays.toString(M));
		
	}

}

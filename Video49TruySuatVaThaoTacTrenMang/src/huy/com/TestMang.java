package huy.com;

import java.util.Scanner;

public class TestMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []M;
		System.out.print("Moi ban nhap so phan tu toi da cua mang: ");
		int n = sc.nextInt();
		
		// Cap phat n phan tu cho mang M
		M = new int[n];
		
		// tien hanh nhap lieu cho tung phan tu
		System.out.println("Moi ban nhap gia tri cho mang: ");
		
		for(int i=0; i<M.length; i++) {
			System.out.print("M["+i+"] = ");
			M[i] = sc.nextInt();
		}
		
		System.out.println("Mang sau khi ban nhap la: ");
		for(int i: M) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		
		M[2] = 113;
		System.out.println("Mang sau khi thay doi la: ");
		for(int i: M) {
			System.out.print(i+"\t");
		}
	}

}

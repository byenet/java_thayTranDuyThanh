package huy.ocm;

import java.util.Scanner;

public class TestFor {
	
	// tinh s
	public static double TinhS(int n, int x) {
		double s = 0;
		double mau = 0;
		for(int i = 1; i<=n; i++) {
			double tu = Math.pow(x, i);
			mau+=i;
			s+= tu/mau;
		}
		return s;
	}
	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap x: ");
		int x = sc.nextInt();
		System.out.print("Moi nhap n: ");
		int n = sc.nextInt();
		
		double s = TinhS(n,x);
		
		System.out.println("S(" + x+ "," + n + ")= " + s);
		
	}
}

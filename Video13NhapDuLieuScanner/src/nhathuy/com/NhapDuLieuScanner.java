package nhathuy.com;

import java.util.Scanner;

public class NhapDuLieuScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao mot so nguyen: ");
		int a = sc.nextInt();
		System.out.println("So nguyen ban vua nhap so: " + a);
		System.out.print("Moi ban nhap vao mot so thuc: ");
		double b = sc.nextDouble();
		System.out.println("So thuc ban vua nhap la: " + b);
		
		System.out.print("Moi ban nhap vao mot chuoi: ");
		String line = new Scanner(System.in).nextLine();
		System.out.println("Chuoi ban vua nhap la: " + line);

	}

}


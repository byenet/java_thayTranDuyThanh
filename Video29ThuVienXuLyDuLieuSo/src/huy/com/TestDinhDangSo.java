package huy.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao diem toan: ");
		double toan = sc.nextDouble();
		System.out.print("Moi ban nhap vao diem ly: ");
		double ly = sc.nextDouble();
		System.out.print("Moi ban nhap vao diem Hoa: ");
		double hoa = sc.nextDouble();
		
		double dtb = (toan + ly + hoa)/3;
		
		
		DecimalFormat dcf = new DecimalFormat("#.##");
		System.out.println("DTB = " + dcf.format(dtb));
		
	}

}

package huy.com;

import java.util.Scanner;

public class TestChuoiPanyndrome {
	// Chuoi panlyndrome la chuoi co chuoi dao nguoc bang chinh no VD: radar, madam;
	// Hay kiem tra 1 chuoi co phai la chuoi panlyndrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao 1 chuoi panlyndrome : ");
		String s = sc.nextLine();
		
		boolean flag = true;
		char []arr = s.toCharArray(); // Ban chat cua chuoi la tap hop cac ky tu do do ta thong qua ham toCharArray() de tra ve mang ky tu
		for (int i=0; i<arr.length; i++) {
			
			// Chung minh phan chung
			if(arr[i] != arr[arr.length-1-i]) { // lay phan tu dau so sanh voi phan tu cuoi
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.print(s+ " la chuoi panlyndrome");
		}else {
			System.out.print(s+ " khong phai la chuoi panlyndrome");
		}
	}

}

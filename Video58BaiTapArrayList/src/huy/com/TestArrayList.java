package huy.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList {

	static ArrayList<Integer> dsData = new ArrayList<Integer>();
	
	public static void menu() {
		System.out.println("1. Them");
		System.out.println("2. Xuat");
		System.out.println("3. Sua");
		System.out.println("4. Xoa");
		System.out.println("5. Tim Kiem");
		System.out.println("6. Sap Xep");
		System.out.println("7. Thoat");
		System.out.print("Moi ban chon menu: ");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			them();
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			timKiem();
			break;
		case 6:
			sapXep();
			break;
		case 7:
			System.err.println("Cam on ban da dung");
			System.exit(0); // so may cung dc
			break;
			
		// Ngoai ra con co the tim min,max,....
		//https://vietjack.com/bai_tap_java/tim_min_max_trong_list_trong_java.jsp
//			System.out.println("max: " + Collections.max(list));
//		      System.out.println("min: " + Collections.min(list));

		default:
			System.out.println("So ban nhap khong co trong menu moi ban chon lai!");
			break;
		}
	}
	
	
	private static void sapXep() {
		
		//https://shareprogramming.net/sap-sep-trong-arraylist/

//		Collections.sort(dsData); // tang dan
//		Collections.reverse(dsData); // giam dan
		
		dsData.sort((o1, o2) -> o1 - o2); // tang dan // mũi ten la lamda như coffee script hay arrow function es6
		dsData.sort((o1, o2) -> o2 - o1); // giam dan
	}
	
	private static void timKiem() {
		System.out.print("Gia tri tim kiem: ");
		int k = new Scanner(System.in).nextInt();
		if(dsData.contains(k)) {
			System.out.println("Tim thay "+ k + " trong list!");
			int position1 = dsData.indexOf(k);
			System.out.println("Vi tri xuat hien dau tien cua phan tu la: "+ position1);
			int position2 = dsData.lastIndexOf(k);
			System.out.println("Vi tri xuat hien cuoi cung cua phan tu la: " + position2);
			
			for(int i=0; i<dsData.size(); i++) {
				if(dsData.get(i).equals(k)) {
					System.out.println("Found " + k + " at position " + i);
				}
			}
			
		}else {
			System.out.println("Khong tim thay " + k +" trong list");
		}
		
	}
	
	private static void xoa() {
			System.out.println("Moi ban nhap vi tri can xoa: ");
			int vt = new Scanner(System.in).nextInt();
			dsData.remove(vt);
	}
	
	
	private static void sua() {
		System.out.print("Vi tri muon sua: ");
		int vt = new Scanner(System.in).nextInt();
		System.out.print("Gia tri moi: ");
		int value = new Scanner(System.in).nextInt();
		dsData.set(vt, value);
	}
	
	private static void xuat() {
		
//		for (int i = 0; i< dsData.size(); i++) {
//			System.out.println(dsData.get(i));
//		}
		
		for (int i: dsData) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	private static void them() {
		System.out.print("Nhap gia tri ban muon them: ");
		int value = new Scanner(System.in).nextInt();
		dsData.add(value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}
	}

}

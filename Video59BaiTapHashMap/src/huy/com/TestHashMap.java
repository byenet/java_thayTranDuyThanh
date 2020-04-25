package huy.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.activation.MailcapCommandMap;

public class TestHashMap {

	static HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	public static void menu() {
		System.out.println("1.Them");
		System.out.println("2.Xuat");
		System.out.println("3.Sua");
		System.out.println("4.Xoa");
		System.out.println("5.Tim Kiem");
		System.out.println("6.Thoat");
		
		System.out.print("Moi ban chon: ");
		int chon = new Scanner(System.in).nextInt();
		
		switch (chon) {
		case 1:
			them(); // an to hop phim ctrl + 1 de tao ham
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
			// Hay loc ra tat ca cuon sach ten co 1 tu nao do (VD la java)
			tim();
			break;
		case 6:
			System.err.println("Hen gap lai!");
			System.exit(0);
			break;

		default:
			break;
		}
	}
	
	
	private static void tim() {
		// TODO Auto-generated method stub
		System.out.print("Nhap ten sach muon tim: ");
		String ten = new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, String> item: map.entrySet()) {
			if(item.getValue().contains(ten)) {
				System.out.println(item.getKey()+ "-" + item.getValue());
			}
		}
		
	}


	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.print("Moi ban nhap ma muon xoa: ");
		int ma = new Scanner(System.in).nextInt();
		if(map.containsKey(ma) == false) {
			System.err.println("Khong tim thay ma "+ ma+ " de xoa!");
		}else {
			map.remove(ma);
			System.out.println("Da xoa thanh cong!");
		}
	}


	private static void sua() {
		// TODO Auto-generated method stub
		System.out.print("Moi ban nhap ma muon sua: ");
		int ma = new Scanner(System.in).nextInt();
		if(map.containsKey(ma) == false) {
			System.err.println("Mã " + ma + " khong ton tai");
		}else {
			System.out.print("Nhap ten sach moi: ");
			String ten = new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
	}


	private static void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Ma\tTen Sach");
		for(Map.Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
	}


	private static void them() {
		// TODO Auto-generated method stub
		System.out.print("Nhap ma sach: ");
		int ma = new Scanner(System.in).nextInt();
		System.out.print("Nhap ten sach: ");
		String ten = new Scanner(System.in).nextLine();
		if(map.containsKey(ma) == false) {
			map.put(ma, ten);
		}else {
			System.err.println("Ma sach " + ma +" ban them bi trung");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			menu();
		}
	}

}

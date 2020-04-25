package huy.com.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import huy.com.io.SerializeFileFactory;
import huy.com.model.Contact;

public class TestContact {
	
	static HashMap<Integer, Contact> csdl = new HashMap<Integer, Contact>();
	
	public static void menu() {
		System.out.println("1.Them");
		System.out.println("2.Xuat");
		System.out.println("3.Sua");
		System.out.println("4.Xoa");
		System.out.println("5.Tim kiem");
		System.out.println("6.Sap Xep");
		System.out.println("7.Luu File");
		System.out.println("8.Doc File");
		System.out.println("9.Thoat");
		
		System.out.print("Moi ban chon: ");
		int n = new Scanner(System.in).nextInt();
		
		switch (n) {
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
			tim();
			break;
		case 6:
			sapXep();
			break;
		case 7:
			luuFile();
			break;
		case 8:
			docFile();
			break;
		case 9:
			System.err.println("Bye Bye!");
			System.exit(0);
			break;

		default:
			break;
		}
		
		
	}
	
	private static void docFile() {
		// TODO Auto-generated method stub
		csdl = SerializeFileFactory.readFile("D:/project/Java_basic/Video90ProjectTongHop/tapTin/contact.dat");
	}

	private static void luuFile() {
		// TODO Auto-generated method stub
		boolean kq = SerializeFileFactory.saveFile(csdl, "D:/project/Java_basic/Video90ProjectTongHop/tapTin/contact.dat");
		if(kq) {
			System.out.println("Luu File thanh cong");
		}else {
			System.out.println("Luu File That bai");
		}
	}

	private static void sapXep() {
		// TODO Auto-generated method stub
		List<Map.Entry<Integer, Contact>> list = new ArrayList<Map.Entry<Integer, Contact>>();
		list.addAll(csdl.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Contact>>() {
		    @Override
		    public int compare(Map.Entry<Integer, Contact> o1, Map.Entry<Integer, Contact> o2) {
		        return o1.getValue().compareTo(o2.getValue());
		    }
		});
		System.out.println("Danh Ba da sap xep: ");
		for(Entry<Integer, Contact> ds: list) {
			System.out.println(ds.getValue());
		}
		
	}

	private static void tim() {
		// TODO Auto-generated method stub
		System.out.println("Nhap phone: ");
		String phone = new Scanner(System.in).nextLine();
		System.out.println("Danh Ba Tim Duoc");
		for(Map.Entry<Integer, Contact> item: csdl.entrySet()) {
			if(item.getValue().getPhone().startsWith(phone))
			System.out.println(item.getValue()); // xuat doi tuong -> toString
		}
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhap ma: ");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)) {
			csdl.remove(ma);
			System.out.println("Xoa thanh cong!");
		}else {
			System.out.println("Khong tim thay ma de xoa!");
		}
	}
	

	private static void sua() {
		// TODO Auto-generated method stub
		System.out.print("Nhap ma muon sua: ");
		int ma = new Scanner(System.in).nextInt();
		if(csdl.containsKey(ma)) {
			System.out.print("Nhap ten: ");
			String ten = new Scanner(System.in).nextLine();
			System.out.print("Nhap SDT: ");
			String phone = new Scanner(System.in).nextLine();
			
			Contact c = new Contact(ma, ten, phone);
			csdl.put(ma, c);
		}else {
			System.out.println("ma "+ ma + " khong ton tai!");
		}
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Danh Sach Danh Ba:");
		for(Map.Entry<Integer, Contact> item: csdl.entrySet()) {
			System.out.println(item.getValue()); // xuat doi tuong -> toString
		}
		
	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.print("Nhap ma: ");
		int ma = new Scanner(System.in).nextInt();
		System.out.print("Nhap ten: ");
		String ten = new Scanner(System.in).nextLine();
		System.out.print("Nhap SDT: ");
		String phone = new Scanner(System.in).nextLine();
		
		Contact c = new Contact(ma, ten, phone);
		
		if(csdl.containsKey(c.getId()) == false) {
			csdl.put(c.getId(), c);
		}else {
			System.out.println("Them that bai!");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			menu();
		}
		
	}

}

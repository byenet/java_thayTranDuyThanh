package huy.com;

import java.util.StringTokenizer;

public class TestTimKiem {

	// lastIndexOf tra ve vi tri cuoi cung tim thay
	// indexOf tra ve vi tri dau tien tim thay, khong tim thay tra ve -1
	// Contains Kiem tra chuoi con co nam trong chuoi s ? tra ve true false
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello everybody, I'm Huy";
		
		int vt1 = s.indexOf("o");
		System.out.println("Tim thay o dau tien o vi tri: "+vt1);
		int vt2 = s.indexOf("Huy");
		System.out.println("Tim thay Huy dau tien o vi tri: "+ vt2);
		int vt3 = s.indexOf("h");
		if(vt3 == -1) {
			System.out.println("indexOf Khong tim thay h se tra ve: " + vt3);
		}
		
		
		System.out.println();
		int vt4 = s.lastIndexOf("o");
		System.out.println("Tim thay o cuoi cung o vi tri: "+ vt4);
		int vt5 = s.lastIndexOf("I'm");
		System.out.println("Tim thay I'm cuoi cung o vi tri: " + vt5);
		int vt6 = s.lastIndexOf("h");
		if(vt6 == -1) {
			System.out.println("lastIndexOf Khong tim thay h se tra ve: " + vt3);
		}
		
		
		System.out.println();
		if(s.contains("Huy") == true) {
			System.out.println("Co chu Huy trong chuoi");
		}else {
			System.out.println("Khong co chu Huy trong chuoi");
		}
		
		
		
		System.out.println();
		// Tim xem chu Huy xuat hien may lan trong chuoi
		
		String s3 = "Huy Huy Huy kkk Huy";
		StringTokenizer token3 = new StringTokenizer(s3);
		int dem = 0;
		while(token3.hasMoreTokens()) {
			String value = token3.nextToken();
			if(value.contains("Huy"))
			{
				dem++;
			}
		}
		System.out.println("Tim Thay " + dem + " lan tu Huy");
		
	}

}

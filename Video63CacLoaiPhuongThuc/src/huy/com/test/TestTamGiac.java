package huy.com.test;

import huy.com.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac tg1 = new TamGiac(3, 4, 5);
		
		System.out.println("Chu vi = " + tg1.tinhChuVi());
		System.out.println("Dien tich = " + tg1.tinhDienTich());
//		System.out.println("Nua chu vi = " + tg1.); khong tim thay vi no private la support method ta khong thay
	}

}

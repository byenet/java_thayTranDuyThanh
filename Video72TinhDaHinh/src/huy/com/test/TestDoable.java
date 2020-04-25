package huy.com.test;

import huy.com.model.IDoable;
import huy.com.model.NhanVien;
import huy.com.model.SinhVien;

public class TestDoable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDoable x;
		
		x = new NhanVien();
		x.doSomeThing();
		
		x = new SinhVien();
		x.doSomeThing();
	}

}

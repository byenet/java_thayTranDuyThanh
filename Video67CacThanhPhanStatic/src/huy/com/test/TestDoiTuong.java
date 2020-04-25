package huy.com.test;

import huy.com.model.DoiTuong;

public class TestDoiTuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoiTuong a = new DoiTuong();
		a.setA(113);
		
		DoiTuong b = new DoiTuong();
		System.out.println(b.getA()); // vi a cua class DoiTuong la static nen chia se 1 vung o nho  
		
		DoiTuong c = new DoiTuong();
		System.out.println(c.getA());
		
		c.setA(115);
		System.out.println(a.getA());
		
		System.out.println("---------------------------------------");
		
//		DoiTuong.fn2(); // no khong thay vi khong the goi 1 phuong thuc binh thuong qua class duoc
		DoiTuong.fn1(); // fn1 la static nen da ton tai khi lop sinh ra
		

	}

}

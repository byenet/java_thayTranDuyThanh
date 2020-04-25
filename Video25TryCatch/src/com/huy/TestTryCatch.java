package com.huy;

public class TestTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x = 5;
			int y = 5/10;
			System.out.println("x= "+x);
			System.out.println("y= "+y);
			
			int z = x/y;
			System.out.println("z= "+z);
		}
		catch(ArithmeticException ex) {
			System.out.println("loi roi hihi");
			ex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Co loi chi tiet: ");
			ex.printStackTrace();
		}
		
		System.out.println("Cam on cac ban da dung phan mem");
	}

}

package huy.com.model;

public class SinhVien {
	private int ma;
	private String ten;
	private double diem;
	
	// Tai su dung cac constructor // truong hop dac biet overloading method
	public SinhVien() {
		
	}
	
	public SinhVien(int ma) {
		this();
		this.ma = ma;
	}
	
	public SinhVien(int ma, String ten) {
		this(ma);
		this.ten = ten;
	}
	
	public SinhVien(int ma, String ten, double diem) {
		this(ma,ten);
		this.diem = diem;
	}
	
	
	// VD ve overloading method
	
	public void xetTotNghiep() {
		if(this.diem >= 5)
			System.out.println("Duoc xet tot nghiep!");
		else
			System.out.println("Chua du dieu kien xet tot nghiep!");
	}
	
	public void xetTotNghiep(double diem) {
		System.out.println("Ban co diem: " + diem);
	}
	
	public void xetTotNghiep(double diem, int vungUuTien) {
		System.out.println("Ban co diem "+ diem + "; vung uu tien = " + vungUuTien);
	}
	
	
	// loi vi khong co signature ( kieu du lieu tra ve khac nhau thi van khong phai la signature)
//	public void dangKyHocPhan1(int m1) {
//		
//	}
//	
//	public String dangKyHocPhan1(int m1) {
//		return "";
//	}
	
	
	
	// Signature o day co kieu du lieu doi so khac nhau nen hop le
	public void dangKyHocPhan2(int m1) {
		
	}
	
	public void dangKyHocPhan2(String m1) {
		
	}
	
	

	
	
	
}

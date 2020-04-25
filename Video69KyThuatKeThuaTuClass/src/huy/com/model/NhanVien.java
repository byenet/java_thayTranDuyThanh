package huy.com.model;

public class NhanVien {
	protected int ma;
	protected String ten;
	
	public NhanVien() {
		
	}
	
	public NhanVien(int ma, String ten ) {
		this.ma = ma;
		this.ten = ten;
	}
	
	public void setMa(int Ma) {
		this.ma = ma;
	}
	
	public int getMa() {
		return this.ma;
	}

	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhan vien " + this.ten + " goi tinh luong");
	}
	
	
}

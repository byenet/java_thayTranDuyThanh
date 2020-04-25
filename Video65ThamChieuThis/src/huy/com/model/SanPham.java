package huy.com.model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	public void setMa(int ma) {
		this.ma = ma;
	}
	
	public int getMa() {
		return ma; // khong co this hay co this la nhu nhau vi khong co global varible, nhung nen de this
	}
	
	
	public void setTen (String ten) {
		this.ten = ten;
	}
	
	public String getTen() {
		return this.ten;
	}
	
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	public double getGia() {
		return this.gia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "-" + getTen() + "," + getGia();
	}
	
}

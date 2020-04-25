package huyabstract.com.model;

public abstract class NhanVienAbstract {
	protected int ma;
	protected String ten;
	
	
	public NhanVienAbstract(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
	public NhanVienAbstract() {
		super();
	}

	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public abstract void tinhLuong();
	
	
	
}	

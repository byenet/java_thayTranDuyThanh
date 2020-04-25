package huy.com.model;

//https://huongdanjava.com/vi/tim-hieu-ve-interface-comparable-trong-java.html
//https://viblo.asia/p/sap-xep-voi-comparable-va-comparator-trong-java-WAyK8dOEKxX
public class SanPham implements Comparable<SanPham> {
	private int ma;
	private String ten;
	private double gia;
	
	public SanPham() {
		super();
	}

	public SanPham(int ma, String ten, double gia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
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

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
	
	@Override
	public String toString() {
		return this.ma + "\t" + this.ten + "\t  " + this.gia;
	}

	@Override
	public int compareTo(SanPham o) {
		// sap xep theo ten (chuoi thi don gian)
		//return this.ten.compareToIgnoreCase(o.ten); // tang dan
		//return this.ten.compareToIgnoreCase(o.ten)*-1; // giam dan
		
		
		// TODO Auto-generated method stub
		if(this.gia < o.gia)
			return -1;
		if(this.gia > o.gia)
			return 1;
		return 0;
	}
	
	
}

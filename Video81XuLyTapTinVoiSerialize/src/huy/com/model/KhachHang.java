package huy.com.model;

import java.io.Serializable;

//https://huongdanjava.com/vi/noi-ve-serialization-trong-java.html
 //https://viblo.asia/p/java-serialization-XL6lAYrDlek
//https://viblo.asia/p/parcelable-serializable-trong-android-KE7bGonKM5e2
public class KhachHang implements Serializable {
	private int ma;
	private String ten;
	
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
	
	public KhachHang(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
}

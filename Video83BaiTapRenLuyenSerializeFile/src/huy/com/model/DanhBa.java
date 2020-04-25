package huy.com.model;

import java.io.Serializable;

public class DanhBa implements Serializable {
	private String ten;
	private String phone;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public DanhBa() {
		super();
	}
	public DanhBa(String ten, String phone) {
		super();
		this.ten = ten;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ten + "\t" + this.phone;
	}
	
}

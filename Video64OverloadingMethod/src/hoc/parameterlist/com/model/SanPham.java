package hoc.parameterlist.com.model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	
	
	
	public SanPham(int ma, String ten, double gia) {
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
		// TODO Auto-generated method stub
		return this.ma + "\t" + this.ten + "\t" + this.gia;
	}
	
	public static double tongTien(SanPham ...phams) {
		double tien = 0;
		for(SanPham sp : phams) {
			tien+= sp.gia;
		}
		return tien;
	}
	
	
	
}

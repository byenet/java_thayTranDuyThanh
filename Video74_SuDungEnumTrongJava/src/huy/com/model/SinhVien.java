package huy.com.model;

import huy.com.model.XepLoai;


public class SinhVien {
	private int ma;
	private String ten;
	private double diemTB;
	private XepLoai loai;
	
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
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	public XepLoai getLoai() {
		if(this.diemTB >= 8) {
			loai = XepLoai.Gioi;
		}else if(this.diemTB >= 6.5) {
			loai = XepLoai.Kha;
		}else if(this.diemTB >= 5 ) {
			loai = XepLoai.TrungBinh;
		}
		return loai;
	}
	
	public SinhVien(int ma, String ten, double diemTB) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diemTB = diemTB;
		this.loai = getLoai();
	}
	public SinhVien() {
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ma + "\t" 
				+ this.ten + "\t" 
				+ this.diemTB + "\t => "
				+ this.loai.getDescription(); // Hoac la khong dat this.loai = getLoai() ma dung truc tiep getLoai() thay cho loai luon.
		
	}
	
}

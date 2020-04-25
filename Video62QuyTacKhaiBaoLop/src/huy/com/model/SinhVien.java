package huy.com.model;

// Phim tat alt + shift + s
public class SinhVien {
	
	private String hoTen;
	private double diem;
	
	public SinhVien() {
		System.out.println("Day la constructor mac dinh!");
	}

	public SinhVien(String hoTen, double diem) {
		this.hoTen = hoTen;
		this.diem = diem;
		System.out.println("Day la Constructor co doi so");
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	
	public void xuatThongTin() {
		System.out.println(this.hoTen +" - "+ this.diem);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ho ten = " + this.hoTen + "\nDiem = " + this.diem;
	}

}

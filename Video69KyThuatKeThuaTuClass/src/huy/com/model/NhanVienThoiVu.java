package huy.com.model;

public class NhanVienThoiVu extends NhanVien {
	
	public NhanVienThoiVu() {
		super();
	}
	
	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
	}
	
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		System.out.println("Day la nhan vien thoi vu");
	}
}

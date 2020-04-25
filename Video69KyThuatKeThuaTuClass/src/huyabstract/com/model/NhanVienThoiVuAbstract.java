package huyabstract.com.model;

public class NhanVienThoiVuAbstract extends NhanVienAbstract {

	public NhanVienThoiVuAbstract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienThoiVuAbstract(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhan vien thoi vu tinh luong");
	}
}

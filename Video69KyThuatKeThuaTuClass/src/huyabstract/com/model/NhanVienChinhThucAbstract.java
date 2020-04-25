package huyabstract.com.model;

public class NhanVienChinhThucAbstract extends NhanVienAbstract {

	public NhanVienChinhThucAbstract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienChinhThucAbstract(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhan vien chinh thuc tinh luong");
	}
	
	

	
}

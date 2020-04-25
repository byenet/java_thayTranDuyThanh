package huy.com.model;

public interface ILamViec {
	
	// Mac dinh cac phuong thuc trong interface la abstract (di nhien co quyen go abstract vao nhung ma do la du thua:))
	// do do khong can khai bao abstract thi no cung hieu la truu tuong
	//	public abstract void complexity();
	public void complexity();
	public void difficulty();
	
	
	// loi neu khai bao private vi Illegal modifier for the interface field ILamViec.x; only public, static & final are permitted
	//	private int x = 5;
	
}

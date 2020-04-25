package huy.com.model;

public class SinhVien implements ILamViec, IGiaiTri {
	// luc implements ide se nhac ta phai bat buoc override het cac method cua interface ta chi can an vao la dc.

	@Override
	public void complexity() {
		// TODO Auto-generated method stub
		System.out.println("Cong viec phuc tap");
	}

	@Override
	public void difficulty() {
		// TODO Auto-generated method stub
		System.out.println("Cong viec kho");
	}

	@Override
	public void hatHo() {
		// TODO Auto-generated method stub
		System.out.println("Giai tri hat ho");
	}
	
	// => tinh nhat quan 
	
	

}

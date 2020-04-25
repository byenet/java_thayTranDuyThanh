package huy.com;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finally du co loi hay k thi finally van luon luon duoc thuc hien.
		// VD khi mot phan mem chay co loi hay 1 ket noi nao do dang chay ma co loi(server) thi co loi xay ra no se bi gian doan vay ngu ta hay de o trong finally de khi co hay khong co loi thi no van dong ket noi.
		try {
			
			int x = 5;
			int y = 0;
			int z = x/y;
			System.out.println("z= "+z);
			System.out.println("Xin cam on");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			// TODO: handle finally clause
			System.out.println("Du chuong trinh loi ta van cu chay");
		}
	}

}

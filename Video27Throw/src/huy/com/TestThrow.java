package huy.com;

// co loi nhung khong xu ly loi, quang loi ra cho cho nao do xu ly cai ham chua loi nay xu ly.
// khi co loi xay ra se khong xu ly loi do ma nem throw loi do den cho goi no de no thuc thi (noi goi ham) xu ly

public class TestThrow {
	
	public static void ptBac1(int a, int b) throws Exception {
		try {
			System.out.println("x= "+ (-b/a));
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ptBac1(0, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

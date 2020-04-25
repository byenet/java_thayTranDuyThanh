package nhathuy.com;

public class GhiChuComment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 	Đây là cách comment 1 dong
		
		/* 	Đây là cách comment
		 * nhiều dòng
		 */
		
		int a = 8;
		int b = 7;
		ptb1(a,b); // rê chuột vào để xem tác dụng của comment javadoc vừa tạo khi nãy
	}
	
	/**
	 *  Comment Javadoc VD: Đây là hàm giải phương trình bậc 1: ax + b = 0
	 *  @param a - hệ số a
	 *  @param b - hệ số b
	 */
	public static void ptb1(int a, int b)
	{
		System.out.println("Đây là hàm giải phương trình bậc 1");
	}

}

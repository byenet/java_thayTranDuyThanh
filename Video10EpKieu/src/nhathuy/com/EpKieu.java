package nhathuy.com;

public class EpKieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ép kiểu Rộng Đưa kiểu có vùng lưu trữ nhỏ lên kiểu có vùng lưu trữ lớn --> không sợ mất mác dữ liệu (độ chính xác không giảm)
		*	byte⤍;short⤍int⤍long⤍float⤍double
		*
		*  Ép kiểu hẹp là ngược lại với ép kiểu rộng --> Có thể bị mất mác dữ liệu (độ chính giảm)
		*	double⤍;float⤍long⤍int⤍short⤍byte
		*/
		
		System.out.println(1/2);
		System.out.println(1.0/2);
		System.out.println((double)1/2);
		
		double x = 10/3.0;
		double y = 10.0/3;
		System.out.println("x= " +x+ "    y= "+y);

	}

}

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao 1 thang: ");
		int a = sc.nextInt();
		
		switch (a) {
		case 1: case 3: case 5: case 7 : case 8: case 10: case 12:
			System.out.println("Thang "+a+" co 31 ngay");
			break;
		case 4: case 6: case 9: case 11 :
			System.out.println("Thang "+a+" co 30 ngay");
			break;
		case 2:
			System.out.print("Moi ban nhap vao nam: ");
			int y=sc.nextInt();
			if((y%4==0 && y%100!=0) || y%400==0)
			{
				System.out.println("Thang "+a+" nam "+y+" la nam nhuan co 29 ngay");
			}
			else
			{
				System.out.println("Thang "+a+" nam "+y+" khong phai nam nhuan co 28 ngay");
			}
			break;

		default:
			System.err.println("Thang " +a+ " ban nhap vao khong hop le");
			break;
		}
		
	}

}

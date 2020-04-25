package huy.com;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Mời bạn nhập số a: ");
			int a = sc.nextInt();
			System.out.println("Mời bạn nhập số b: ");
			int b = sc.nextInt();
			System.out.println("Mời bạn nhập phép toán: ");
			char ch = new Scanner(System.in).nextLine().charAt(0);
			switch(ch) 
			{
			case '+':
				System.out.println(a+ " + "+ b+ " = "+ (a+b));
				break;
			case '-':
				System.out.println(a+ " - "+ b+ " = "+ (a-b));
				break;
			case '*':
				System.out.println(a+ " x "+ b+ " = "+ (a*b));
				break;
			case '/':
				if(b==0)
					System.out.println("Mẫu phép chia bằng 0 không thực hiện được.");
				else
					System.out.println(a+ " / "+ b+ " = "+ (a*1.0/b));
				break;
			default:
				System.out.println("Phép toán bạn nhập không hợp lệ!!!");
				break;
			}
			
			System.out.println("Bạn muốn làm tiếp không(c/k): ");
			String line = new Scanner (System.in).nextLine();
			if(line.equalsIgnoreCase("k"))
				break;
		}
		System.out.println("Chào tạm biệt hẹn gặp lại lần sau");
	}
}

// format crtl a + ctrl i

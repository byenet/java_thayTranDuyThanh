package nhathuy.com;

import java.util.Scanner;

public class Ifelse3Ngoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Moi ban nhap vao mot thang: ");
	
	// If Else
	int t=sc.nextInt();
	if(t==1 || t==3 || t==5 || t==7 || t==8 || t==10 || t==12 )
	{
		System.out.println("Thang "+t+" co 31 ngay");
	}
	else if (t==4 || t==6 || t==9 || t==11)
	{
		System.out.println("Thang "+t+" co 30 ngay");
	}
	else if (t==2)
	{
		System.out.println("Thang "+t+" co 28 hoac 29 ngay");
	}
	else
	{
		System.out.println("Thang "+t+" ban nhap la thang khong hop le!!!");
	}
		
	// Toan tu 3 ngoi
	System.out.print("Moi ban nhap vao mot so nguyen: ");
	int n = sc.nextInt();
	String b = (n%2==0)?(n+" la So chan"):(n+" la So le");
	System.out.println(b);

	
	}

}

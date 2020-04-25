package nhathuy.com;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao so muon tinh giai thua: ");
		int n = sc.nextInt();
		int gt = 1;
		int i = 1;
		while(i<=n)
		{
			gt*=i;
			i++;
		}
		
	System.out.println("Giai thua cua "+n+" la: "+gt);
	}

}

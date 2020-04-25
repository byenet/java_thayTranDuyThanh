package nhathuy.com;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao so muon tinh giai thua: ");
		int n = sc.nextInt();
		int gt = 1;
		for(int i=1;i<=n;i++)
		{
			gt*=i;
		}
		System.out.println(n + " giai thua = " + gt);
	}
}

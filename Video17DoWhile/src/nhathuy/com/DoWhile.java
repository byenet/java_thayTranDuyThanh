package nhathuy.com;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap so can tinh giai thua: ");
		int n = sc.nextInt();
		int gt = 1;
		int i = 1;
		do {
			gt*=i;
			i++;
		}while(i<=n);
		 System.out.println(n+" giai thua = "+gt);
		
	}

}

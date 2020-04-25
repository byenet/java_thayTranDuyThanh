package nhathuy.com;

import java.util.Scanner;

public class BreakContinue {

//break thoat khoi vong lap ngay lenh do
//continue bo qua lenh do thuc hien vong lap tiep theo
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{	
			System.out.println("Day la vd break: ");
			System.out.print("Moi ban nhap vao 1 so: ");
			int n = new Scanner(System.in).nextInt();
			if(n%2==0)
				System.out.println(n+" la so chan");
			else 
				System.out.println(n+" la so le");
			
			System.out.print("Ban muon tiep tu khong?(y/n):");
			String line = new Scanner(System.in).nextLine();
			
			if(line.equalsIgnoreCase("n"))
				break;
		}
		
			System.out.println("\nDay la vd continue bo qua cac so chia het cho 3 < 10: ");
			for(int i=0;i<10;i++)
			{
				if(i%3==0)
					continue;
				System.out.println(i);
			}
			
			
	}

}

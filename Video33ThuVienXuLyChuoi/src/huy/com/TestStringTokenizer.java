package huy.com;

import java.util.StringTokenizer;

import jdk.nashorn.internal.parser.Token;

public class TestStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lop Dung de tach chuoi goc thanh cac chuoi con theo 1 yeu cau nao do trong he thong cu (con co splice trong version moi)
		
				String s1 = "Huy đẹp trai";
				StringTokenizer token1 = new StringTokenizer(s1); // Chi 1 tham so, khong co tham so can tach thi no se mac dinh la dau cach.
				while(token1.hasMoreTokens()) {
					String value = token1.nextToken();
					System.out.println(value);
				}
				
				System.out.println("------------------------------");
				String s2 = "Huy qua;đẹp;trai!kkk";
				StringTokenizer token2 = new StringTokenizer(s2, ";! ");
				
				while (token2.hasMoreTokens()) {
					String value = token2.nextToken();
					System.out.println(value);	
				}
				
				
				
				
		
	}

}

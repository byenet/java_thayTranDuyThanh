package nhathuy.com;

public class PhepToanCoBan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* Phep gan:
	 * =; +=; -=; *=; /=
	 **/
		int a =1;
		a+=1; // a=a+1
		a-=1; // a=a-1
		a*=2; // a=a*2
		a/=2; // a=a/2
		
	/* Phep Toan toan hoc co ban
	 * +; -; *; /; %
	 * */
		int b = 5;
		int c = 6;
		a = b+c;
		a = b-c;
		a = b*c;
		a = b/c; // chia lay phan nguyen bo phan du
		a = b%c; // chia lay phan du bo phan nguyen
		
	/* Phep toan so sanh(Toan tu so sanh)
	 * ==; !=; >; >=; <; <=
	 * */	
		
	/* Phep toan logic(toan tu logic)
	 *  !(Phu dinh); &&(and); ||(or); ?:(Toan tu dieu kien hay la toan tu 3 ngoi)
	 * */	
		double dtb = 7;
		System.out.println(dtb>=5 ? "Ban dau" : "Ban rot");
		
		boolean kq = (5<4) || (7>3) || (100<0); // Hoac neu thay sai thi xet qua menh de tiep theo 
		System.out.println(kq);
		
		boolean kq1 = (5<4) && (7>3) && (100<0); // Va neu thay sai thi ngung luon
		System.out.println(kq1);
		
	/* Toan tu tang dan, giam dan
	 * ++; --
	 * */	
		int v=5;
		v++;// v = v+1  // dung sau bien la postfix
		v--;// v = v-1
		
		++v;// v = v+1  // dung truoc bien la prefix     
		--v;// v = v-1	
		
		int g = 8;
		int k = 2;
		int z = g++ + ++k -5;
		// Buoc 1: uu tien xu ly prefix truoc: --> k=3
		// Buoc 2: tinh toan cac phep toan con lai: --> 8 + 3 - 5 = 6
		// Buoc 3: gan gia tri o buoc 2 cho ve trai: --> z=6
		// Buoc 4: thuc hien postfix: g=9
		// ---> sau khi thuc hien ta duoc: g=9; k=3; z=6 
		System.out.println("\ng= "+g);
		System.out.println("k= "+k);
		System.out.println("z= "+z);
		
		
		
	}

}

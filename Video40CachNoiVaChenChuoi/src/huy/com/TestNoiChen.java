package huy.com;

public class TestNoiChen {
	// Noi chuoi bang dau + (Hieu nang kem vi moi lan + lai sinh ra 1 chuoi moi, neu o tep du lieu lon se gay giam hieu nang)
	// Cach noi chuoi bang StringBuilder
	// Cach chen chuoi
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Noi chuoi bang dau + (Hieu nang kem vi moi lan + lai sinh ra 1 chuoi moi, neu o tep du lieu lon se gay giam hieu nang)
		String s = "HUY";
		s += " dep trai";
		System.out.println(s);
		
		// Giai quyet van de cham ta dung lop StringBuilder thong qua ham append (da hoc bai 33)
		StringBuilder builder = new StringBuilder();
		builder.append("Huy");
		builder.append(" dep");
		builder.append(" trai");
		System.out.println(builder.toString());
		// ==> khi phai noi chuoi nhieu phuc tap ta dung StringBuilder con khi chi co mot vai chuoi nhe ta dung '+' cho do phuc tap
		
		
		// Chen chuoi bang StringBuilder thong qua insert
		
		StringBuilder builder2 = new StringBuilder("Huy trai");
		builder2.insert(3, " dep");
		System.out.println(builder2.toString());
		
		
		
		
	}

}

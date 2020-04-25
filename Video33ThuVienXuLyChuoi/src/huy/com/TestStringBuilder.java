package huy.com;

public class TestStringBuilder {

	//https://o7planning.org/vi/10217/huong-dan-java-string-stringbuffer-va-stringbuilder
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Hello"); // dau "+" cung la noi chuoi
		sb.append(" Huy");
		sb.append(" Đẹp trai");
		sb.append("\n");
		sb.append("kkk");
		
		System.out.println(sb.getClass().getName());
		
		String s = sb.toString();
		System.out.println(s);
		
		sb.insert(10, "quá ");
		sb.insert(0, "1. "); // Bat dau tu 0
		s = sb.toString();
		System.out.println(s);
		
		sb.delete(3, 9); //sb.delete(start, end)
		s = sb.toString();
		System.out.println("s = "+ s);
	}

}

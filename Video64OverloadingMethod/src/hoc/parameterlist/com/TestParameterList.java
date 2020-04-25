package hoc.parameterlist.com;

public class TestParameterList {
	// tuong tu nhu rest parameter trong js
	// arr nhu la 1 mang 1 chieu co the co gian duoc 
	
	public static int sum (int ...arr) {
		int s = 0;
//		
//		for (int i : arr) {
//			s+=i;
//		}
//		
		for( int i = 0; i< arr.length; i++) {
			s+=arr[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = sum(1,4,5,6);
		System.out.println(s);
		
		int s2 = sum();
		System.out.println(s2);
		
		int s3 = sum(7,8);
		System.out.println(s3);
	}

}

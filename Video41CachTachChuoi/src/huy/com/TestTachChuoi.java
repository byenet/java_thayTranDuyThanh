package huy.com;

public class TestTachChuoi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dung split (cac version JDK >= 1.4 thi ho tro split de tach chuoi)
		String s = "Huy;dep;trai";
		String []arr = s.split(";");
		for(String name: arr) {
			System.out.println(name);
		}
		
		for(int i=0; i< arr.length; i++) { //length cua mang khong co ngoac tron con cua chuoi thi co ngoac tron) 
			System.out.println(arr[i]);
		}
		
		
		String s2 = "SV001;Nguyen Ho Nhat Huy;AT13N";
		String []arr2 = s2.split(";");
		if(arr2.length == 3) {
			System.out.println("Ma: "+arr2[0]);
			System.out.println("Ten: "+arr2[1]);
			System.out.println("Lop: "+arr2[2]);
		}
		
		//Luu y truong hop tach ma theo ky tu dac biet nhu dau '.' ta phai them '\\'
		String s3 = "SV002.Nguyen Ho Nhat Huy.AT13N";
		String []arr3 = s3.split("\\."); // nen them \\ trong moi truong hop
		if(arr3.length == 3) {
			System.out.println("Ma: "+ arr3[0]);
			System.out.println("Ten: "+ arr3[1]);
			System.out.println("Lop: "+ arr3[2]);
		}
		
		
		// Khi version nho hon 1.4 thi dung Stringtokenize (da hoc bai 33)
		
	}

}

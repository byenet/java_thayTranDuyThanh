package huy.com;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {
	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#add-int-E-
	//https://techblog.vn/arraylist-trong-java
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khong khai bao kieu du lieu cho array list thi array list co kieu nhu any trong typescript
		ArrayList ds1 = new ArrayList();
		ds1.add(1);
		ds1.add("huy");
		ds1.add(new Date("12/12/1990"));
		ds1.add(5.5);
		System.out.println(ds1);
		
		ArrayList<Integer> ds2 = new ArrayList<Integer>();
		ArrayList<Double>  ds3 = new ArrayList<Double>();
		ArrayList<Boolean> ds4 = new ArrayList<Boolean>();
		
		ArrayList<String>  ds5 = new ArrayList<String>();
		ds5.add("huy");
		ds5.add("dep");
		ds5.add("trai");
		
		for (int i=0; i<ds5.size(); i++) {
			System.out.println(ds5.get(i));
		}
		
		System.out.println("--------------------------------------");
		ds5.add(1, "qua");
		
		for (String i: ds5) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------");
		ds5.set(1, "qua la");
		
		
		for (String i: ds5) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------");
		System.out.println("Vi tri cua \"dep\" la: "+ ds5.indexOf("dep"));
		System.out.println("-----------------------------------------");
		System.out.println("dep co ton tai trong list hay khong (co tra ve true khong tra ve false: "+ ds5.contains("dep"));
	}

}

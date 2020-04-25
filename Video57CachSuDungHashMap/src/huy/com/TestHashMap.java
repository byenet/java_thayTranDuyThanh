package huy.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
		//https://niithanoi.edu.vn/tim-hieu-hashmap-trong-java-qua-vi-du.html
		
		// TODO Auto-generated method stub
		/*
		 * HashMap<String, String> map = new HashMap<String, String>();
		 * 
		 * map.put("a", "Huy"); 
		 * map.put("b", "dep"); 
		 * map.put("c", "trai");
		 */

		
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
		  
		 map.put(1, "Huy"); 
		 map.put(2, "dep"); 
		 map.put(3, "trai");
		 
		 
		 for (int i=1; i<=map.size();i++) {
			 System.out.println(map.get(i));
		 }
		 
		System.out.println("---------------------------------------------------------------");
		 
		Collection<String> dsTen = map.values();
		for (String i : dsTen) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		Set<Integer> dsKey = map.keySet();
		for (Integer i: dsKey) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		map.put(4, "haha"); // trung key thi update (giu nguyen key chi doi value) con neu khong trung key thi them moi
		
		for (Integer i: dsKey) {
			System.out.println(i);
		}
		
		for (String i : dsTen) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------------");
		map.remove(1);
		for (Integer i: dsKey) {
			System.out.println(i);
		}
		
		for (String i : dsTen) {
			System.out.println(i);
		}
		
		System.out.println("----------------------------------------------------------------");
		map.clear(); // xoa het list nhu arrayList
		System.out.println("so phan tu con lai: "+ map.size());
		
		
		
	}

}

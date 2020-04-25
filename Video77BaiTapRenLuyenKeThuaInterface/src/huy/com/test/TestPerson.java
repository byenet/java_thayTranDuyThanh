package huy.com.test;

import java.util.ArrayList;

import huy.com.model.Man;
import huy.com.model.Person;
import huy.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> dsPerson = new ArrayList<Person>();
		
		Person huy1 = new Man();
		huy1.setFirstName("huy1");
		
		Person nga1 = new Woman();
		nga1.setFirstName("nga1");
		((Woman)nga1).setWearingMakup(true);
		
		dsPerson.add(huy1);
		dsPerson.add(nga1);
		
		for(Person p: dsPerson) {
			if(p instanceof Man) { //instanceof de kiem tra xem doi tuong la the hien cua lop nao
				System.out.println(p.getFirstName()+ " la Nam");
			}else if(p instanceof Woman) {
				System.out.println(p.getFirstName() + " la Nu");
			}
		}
		
		
		
	}

}

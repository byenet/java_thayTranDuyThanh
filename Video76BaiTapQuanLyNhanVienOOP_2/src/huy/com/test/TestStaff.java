package huy.com.test;

import huy.com.model.Employee;
import huy.com.model.Executive;
import huy.com.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st = new Staff();
		Employee huy = new Employee();
		huy.setName("Huy Nhat");
		huy.setAddress("Quan Tan Binh");
		huy.setPhone("123");
		huy.setPayRate(0.12);
		huy.setSocialSecurityNumber("SEC123");
		
		st.addStaffMember(huy);
		
		Employee huy2 = new Employee();
		huy2.setName("Huy Nhat 2");
		huy2.setAddress("Quan Tan Binh 2");
		huy2.setPhone("12302");
		huy2.setPayRate(0.12);
		huy2.setSocialSecurityNumber("SEC12302");
		
		st.addStaffMember(huy2);
		
		Executive huy3 = new Executive();
		huy3.setName("Huy Nhat 3");
		huy3.setAddress("Quan Tan Binh 3");
		huy3.setPhone("12303");
		huy3.setPayRate(0.12);
		huy3.setSocialSecurityNumber("SEC12303");
		huy3.awardBonus(100);
		
		st.addStaffMember(huy3);
		
		st.payDay();
		
	}

}

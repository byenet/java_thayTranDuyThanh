package huy.com.test;

import huy.com.model.MyThread;

public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread tr1 = new MyThread();
		tr1.setName("Tien trinh A");
		tr1.start();
		
		MyThread tr2 = new MyThread();
		tr2.setName("Tien trinh B");
		tr2.start();
		
		MyThread tr3 = new MyThread();
		tr3.setName("Tien trinh C");
		tr3.start();

	}

}

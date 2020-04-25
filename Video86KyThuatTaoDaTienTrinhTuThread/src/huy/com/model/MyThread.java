package huy.com.model;

public class MyThread extends Thread {
//	https://viblo.asia/p/multithreading-trong-ngon-ngu-java-157G5oz3RAje
// https://gpcoder.com/3484-lap-trinh-da-luong-trong-java-java-multi-threading/
// https://cameoplus.com/multithreading-lap-trinh-da-luong-da-tien-trinh/
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500); // trang thai block. khi dung sleep thi no se day tien trinh vao trang thai block de cac tien trinh khac co co hoi xen vao 
				System.out.println(Thread.currentThread().getName()+ ":i= " +i); // lay name tien trinh hien tai dang chay
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

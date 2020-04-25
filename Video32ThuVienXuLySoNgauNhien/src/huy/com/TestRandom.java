package huy.com;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/* Random rd = new Random();
		 * 
		 * 
		 * int x = rd.nextInt() 
		 * tra ve mot so ngau nhien trong khoang gia tri của int value (từ -2^31 đến 2^31-1).
		 * 
		 * int x = rd.nextInt(maxNumber)
		 *tra ve mot so int ngau nhien tu 0 den gia tri < maxNumber.
		 * 
		 * 
		 * nextLong() : tra ve mot so ngau nhien kieu long. Vi Random su dung gia tri seed chi 48bits, nen thuat toan random khong the tra ve tat ca cac gia tri thuoc kieu long.
		 * nextFloat(): tra ve mot so ngau nhien trong khoang 0.0 va <1.0
		 * nextDouble() : tuong tu nhu nextFloat() nhu do dai phan thap phan lon hon.
		 * nextBoolean() : tra ve gia tri true, false ngau nhien.
		 * */
		
		/* VD:
		 * Random rd = new Random();
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("Nhap vao so bắt đầu: "); int min = sc.nextInt();
		 * System.out.print("Nhap vao so ket thuc: "); int max = sc.nextInt();
		 * 
		 * int x = rd.nextInt((max-min)+1) + min; int x2 = (rd.nextInt((max-min)+1) +
		 * min)*-1;
		 * 
		 * System.out.println("So random duong tu " + min + " toi " + max + " la: " +
		 * x); System.out.println("So random am tu " + min + " toi " + max + " la: " +
		 * x2);
		 */
		
		/*
		 * Ví dụ 1: chúng ta có một game có 4 người chơi, mỗi người có 1 số từ một đến
		 * 4. Chương trình của chúng ta sẽ random từ 1 đến 4 để lựa chọn người may mắn
		 * có số trùng với số được random. Đơn giản chỉ việc gọi hàm nextInt(4), hàm này
		 * sẽ trả về giá trị từ 0 đến 3, nên chúng ta cần cộng thêm 1 để có kết quả như
		 * ý muốn.
		 * 
		 * 1 int value = rd.nextInt(4) + 1; Ví dụ 2: Cần vẽ random một line có
		 * góc từ 0 đến 360 độ.
		 * 
		 * 1 double value = rd.nextDouble() * 360.0; Ví dụ 3: Random int number
		 * trong khoảng được chỉ định.
		 * 
		 * 1 int value = rd.nextInt((max - min) + 1) + min; Ví dụ 4: Trong một số
		 * ứng dụng đăng nhập bằng số điện thoại như Google, sau khi nhập số điện thoại,
		 * Google sẽ gửi một mã xác nhận số điện thoại gồm 6 số ngẫu nhiên. Chúng ta
		 * cũng có thể tạo số ngẫu nhiên này với Random.
		 * 
		 * 1 int code = (int) Math.floor(((Math.random() * 899999) + 100000));
		 */
		
		
		

		/*
		 *  Bai tap: tao ra 1 so ngau nhien [0...100], yeu cau nguoi choi doan so nay,
		 *  cho phep doan sai 7 lan (qua 7 lan thi game over). Neu doan sai thi phai cho 
		 *  nguoi dung biet so nguoi choi du doan nho hon hay lon hon cua may.
		 *  Sau khi ket thuc game (Win or lost) thi hoi xem nguoi choi co muon tiep tuc hay khong.
		 *  
		 *  
		 */
		
		while(true) {
			choi();
			System.out.print("Bạn muốn chơi tiếp không? (y/n): ");
			String tl = new Scanner(System.in).nextLine();
			if(tl.equals("n"))
				break;
			else
				System.out.println();
		}
		System.out.println("Hẹn gặp bạn lần sau...");
	}
	
	public static void choi() {
		Random rd = new Random();
		
		int soMay = rd.nextInt(101);
		int soNguoi;
		int soLanDoan = 0;
		
		System.out.println("Máy đã tạo ra 1 số [0...100], Mời bạn đoán!(7 cơ hội)");
		
		do {
			soLanDoan++;
			System.out.print("Moi bạn nhập sô đoán (Lần đoán thứ " + soLanDoan + "): ");
			soNguoi = new Scanner(System.in).nextInt();
			
			if(soNguoi == soMay) {
				System.out.println("Chúc mừng bạn đã đoán đúng!!!");
				System.out.println();
				break;
			}else if (soNguoi < soMay) {
				System.out.println("Số bạn đoán nhỏ hơn số máy mất rồi!");
				System.out.println();
			}else {
				System.out.println("Số bạn đoán lớn hơn số máy mất rồi!");
				System.out.println();
			}
			
			if(soLanDoan >= 7) {
				System.out.println("Bạn đã thua (Đoán quá 7 lần)...Game Over!!!");
				break;
			}
			
		} while (soLanDoan <= 7);
		
	}

}

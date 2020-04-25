package huy.com.test;

import java.util.ArrayList;

import huy.com.io.SerializeFileFactory;
import huy.com.model.KhachHang;

public class TestFile {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub ArrayList<KhachHang> dsKH = new
		 * ArrayList<KhachHang>();
		 * 
		 * dsKH.add(new KhachHang(1, "huy1")); dsKH.add(new KhachHang(2, "huy2"));
		 * dsKH.add(new KhachHang(3, "huy3")); dsKH.add(new KhachHang(3, "huy4"));
		 * dsKH.add(new KhachHang(5, "huy5"));
		 * 
		 * boolean kq = SerializeFileFactory.luuFile(dsKH,
		 * "D:/project/Java_basic/Video81XuLyTapTinVoiSerialize/TapTin/file.dat" );
		 * if(kq) { System.out.println("Luu file thanh cong!"); }else {
		 * System.out.println("Luu file that bai!"); }
		 */
		
		//Doc file
		Object data = SerializeFileFactory.docFile("D:/project/Java_basic/Video81XuLyTapTinVoiSerialize/TapTin/file.dat");
		ArrayList<KhachHang> dsKH = (ArrayList<KhachHang>) data;
		for(KhachHang kh: dsKH) {
			System.out.println(kh.getMa()+ "-" + kh.getTen());
		}
		
		
	}

}

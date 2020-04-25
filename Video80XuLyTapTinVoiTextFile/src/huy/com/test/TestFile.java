package huy.com.test;


import java.util.ArrayList;

import huy.com.io.TextFileFactory;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<String> dsData = new ArrayList<String>(); dsData.add("HUY");
		  dsData.add("Dep"); dsData.add("Trai");
		  
		  boolean kq = TextFileFactory.luuFile(dsData,
		  "D:/project/Java_basic/Video80XuLyTapTinVoiTextFile/TapTin/dulieutest.txt");
		  
		  if(kq) { System.out.println("Luu file thanh cong"); }else {
		  System.out.println("Luu file that bai"); }
		 
		
//			ArrayList<String> dsData = TextFileFactory.docFile("D:/project/Java_basic/Video80XuLyTapTinVoiTextFile/TapTin/dulieutest.txt");
//			for(String data: dsData) {
//				System.out.println(data);
//			}
//		
	}

}

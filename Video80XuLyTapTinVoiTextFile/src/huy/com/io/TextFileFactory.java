package huy.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TextFileFactory {
	
	public static boolean luuFile(ArrayList<String>dsData, String path) {
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(String data : dsData) {
				bw.write(data);
				bw.write(" ");
//				bw.newLine(); // mewLine de xuong dong
			}
			
			bw.close();
			osw.close();
			fos.close();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<String> docFile (String path){
			
			ArrayList<String> dsDaTa = new ArrayList<String>();
			
			try {
				FileInputStream fis = new FileInputStream(path);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String line = br.readLine();
				while(line!=null) {
					if(line.length()>0)
						dsDaTa.add(line);
						line = br.readLine(); //lay dong tiep theo
				}
				
				br.close();
				isr.close();
				fis.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return dsDaTa;
		}
		
	
}

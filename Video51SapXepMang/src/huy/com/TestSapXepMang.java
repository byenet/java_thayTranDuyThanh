package huy.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class TestSapXepMang {
	
	public static void nhapMang (int M[])
	{
		Random rd = new Random();
		
		for(int i=0; i<M.length; i++) {
			M[i] = rd.nextInt(100); // 0 - 100
		}
	}
	
	public static void xuatMang(int M[]) {
		for(int i : M) {
			System.out.print(i+"\t");
		}
	}
	
	
	public static void  BubbleSort(int []M) {
		int i,j;
		for(i = 0; i<M.length; i++) {
			for(j = M.length - 1; j > i; j--) {
				if(M[j] < M[j-1]) {
					int temp = M[j];
					M[j] = M[j-1];
					M[j-1] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi ban nhap vao so phan tu: ");
		int n = sc.nextInt();
		
		int M[] = new int[n];
		nhapMang(M);
		xuatMang(M);
//		BubbleSort(M);
//		System.out.println("\nMang sau khi sap xep thu cong la: ");
//		xuatMang(M);
		
		System.out.println("\nMang sau khi sap xep tang dan bang method sort trong gói java.util.Arrays: ");
		Arrays.sort(M);
		xuatMang(M);
		
		
		System.out.println("\n---------------------------------------------");
		System.out.println("\nSap xep chu cai");
		String[] fruits = new String[] { "Pineapple", "Apple", "Orange", "Banana" };
		 
        // Sử dụng phương thức tĩnh của lớp Arrays để sắp xếp.
        // Arrays.sort(Object[])
        Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits " + i + " : " + fruits[i]);
        }
        
//        System.out.println("\n Sap xep nguoc chu cai: ");
//        Arrays.sort(fruits, Collections.reverseOrder());
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.println("fruits " + i + " : " + fruits[i]);
//        }
	
	}
}

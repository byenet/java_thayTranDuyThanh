package huy.com;

import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// link: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		
		System.out.println("PI = " + Math.PI);
		int sonn = Math.min(9, 15);
		int soln = Math.max(9, 15);
		System.out.println("Min: " + sonn);
		System.out.println("Max: "+ soln);
		
		double can = Math.sqrt(25);
		System.out.println("Can bac hai cua 25: "+ can);
		
		double gttd = Math.abs(-4);
		System.out.println("Gia tri tuyet doi cua -4: " + gttd);
		
		double lt = Math.pow(3, 4);
		System.out.println("3^4: "+ lt);
		
		System.out.print("Moi ban nhap 1 goc: ");
		int goc = new Scanner(System.in).nextInt();
		double radian = Math.PI*goc/180;
		double sin = Math.sin(radian);
		double cos = Math.cos(radian);
		double tan = Math.tan(radian);
		double cotan = 1/tan;
		
		System.out.println("sin(" + goc + ") = " +sin);
		System.out.println("cos(" + goc + ") = " +cos);
		System.out.println("tan(" + goc + ") = " +tan);
		System.out.println("cotan(" + goc + ") = " +cotan);
		
		
		
		
	}

}

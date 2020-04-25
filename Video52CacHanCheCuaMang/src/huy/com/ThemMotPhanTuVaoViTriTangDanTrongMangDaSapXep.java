package huy.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThemMotPhanTuVaoViTriTangDanTrongMangDaSapXep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang a[]: ");
        n = sc.nextInt();
        a = new int[n];
        nhapMangRandom(a);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int x;
        System.out.print("nhap phan tu can chen, x = ");
        x = sc.nextInt();
        a = chen(a,x);
        System.out.println(Arrays.toString(a));
	}
	
    
    static int [] chen( int[] a, int x ){
    	int [] brr = new int [a.length + 1];
    	brr = Arrays.copyOfRange(a, 0, a.length+1);
    	
        if(brr[0] > x )
        {
            for( int i = brr.length-1;  i> 0; i-- )
                brr[i] = brr[i-1];
           brr[0] = x;
        }
        else if(brr[brr.length-2] < x ) brr[brr.length-1] = x;
        else{
            int index = 0;
            for(int i = 0; i< brr.length-1; i++ )
                if(brr[i] > x) {
                    index = i;
                    break;
                }
            for(int i = brr.length-1; i> index; i--)
                brr[i] = brr[i-1];
            brr[index] = x;
        }
    	return brr;
    }
    
   
    public static void nhapMangRandom(int M[]) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		for (int i = 0; i<M.length - 1; i++) {
			M[i] = random.nextInt(10);
		}
	}

}

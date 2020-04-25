package huy.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TestDinhDangSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1900800700;
		
		DecimalFormat dcf = new DecimalFormat("#,###");
		DecimalFormatSymbols dcfs = new DecimalFormatSymbols(Locale.getDefault());
		dcfs.setGroupingSeparator('.');
		dcf.setDecimalFormatSymbols(dcfs);
		
		System.out.println(dcf.format(x));
	}

}

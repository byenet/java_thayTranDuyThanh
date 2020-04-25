package huy.com;

public class TestToiUuChuoi {
	
	/*De
	 *Cho mot chuoi bat ky, hay toi uu theo mo ta:
	 *Chuoi khong co khoang trang du thua,
	 *cac tu cach nhau boi 1 khoang trang
	 *ky tu dau cua cac tu viet hoa
	 *
	 *
	 *VD: 
	 *input: "  Tran    duY   THanh  "
	 *outPut: "Tran Duy Thanh"
	 */
	public static String toiUu(String s) {
		String sToiUu = s;
		String []arrWord = sToiUu.split(" ");
		sToiUu = "";
		for (String word: arrWord) {
			String newWord = word.toLowerCase();
			if(newWord.length() > 0) {
				newWord = newWord.replaceFirst(newWord.charAt(0)+"", (newWord.charAt(0)+"").toUpperCase());
				sToiUu+=newWord + " ";
			}
		}
		return sToiUu.trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  Tran    duY   THanh  ";
		String sToiUu = toiUu(s);
		System.out.println("Chuoi truoc khi toi uu: "+s);
		System.out.println("Chuoi sau khi toi uu: "+ sToiUu);
		
	}

}

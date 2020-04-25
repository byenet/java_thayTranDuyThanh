package huy.com.model;

public enum XepLoai {
	Gioi ("Giỏi"),
	Kha ("Khá"),
	TrungBinh ("Trung Bình"),
	Yeu ("Yếu");
	
	private String ms;
	private XepLoai(String ms){
		this.ms = ms;
	}
	
	public String getDescription() {
		return this.ms;
	}
}

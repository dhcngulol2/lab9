package BaiTH9task2;

import java.util.List;

public class Reference extends publication{
	
	private String field ;
	private List<Chaper> chaps;
	public Reference(List<Chaper> chap,String field,String title, int pageNumber, int year, String author, double price) {
		super(title, pageNumber, year, author, price);
		this.field = title;
		this.chaps = chaps;
	}
	@Override 
	public String theType() {
		return "sach tham khao ";
	}
	@Override
	public boolean isMagazine() {
		return false;
	}
	public int getMaxChaper() {
		return chaps.size();
	}


}

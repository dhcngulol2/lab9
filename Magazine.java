package BaiTH9task2;

public class Magazine extends publication{
	private String name ;

	public Magazine(String name,String title, int pageNumber, int year, String author, double price) {
		super(title, pageNumber, year, author, price);
		this.name = name;
	}
	@Override
	public String theType() {
		return "tap chi";
	}
	@Override
	public boolean isMagazine() {
		return true;
	}
	
	

	
}

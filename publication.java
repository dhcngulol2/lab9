package BaiTH9task2;

import java.util.Date;

public abstract class publication {
	protected String title;
	protected int pageNumber;
	protected int year;
	protected String author;
	protected double price;
	
	public publication(String title, int pageNumber, int year, String author, double price) {
		super();
		this.title = title;
		this.pageNumber = pageNumber;
		this.year = year;
		this.author = author;
		this.price = price;
	}
	//method to determine what the type publication 
	public String theType() {
		
		return "hihi";
	}
	//determine is magazine 
	public boolean isMagazine() {
		return false;
	}
	//if the publication was published 10 year ago then method will return true 
	public boolean OlderThan10year() {
		if(isMagazine() && (2023-year)>=10) {
			return true;
		}
		return false;
		
	}
	//compare whether 2 publication are of the same author and title 
	public boolean isSame (publication other) {
		if (this.author == other.author && this.isMagazine()==other.isMagazine()) {
			return true;
		}
		return false;
	}
	
	

	

}

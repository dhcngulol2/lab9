package BaiTH9task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicationList {
	private List<publication> list;

	public PublicationList(List<publication> list) {
		super();
		this.list = list;
	}

	// calculate the total price of the publications
	public float total() {
		float result = 0;
		for (publication plct : list) {
			result += plct.price;
		}
		return result;
	}
	// used to find the publication has the most pages
	public Reference theReferenceMostPages() {
		int maxPage = 0;
		Reference referenceMostPage = null;
		for (publication plct : list) {

			if (plct instanceof Reference) {
				Reference re = (Reference) plct;
				int nuChap = re.pageNumber;
				if (maxPage < nuChap) {
					referenceMostPage = re;
					maxPage = nuChap;
				}
			}
		}
		return referenceMostPage;
	}
	//create a arrayList contains the magazines published last year 
	public ArrayList<publication> publishLastYear() {
	    ArrayList<publication> lastYearPublications = new ArrayList<>();
	    for (publication plct : this.list) { 

	        if (plct instanceof Reference) {
	            Reference re = (Reference) plct;
	            int year1 = re.year;
	            if (year1 == 2022) {
	                lastYearPublications.add(re); 
	            }
	        }
	    }
	    return lastYearPublications; 
	}
	// sort the list contains publication by title after that sort by year
	public List<publication> sortList() {
	    List<publication> sortedList = new ArrayList<>(this.list); // Tạo một bản sao của danh sách để tránh sửa đổi danh sách gốc
	    Collections.sort(sortedList, new PublicatioComparator());
	    return sortedList;
	}
	//statistical publication by year
	public Map<Integer , ArrayList<publication>> statisticalByYear(){
		Map<Integer, ArrayList<publication>> map = new HashMap<>();
		for (publication plct : list) {
			int nukey = plct.year;
			if (!map.containsKey(nukey)) {
				map.put(nukey,new ArrayList<publication>());
				map.get(nukey).add(plct);
				
			}
			map.get(nukey).add(plct);
		}
		
		return map;
	}

}

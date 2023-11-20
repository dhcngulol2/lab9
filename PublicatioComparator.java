package BaiTH9task2;

import java.util.Comparator;

public class PublicatioComparator implements Comparator<publication>  {
	@Override
	public int  compare (publication plct1 , publication plct2 ) {
		int nu = plct1.title.compareTo(plct2.title);
		if (nu != 0) {
            return nu; // Sắp xếp tăng dần theo tiêu đề
        } else {
            // Sắp xếp giảm dần theo năm xuất bản nếu tiêu đề giống nhau
            return Integer.compare(plct2.year, plct1.year);
        }
	}
	

}

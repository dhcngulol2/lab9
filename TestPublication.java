package BaiTH9task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestPublication {
	public static void main(String[] args) {
        
        
        List<Chaper> chaps1 = new ArrayList<>();
        chaps1.add(new Chaper("Chapter 1", 20)); // Giả sử Chaper có constructor tương tự như (String title, int pageNumber)
        Reference reference1 = new Reference(chaps1, "Science", "Reference Book 1", 200, 2020, "Author X", 35.0);

        // Ví dụ 2
        List<Chaper> chaps2 = new ArrayList<>();
        chaps2.add(new Chaper("Chapter A", 15));
        chaps2.add(new Chaper("Chapter B", 25));
        Reference reference2 = new Reference(chaps2, "History", "Reference Book 2", 250, 2019, "Author Y", 40.0);

        // Ví dụ 3
        Magazine magazine1 = new Magazine("Science Magazine", "Science Mag Issue 1", 50, 2022, "Editor A", 15.0);

        // Ví dụ 4
        Magazine magazine2 = new Magazine("History Magazine", "History Mag Issue 5", 40, 2021, "Editor B", 12.0);
        
        List<publication> publications = new ArrayList<>();
        
        publications.add(magazine2);
        publications.add(magazine1);
        publications.add(reference2);
        publications.add(reference1);
        
        
        // Tạo đối tượng PublicationList từ danh sách ấn phẩm
        PublicationList publicationList = new PublicationList(publications);
        
        System.out.println();
        System.out.println("Câu 9");
        
        // Kiểm tra các phương thức trong lớp PublicationList
        float total = publicationList.total();
        System.out.println("Tổng tiền của các ấn phẩm: " + total);
        
        System.out.println();
        System.out.println("Câu10 ");
        Reference mostPagesReference = publicationList.theReferenceMostPages();
        if (mostPagesReference != null) {
            System.out.println("Quyển sách tham khảo có nhiều trang nhất: " + mostPagesReference.title);
        } else {
            System.out.println("Không có quyển sách tham khảo trong danh sách.");
        }
        
        System.out.println();
        System.out.println("Câu11 ");
        ArrayList<publication> lastYearPublications = publicationList.publishLastYear();
        System.out.println("Các tạp chí xuất bản năm ngoái: " + lastYearPublications.size());

        System.out.println();
        System.out.println("Câu12 ");
        List<publication> sortedPublications = publicationList.sortList();
        System.out.println("Danh sách các ấn phẩm sau khi sắp xếp: ");
        for (publication publication : sortedPublications) {
            System.out.println(publication.title + " - " + publication.year);
        }
        
        System.out.println();
        System.out.println("Câu13 ");
        Map<Integer, ArrayList<publication>> publicationByYear = publicationList.statisticalByYear();
        System.out.println("Thống kê các ấn phẩm theo năm xuất bản: ");
        for (Map.Entry<Integer, ArrayList<publication>> entry : publicationByYear.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }
    }

}

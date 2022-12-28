package book;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BookDAO;
import dto.BookVO;

public class BookCategoryViewerAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/book/bookCategoryViewer.jsp";
		String category = request.getParameter("category");
		
String categoryName = "";
		
		try {
			switch(category) {
			case "001": 
				categoryName = "���� �ܱ��� ����";
				break;
			case "002": 
				categoryName = "û�ҳ�";
				break;
			case "003": 
				categoryName = "���� �濵";
				break;
			case "004": 
				categoryName = "���� �츲";
				break;
			case "005": 
				categoryName = "�ι�";
				break;
			case "006": 
				categoryName = "�Ҽ�/��/���";
				break;
			case "007": 
				categoryName = "������";
				break;
			case "008": 
				categoryName = "���輭 �ڰ���";
				break;
			case "009": 
				categoryName = "��ȭ/����Ʈ�뺧";
				break;
			case "010": 
				categoryName = "����";
				break;
			case "011": 
				categoryName = "�ڿ�����";
				break;
			case "012": 
				categoryName = "�ڱ���";
				break;
			case "013": 
				categoryName = "����";
				break;
			case "014": 
				categoryName = "����";
				break;
			case "015": 
				categoryName = "���";
				break;
			case "016": 
				categoryName = "��ȸ ��ġ";
				break;
			case "017": 
				categoryName = "IT �����";
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("categoryName: " + categoryName);
		BookDAO bDao = BookDAO.getInstance();
		List<BookVO> booklist = bDao.selectBooksByCategory(categoryName);
	    
		request.setAttribute("booklist", booklist);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
package book;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BookDAO;
import dto.BookVO;

public class BookMainAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/book/bookMain.jsp";
	      
	      BookDAO bDao = BookDAO.getInstance();
	      
	      List<BookVO> booklist = bDao.selectAllCategory();
	      request.setAttribute("booklist", booklist);
	      
	      RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	      dispatcher.forward(request, response);
	}
}

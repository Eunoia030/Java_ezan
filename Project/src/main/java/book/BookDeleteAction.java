package book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BookDAO;

public class BookDeleteAction implements Action {
	@Override 
	public void execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));

		BookDAO bDao = BookDAO.getInstance();
		bDao.deleteBook(num);
		
		response.sendRedirect("BookServlet?command=book_list");
	}
}

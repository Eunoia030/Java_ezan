package book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BookDAO;
import dto.BookVO;


public class BookDetailAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/book/bookDetail.jsp";
		int num = Integer.parseInt(request.getParameter("num"));
		
		BookDAO bDao = BookDAO.getInstance();
		
		BookVO bVo = bDao.selectOneBookByNum(num);
		
		request.setAttribute("book", bVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}

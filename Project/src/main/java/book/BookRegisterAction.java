package book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BookDAO;
import dto.BookVO;

public class BookRegisterAction implements Action {
   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException{
      
      BookVO bVo = new BookVO();
      
      bVo.setCategory(request.getParameter("category"));
      bVo.setTitle(request.getParameter("title"));
      bVo.setPrice(request.getParameter("price"));
      bVo.setSummary(request.getParameter("summary"));
      bVo.setAuthor(request.getParameter("author"));
      bVo.setPub(request.getParameter("pub"));
      bVo.setGrade(request.getParameter("grade"));
      bVo.setPictureurl(request.getParameter("pictureurl"));
      
      BookDAO Dao = BookDAO.getInstance();
      Dao.insertBook(bVo);
      
      response.sendRedirect("BookServlet?command=book_list");
   }
}
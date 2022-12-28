package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class BookDAO {
	private BookDAO() { }
	
	private static BookDAO instance = new BookDAO();
	
	public static BookDAO getInstance() {
		return instance;
	}
	
	public List<BookVO> selectAllBooks() {
	      String sql = "select * from book order by num";
	      
	      List<BookVO> list = new ArrayList<BookVO>();
	      Connection conn = null;
	      Statement stmt = null;
	      ResultSet rs = null;
	      
	      try {
	         conn = DBManager.getConnection();
	         stmt = conn.createStatement();
	         
	         rs = stmt.executeQuery(sql);
	         
	         while (rs.next()) {
	            BookVO bVo = new BookVO();
	            
	            bVo.setNum(rs.getInt("num"));
	            bVo.setCategory(rs.getString("category"));
	            bVo.setTitle(rs.getString("title"));
	            bVo.setPrice(rs.getString("price"));
	            bVo.setSummary(rs.getString("summary"));
	            bVo.setAuthor(rs.getString("author"));
	            bVo.setPub(rs.getString("pub"));
	            bVo.setGrade(rs.getString("grade"));
	            bVo.setPictureurl(rs.getString("pictureurl"));
	            
	            list.add(bVo);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         DBManager.close(conn, stmt, rs);
	      }
	      return list;
	   }
	
	public void insertBook(BookVO bVo) {
	      String sql = "insert into book values(Book_seq.nextval, ?,?, ?, ?, ?, ?, ?, ?)";
	      
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      try {
	         conn = DBManager.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, bVo.getCategory());
	         pstmt.setString(2, bVo.getTitle());
	         pstmt.setString(3, bVo.getPrice());
	         pstmt.setString(4, bVo.getSummary());
	         pstmt.setString(5, bVo.getAuthor());
	         pstmt.setString(6, bVo.getPub());
	         pstmt.setString(7, bVo.getGrade());
	         pstmt.setString(8, bVo.getPictureurl());
	         pstmt.executeUpdate();
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         DBManager.close(conn, pstmt);
	      }
	   }
	
	public BookVO selectOneBookByNum(int num) {
		String sql = "select * from book where num = ?";
		
		BookVO bVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				bVo = new BookVO();
				
				bVo.setNum(rs.getInt("num"));
				bVo.setCategory(rs.getString("category"));
				bVo.setTitle(rs.getString("title"));
				bVo.setPrice(rs.getString("price"));
				bVo.setSummary(rs.getString("summary"));
				bVo.setAuthor(rs.getString("author"));
				bVo.setPub(rs.getString("pub"));
				bVo.setGrade(rs.getString("grade"));
				bVo.setPictureurl(rs.getString("pictureurl"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return bVo;
	}
	

	   public void updateBook(BookVO bVo) {
	      String sql = "update book set category = ?, title = ?, price = ?, summary = ?, author = ?, pub = ?, grade = ? where num = ?";
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      try {
	         conn = DBManager.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, bVo.getCategory());
	         pstmt.setString(2, bVo.getTitle());
	         pstmt.setString(3, bVo.getPrice());
	         pstmt.setString(4, bVo.getSummary());
	         pstmt.setString(5, bVo.getAuthor());
	         pstmt.setString(6, bVo.getPub());
	         pstmt.setString(7, bVo.getGrade());
	         pstmt.setInt(8, bVo.getNum());
	         pstmt.executeUpdate();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         DBManager.close(conn, pstmt);
	      }
	   }
	
	public void deleteBook(int num) {
		String sql = "delete book where num = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<BookVO> selectAllCategory() {
		String sql = "select distinct category from book";
	      
	      List<BookVO> list = new ArrayList<BookVO>();
	      Connection conn = null;
	      Statement stmt = null;
	      ResultSet rs = null;
	      
	      try {
	         conn = DBManager.getConnection();
	         stmt = conn.createStatement();
	         
	         rs = stmt.executeQuery(sql);
	         
	         while (rs.next()) {
	            BookVO bVo = new BookVO();
	            
	            bVo.setCategory(rs.getString("category"));
	            
	            list.add(bVo);
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         DBManager.close(conn, stmt, rs);
	      }
	      return list;
	}
	
	public List<BookVO> selectBooksByCategory(String category) {
		String sql = "select * from book where category = ?";
		List<BookVO> list = new ArrayList<BookVO>();
		BookVO bVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, category);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				bVo = new BookVO();
				
				bVo.setNum(rs.getInt("num"));
				bVo.setCategory(rs.getString("category"));
				bVo.setTitle(rs.getString("title"));
				bVo.setPrice(rs.getString("price"));
				bVo.setSummary(rs.getString("summary"));
				bVo.setAuthor(rs.getString("author"));
				bVo.setPub(rs.getString("pub"));
				bVo.setGrade(rs.getString("grade"));
				bVo.setPictureurl(rs.getString("pictureurl"));
				
				list.add(bVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
									// 카테고리				검색어
	public List<BookVO> searchBook(String searchCategory, String keyWord) {
		List<BookVO> list = new ArrayList<>();
		BookVO bVo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from book where " + searchCategory.trim() + " like ?";
		sql += " order by num";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyWord.trim() + "%"); // '%keyWord%'
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				bVo = new BookVO();
				
				bVo.setNum(rs.getInt("num"));
				bVo.setCategory(rs.getString("category"));
				bVo.setTitle(rs.getString("title"));
				bVo.setPrice(rs.getString("price"));
				bVo.setSummary(rs.getString("summary"));
				bVo.setAuthor(rs.getString("author"));
				bVo.setPub(rs.getString("pub"));
				bVo.setGrade(rs.getString("grade"));
				
				list.add(bVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public int bookCount(String searchCategory, String keyWord) {
		int count = 0;
		String sql = "select count(*) as count from book where " + searchCategory.trim() + " like ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyWord.trim() + "%");
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return count;
	}
}

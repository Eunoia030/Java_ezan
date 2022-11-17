package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DBBooks {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	private static DBBooks dbb;
	private final  String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final  String user = "KyoboBooks";
	private final  String pwd = "1234";
	
private DBBooks() {
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	public void getConnection() {
		
		
		try {
			conn = DriverManager.getConnection(url,user,pwd);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DBBooks newInstance() {
		if( dbb == null )
			dbb = new DBBooks();
		
		return dbb;
	}


	public void KyoboBooksInsert(KyoboBooksVO kb) {
		try {	
		
				//1.DB연결 
				getConnection();
	
				//2.sql문 작성 
				String sql = "insert into KyoboBooks values(kyobo_sql.nextval,?,?,?,?,?,?,?)";
	
				//3.오라클로 sql문장 전송
				pstmt = conn.prepareStatement(sql);
	
				//4.값 저장 
				
				pstmt.setString(1, kb.getCategory());
				pstmt.setString(2, kb.getTitle());
				pstmt.setString(3, kb.getAuthor());
				pstmt.setString(4, kb.getPub());
				pstmt.setString(5, kb.getPrice());
				pstmt.setString(6, kb.getSummary());
				pstmt.setString(7, kb.getGrade());
	
				//5.전송된 값을 커밋 또는 업데이트
				pstmt.executeUpdate();
	
	
		} catch(SQLException e) {
			e.printStackTrace();
		
		} finally {
			disConnection();
		}
	
	}
}


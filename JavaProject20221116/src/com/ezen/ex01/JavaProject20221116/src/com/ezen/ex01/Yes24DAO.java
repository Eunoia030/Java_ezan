package com.ezen.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Yes24DAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	private static Yes24DAO dbb;
	private final  String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final  String user = "Yes24";
	private final  String pwd = "1234";
	
private Yes24DAO() {
		
		
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
	
	public static Yes24DAO newInstance() {
		if( dbb == null )
			dbb = new Yes24DAO();
		
		return dbb;
	}


	public void Yes24Insert(Yes24VO yes) {
		try {	
		
				//1.DB연결 
				getConnection();
	
				//2.sql문 작성 
				String sql = "insert into Yes24 values(yes24_sql.nextval,?,?,?,?,?,?,?)";
	
				//3.오라클로 sql문장 전송
				pstmt = conn.prepareStatement(sql);
	
				//4.값 저장 
				
				pstmt.setString(1, yes.getCategory());
				pstmt.setString(2, yes.getTitle());
				pstmt.setString(3, yes.getAuthor());
				pstmt.setString(4, yes.getPub());
				pstmt.setString(5, yes.getPrice());
				pstmt.setString(6, yes.getSummary());
//				pstmt.setDouble(7, yes.getGrade());
				pstmt.setString(7, yes.getGrade());
	
				//5.전송된 값을 커밋 또는 업데이트
				pstmt.executeUpdate();
	
	
		} catch(SQLException e) {
			e.printStackTrace();
		
		} finally {
			disConnection();
		}
	
	}
}
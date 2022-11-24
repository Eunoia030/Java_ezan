package EX02;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class test2DAO {

	//Oracle scott계정에 연동

	private final  String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final  String user = "scott";
	private final  String pwd = "1234";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private static  test2DAO dao;
	
	public test2DAO() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		System.out.println("----------------오라클드라이버 연결완료-----------------------");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}


	 public Connection getConnection() { //연결
			try {
				return DriverManager.getConnection(url,user,pwd);
			} catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
		}

public void disConnection() {	//연결해제
	try {
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public static test2DAO Instance() {
	if( dao == null )
		dao = new test2DAO();
	
	return dao;
}

public List<test2VO> empselect() {
	
	List<test2VO> list = new ArrayList<>();
	String sql = "select * from emp order by empno";
	
	try {
		conn = DriverManager.getConnection(url,user,pwd);
		pstmt = conn.prepareStatement(sql);
//		System.out.println("conn: "+conn);
//		System.out.println("pstmt: "+pstmt);
		
		rs= pstmt.executeQuery();
//		System.out.println("rs : " + rs);
		
		while(rs.next()) {
//			직접입력도 가능하나. 이렇게도 가능.
			
			test2VO vo = new test2VO();
//		while문 안에 객체를 만든이유는?
//			 생성된 리스트 방하나에 하나의 객체가 들어가야하므로 그때그때 방을 열어준다??
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setDate(rs.getString(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			
			list.add(vo);		
			//list에 담기
			
//			System.out.print(rs.getString(1)+"\t");
//			System.out.print(rs.getString(2)+"\t");
//			System.out.print(rs.getString(3)+"\t");
//			System.out.print(rs.getString(4)+"\t");
//			System.out.print(rs.getString(5)+"\t");
//			System.out.print(rs.getString(6)+"\t");
//			System.out.print(rs.getString(7)+"\t");
//			System.out.print(rs.getString(8));
		}
	} 
	catch(SQLException e) {
		e.printStackTrace();
	}
	return list;
}
}
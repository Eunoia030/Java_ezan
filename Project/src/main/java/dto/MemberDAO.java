package dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

public class MemberDAO {
	private MemberDAO() { }
	
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public int userCheck(String id, String pass) {
		int result = -1;
		
		String sql = "select pass from member where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) { 
				
				if (rs.getString("pass") != null && rs.getString("pass").equals(pass)) {
					result = 1; 
				} else {
					result = 0; 
				}
			} else {
				result = -1; 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return result;
	}
	
	public MemberVO getMember(String id) {
		MemberVO mVo = null;
		String sql = "select * from member where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				mVo = new MemberVO();
				mVo.setId(rs.getString("id"));
				mVo.setPass(rs.getString("pass"));
				mVo.setName(rs.getString("name"));
				mVo.setPhone(rs.getString("phone"));
				mVo.setEmail(rs.getString("email"));
				mVo.setLev(rs.getString("lev"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mVo;
	}
	
	public List<MemberVO> listMember() {
		List<MemberVO> list = new ArrayList<>();
		
		String sql = "select * from member";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MemberVO mVo = new MemberVO();
				mVo.setId(rs.getString("id"));
				mVo.setPass(rs.getString("pass"));
				mVo.setName(rs.getString("name"));
				mVo.setPhone(rs.getString("phone"));
				mVo.setEmail(rs.getString("email"));
				mVo.setLev(rs.getString("lev"));
				
				list.add(mVo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public void userManager(MemberVO mVo) {
		
		String sql = "update member set pass=?, name=?, phone=?, email=?, lev=? where id=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try { 
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getPass());
			pstmt.setString(2, mVo.getName());
			pstmt.setString(3, mVo.getPhone());
			pstmt.setString(4, mVo.getEmail());
			pstmt.setString(5, mVo.getLev());
			pstmt.setString(6, mVo.getId());
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public int confirmID(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = -1;

		String sql = "select id from member where id = ?";

		try {
			conn = DBManager.getConnection(); 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) { 
				result = 1;
			} else {
				result = -1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return result;
	}
	
	public MemberVO selectOneMemberById(String id) {
		String sql = "select id from member where id = ?";
		MemberVO mVO = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mVO = new MemberVO();
				mVO.setId(rs.getString("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mVO;
	}

	
	//�쉶�썝 異붽�
    public void insertMember(MemberVO mVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "insert into member(id, pass, name, phone, email) values(?, ?, ?, ?, ?)";

		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getId());
			pstmt.setString(2, mVo.getPass());
			pstmt.setString(3, mVo.getName());
			pstmt.setString(4, mVo.getPhone());
			pstmt.setString(5, mVo.getEmail());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
	}

    public void updatemypage(MemberVO mVo) {
    	
    	String sql = "update member set pass=?, name=?, phone=?, email=? where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getId());
			pstmt.setString(2, mVo.getPass());
			pstmt.setString(3, mVo.getName());
			pstmt.setString(4, mVo.getPhone());
			pstmt.setString(5, mVo.getEmail());
			
			pstmt.executeUpdate(); // 성공하면 insert가 성공한 행의 수를 반환, 싪패하면 0
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
}

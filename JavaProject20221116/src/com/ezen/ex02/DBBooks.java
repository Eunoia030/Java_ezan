package com.ezen.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBBooks {

	static Scanner sc = new Scanner(System.in);
	
	private Connection conn = null;
	//자바와 DB를 연결
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	private static DBBooks dbb;
	private final  String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final  String user = "Yes24";
	private final  String pwd = "1234";
	
	
 public static void main(String[] args) { //메인 메서드
    
	 DBBooks dbb = DBBooks.newInstance();

	 dbb.mainmenu();
	 
	}
 private DBBooks() {
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

 public Connection getConnection() {
		
		
		try {
			return DriverManager.getConnection(url,user,pwd);
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
 
 
//연결 해제: 사용 후 연결 해제를 해주지 않으면 불필요한 자원이 낭비되며 새로운 Connection, (Prepared)Statement 생성 불가
//각 메서드마다 마지막에 반드시 사용
 public void disConnection() {
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			if(rs != null) rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
 //객체를 만들기 위해 사용할 메서드: 생성자를 private로 접근 제한했기 때문
 public static DBBooks newInstance() {
		if( dbb == null )
			dbb = new DBBooks();
		
		return dbb;
	}


 public void Yes24Insert(Yes24VO vo) {
		try {	
		
				//1.DB연결 
				conn = getConnection();
	
				//2.sql문 작성 
				String sql = "insert into Yes24 values(yes24_sql.nextval,?,?,?,?,?,?,?)";
	
				//3.오라클로 sql문장 전송
				pstmt = conn.prepareStatement(sql);
	
				//4.값 저장 
				
				pstmt.setString(1, vo.getCategory());
				pstmt.setString(2, vo.getTitle());
				pstmt.setString(3, vo.getPrice());
				pstmt.setString(4, vo.getSummary());
				pstmt.setString(5, vo.getAuthor());
				pstmt.setString(6, vo.getPub());
				pstmt.setString(7, vo.getGrade());
	
				//5.전송된 값을 커밋 또는 업데이트
				pstmt.executeUpdate();
	
	
		} catch(SQLException e) {
			e.printStackTrace();
		
		} finally {
			disConnection();
		}
	}
 
public int mainmenu() {
	System.out.println("=============작업선택=============");
	System.out.println("1.크롤링 2.CRUD작업");
	System.out.println("선택 : ");
	
	 int input=sc.nextInt(); 
     sc.nextLine();

  return input;
	
}

public void mainmenuStart(){ //첫 화면
    while(true){
       int choice = mainmenu();//mainmenu에서 반환된 숫자를 choice에 저장

       switch(choice){
       case 1: crawling(); break; //1.월간베스트 크롤링
       case 2: menuBook();break; //2.CRUD작업 
       case 0:  System.out.println("프로그램을 종료합니다."); //0. 작업종료
       return;
       default : System.out.println("번호를잘못입력했습니다. 다시 입력하세요");
      
       }
    }
 }
public void crawling() {
	Yes24 yes = new Yes24();
	yes.yes24Book();
}
 public int menuBook() { //메뉴 화면
     System.out.println("=====작업선택=====");
     System.out.println("1.전체자료 출력 2.자료 추가 3.자료 삭제 4.전체 자료 수정 5.선택 자료 수정 6.선택 자료 검색 0.작업 종료");
     System.out.print("선택 : ");

     int input=sc.nextInt(); 
        sc.nextLine();

     return input;
  }

 
 public void menuBookStart(){ //첫 화면
    while(true){
       int choice = menuBook();//menubook에서 반환된 숫자를 choice에 저장

       switch(choice){
       case 1: displayBook(); break; //1.전체자료 출력
       case 2: addBook();break; //2.자료추가
       case 3: deleteBook(); break; //3.자료삭제
       case 4: updateBook(); break; //4.자료수정 UPDATE
       case 5: updateselectBook(); break; //5. 선택항목자료수정 UPDATE2
       case 6: searchBook(); break; //6. 자료검색
       case 0:  System.out.println("프로그램을 종료합니다."); //0. 작업종료
       return;
       default : System.out.println("번호를잘못입력했습니다. 다시 입력하세요");
      
       }
    }
 }
//데이터 조회(출력)
 private void displayBook() {
    
    try {
       conn = getConnection();
       
       String sql = "select * from Yes24";
       
       pstmt = conn.prepareStatement(sql);
       //connection정보를 담은 객체 conn으로부터 Statement 인스턴스를 생성
       
       rs = pstmt.executeQuery(sql);
       //sql 문을 실행하고 결과값을 rs에 저장
       
       while (rs.next()) {
    	   
          System.out.println(rs.getInt("rank") + "위");
          System.out.println("카테고리: " + rs.getString("category"));
          System.out.println("제목: " + rs.getString("title"));
          System.out.println("가격: " + rs.getString("price"));
          System.out.println("줄거리: " + rs.getString("summary"));
          System.out.println("저자: " + rs.getString("author"));
          System.out.println("출판사: " + rs.getString("pub"));
          System.out.println("평점: " + rs.getString("grade"));
          System.out.println("==============================================================================================");
       }
    } catch (SQLException e) {
       e.printStackTrace();
    } finally {
       disConnection();
    }
 }
 
 // 2. 자료 추가
 private void addBook() {
    
    int count = 0;
    String book = "";
    
    do{
       System.out.println("책(의) 정보를 입력하세요 : ");
       book = sc.nextLine();
       count = getbookCount(book);
       if(count>0){
          System.out.println(book +  "은(는) 이미 등록된 책 정보 입니다.");
          System.out.println("다른 책 정를 입력하세요");

       }
    }while(count>0);

    System.out.println("책의 카테고리를 입력해주세요");
    String category = sc.nextLine();
    System.out.println("책의 제목을 입력해주세요");
    String title = sc.nextLine();
    System.out.println("책의 가격을 입력해주세요");
    String price = sc.nextLine();
    System.out.println("책의 줄거리를 입력해주세요");
    String summary = sc.nextLine();
    System.out.println("책의 저자를 입력해주세요");
    String author = sc.nextLine();
    System.out.println("책의 출판사를 입력해주세요");
    String pub = sc.nextLine();
    System.out.println("책의 평점을 입력해주세요");
    String grade  = sc.nextLine();

    try {
       conn = getConnection();

       String sql = " insert into Yes24 values(yes24_sql.nextval,?,?,?,?,?,?,?)";
       pstmt = conn.prepareStatement(sql);
       pstmt.setString(1, category);
       pstmt.setString(2, title);
       pstmt.setString(3, price);
       pstmt.setString(4, summary);
       pstmt.setString(5, author);
       pstmt.setString(6, pub);
       pstmt.setString(7, grade);
       
       int cnt = pstmt.executeUpdate();
       System.out.println("반환값: "+ cnt);
       if(cnt>0){
          System.out.println("add 성공");
       }else{
          System.out.println("add 실패");
       }

    } catch (SQLException e) {
       e.printStackTrace();
    }finally{
       disConnection();

    }
 }
 
 // 3.회원정보 삭제 
 private void deleteBook() {

    System.out.println();
    System.out.println("삭제할 책이름을 입력하세요");
    String book = sc.nextLine();
    
    try {
       conn = getConnection();
       
       String sql = "delete from Yes24 where title = ?";
       pstmt = conn.prepareStatement(sql);
             pstmt.setString(1, book);
             
       int cnt = pstmt.executeUpdate();
       System.out.println("반환값: "+ cnt);
       if(cnt>0){
          System.out.println("delete 성공");
       }else{
          System.out.println("delete 실패");
       }
       
    } catch (SQLException e) {
       e.printStackTrace();
    }finally{
      disConnection();
    }
       
 }
 //책의 정보 전체 수정
 private void updateBook() {
	 
	 System.out.println("수정할 책의 제목을 입력하세요");
		System.out.println("수정할 책 제목 : ");
		String book = sc.nextLine();
		
		int count = getbookCount(book);
		if(count==0){
			System.out.println(book +"(은)는 없는 책입니다.");
			this.updateBook(); ;
		}
		
		System.out.println("수정할 카테고리를 입력해주세요");
		String category = sc.nextLine();
		System.out.println("수정할 책의 제목을 입력해주세요");
		String title = sc.nextLine();
		System.out.println("수정할 책의 가격을 입력해주세요");
		String price = sc.nextLine();
		System.out.println("수정할 책의 줄거리를 입력해주세요");
		String summary = sc.nextLine();
		System.out.println("수정할 책의 저자를 입력해주세요");
		String author = sc.nextLine();
		System.out.println("수정할 책의 출판사를 입력해주세요");
		String pub = sc.nextLine();
		System.out.println("수정할 책의 평점을 입력해주세요");
		String grade = sc.nextLine();
		
		try {
			conn = getConnection();
			String sql = "update Yes24 set category = ?, title = ?, price = ?, summary = ?, author = ?, pub = ?, grade = ? where title = ?";
		       pstmt = conn.prepareStatement(sql);
		       pstmt.setString(1, category);
		       pstmt.setString(2, title);
		       pstmt.setString(3, price);
		       pstmt.setString(4, summary);
		       pstmt.setString(5, author);
		       pstmt.setString(6, pub);
		       pstmt.setString(7, grade);
		       pstmt.setString(8, book);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0){
				System.out.println("책의 정보 수정 완료");
			}else{
				System.out.println("책의 정보 수정 실패");
			}
			
		} catch (SQLException e) {
			
		}finally{
			disConnection();
		}
		
	}
 


//책의 정보 선택 수정
 private void updateselectBook() {

	 System.out.println();
		System.out.println("수정할 책의 제목을 입력하세요");
		System.out.println("수정할 책 제목 : ");
		String book = sc.nextLine();
			
			int count = getbookCount(book);
			if(count==0){
				System.out.println(book +"(은)는 없는 책입니다.");
				this.updateselectBook();
			}
		int num ; // 수정할 컬럼에 대한 선택 값이 저장될 변수
		String updateField = null;
		String updateTitle = null;
		
		do{
			System.out.println();
			System.out.println("수정할 칼럼을 선택하세요.");
			System.out.println("1.category 2.title 3.price 4.summary 5.author 6.Publish 7.Grade");
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num){
			case 1: 
				updateField = "category";
				updateTitle = "카테고리";
				break;
			case 2:
				updateField = "title";
				updateTitle = "이름";
				break;
			case 3:
				updateField = "price";
				updateTitle = "가격";
				break;
			case 4:
				updateField = "summary";
				updateTitle = "줄거리";
				break;
			case 5:
				updateField = "author";
				updateTitle = "저자";
				break;
			case 6:
				updateField = "pub";
				updateTitle = "출판사";
				break;
			case 7:
				updateField = "grade";
				updateTitle = "평점";
				break;
			default : 
				System.out.println("수정할 항목을 잘못 선택했습니다.");
				System.out.println("다시 선택하세요");
				this.updateselectBook();
			}
		}while(num<1 || num>7);
		
		System.out.println("새로운 "+ updateTitle + ":");
		String updateData = sc.nextLine();
		
		try {
			conn = getConnection();
			String sql = "update Yes24 set " + updateField + "= ? where title = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updateData);
		    pstmt.setString(2, book);//입력한 book 값 =책 제목을 입력할 얘정
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0){
				System.out.println(updateTitle+ "수정 완료");
			}else{
				System.out.println(updateTitle+ "수정 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			disConnection();
		}
		
	}
 
 //6.자료 검색
   private void searchBook() {

     String searchField = null;
     int num1;
     int num2;

     do {
        System.out.println("책을 검색할 방법을 선택해 주세요.");
        System.out.println("1.카테고리 검색 2. 키워드 검색");
        System.out.print(">> ");
        num1 = sc.nextInt();
        sc.nextLine();

        switch (num1) {
        case 1:
           
              System.out.println("세부 카테고리를 선택해 주세요.");
              System.out.println("1. IT 모바일 2. 가정 살림 3. 경제 경영 4. 국어 외국어 사전 5. 만화/라이트노벨 6. 사회 정치 7. 소설/시/희곡 8. 수험서 자격증");
              System.out.println("9. 어린이 10. 에세이 11. 예술 12. 유아 13. 인문 14. 자기계발 15. 자연과학 16. 종교 17. 청소년");
              System.out.print(">> ");
              num2 = sc.nextInt();
              
              switch (num2) {
              case 1:
                 searchField = "IT 모바일";
                 break;
              case 2:
                 searchField = "가정 살림";
                 break;
              case 3:
                 searchField = "경제 경영";
                 break;
              case 4:
                 searchField = "국어 외국어 사전";
                 break;
              case 5:
                 searchField = "만화/라이트노벨";
                 break;
              case 6:
                 searchField = "사회 정치";
                 break;
              case 7:
                 searchField = "소설/시/희곡";
                 break;
              case 8:
                 searchField = "수험서 자격증";
                 break;
              case 9:
                 searchField = "어린이";
                 break;
              case 10:
                 searchField = "에세이";
                 break;
              case 11:
                 searchField = "예술";
                 break;
              case 12:
                 searchField = "유아";
                 break;
              case 13:
                 searchField = "인문";
                 break;
              case 14:
                 searchField = "자기계발";
                 break;
              case 15:
                 searchField = "자연과학";
                 break;
              case 16:
                 searchField = "종교";
                 break;
              case 17:
                 searchField = "청소년";
                 break;
              default:
                 System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
                 this.searchBook();
           }
              
           try {
        	   
               System.out.println("분류된 책의 키워드를 입력해 주세요.");
               System.out.print(">> ");
               String input0 = sc.nextLine();
               conn = getConnection();
               
//               String category = "select * from Yes24 where category = '" + searchField + "'";
               String categoryspl = "SELECT * FROM Yes24 where category = '" + searchField +"'"
               		+ " INTERSECT "
               		+ "SELECT  * FROM Yes24 where category = '%" + input0 +"%'";
               
               pstmt = conn.prepareStatement(categoryspl);
               rs = pstmt.executeQuery();
               
              while (rs.next()) {
                 System.out.println(rs.getInt("rank") + "위");
                 System.out.println("카테고리: " + rs.getString("category"));
                 System.out.println("제목: " + rs.getString("title"));
                 System.out.println("가격: " + rs.getString("price"));
                 System.out.println("줄거리: " + rs.getString("summary"));
                 System.out.println("저자: " + rs.getString("author"));
                 System.out.println("출판사: " + rs.getString("pub"));
                 System.out.println("평점: " + rs.getString("grade"));
                 System.out.println("===========================================================================================================================================================================");
              }
           
           } catch (SQLException e) {
              e.printStackTrace();
           
           }
        
           break;
           
        case 2:
           try {
              System.out.println("검색할 책의 키워드를 입력해 주세요.");
              System.out.print(">> ");
              String input = sc.nextLine();
              
              conn = getConnection();
              String sql = "select * from Yes24 where category like '%" + input + "%' or title like '%" + input + "%' or summary like '%"
                    + input + "%' or author like '%" + input + "%' or pub like '%" + input + "%'";
              pstmt = conn.prepareStatement(sql);
              rs = pstmt.executeQuery();
              
              while (rs.next()) {
                 System.out.println(rs.getInt("rank") + "위");
                 System.out.println("카테고리: " + rs.getString("category"));
                 System.out.println("제목: " + rs.getString("title"));
                 System.out.println("가격: " + rs.getString("price"));
                 System.out.println("줄거리: " + rs.getString("summary"));
                 System.out.println("저자: " + rs.getString("author"));
                 System.out.println("출판사: " + rs.getString("pub"));
                 System.out.println("평점: " + rs.getString("grade"));
                 System.out.println("===========================================================================================================================================================================");
              }
              
              sql = "select count(*) from Yes24 where category like '%" + input + "%' or title like '%" + input + "%' or summary like '%"
                    + input + "%' or author like '%" + input + "%' or pub like '%" + input + "%'";
              pstmt = conn.prepareStatement(sql);
              // 검색 결과값(개수)을 rs에 저장
              rs = pstmt.executeQuery();
              int cnt = 0;

              // rs에 저장된 데이터를 불러오기 위해 rs.next() 호출
              if (rs.next()) {
                 cnt = rs.getInt("count(*)");
              }

              if (cnt > 0) {
                 System.out.println("검색 결과: " + cnt + "건");
              } else {
                 System.out.println("검색 결과가 없습니다.");
                 
              }
           } catch (SQLException e) {
              e.printStackTrace();
           } finally {
              disConnection();
           }
        
           break;
        default:
           System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
           this.searchBook();
        }
     } while (num1 < 1 || num1 > 2);
  }
 
 
private int getbookCount(String book) {
	 
	 int count = 0;
	 try {
		 conn = getConnection();
		 String sql ="select count(*) cnt from yes24 where title = ?";
		 pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1, book);
		 
		 rs = pstmt.executeQuery();
		 
		 if(rs.next()) {
			 count = rs.getInt("cnt");
		 }
		 
	 }catch (SQLException e) {
		 count = 0;
		 e.printStackTrace();
	 }finally {
		 disConnection();
		 
	 }
	 return count;
}



}
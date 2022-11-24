package com.ezen.ex01;

import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Yes24 {
	
   public static void main(String[] args){

	   Yes24 yes = new Yes24();
	   yes.menuStart();
	   
      }
			
   public void yes24Book() {
  		
		DBBooks ddb = DBBooks.newInstance(); 
		//DBBooks의 객체를 생성하기 위해서 newInstance를 호출,
		//DBBooks의 생성자로 private를 사용하여 접근을 막아, newInstance 메서드를 통해 접근함.
		
		try
		{	int k =1;
			for(int i=1;i<=8; i++)	//i = 8페이지
			{
				Document doc = Jsoup.connect("http://www.yes24.com/24/category/bestseller?categorynumber=001&sumgb=09&pagenumber="+i).get(); 
				//월별 베스트
				Elements title = doc.select("table.list td.goodsTxtInfo p:eq(0) a:eq(0)");
//				Elements poster=doc.select("table.list td.image div a img"); //책 이미지
			    Elements Summary = doc.select("table.list td.line p.read");//줄거리
			    Elements link=doc.select("table.list td.image div a"); //책 세부설명 링크
			    Elements price = doc.select("table.list td.goodsTxtInfo p span.priceB");
			   for(int j=0;j<title.size(); j++)
			   {
				   try{
					   
					   Document doc2=Jsoup.connect("http://www.yes24.com"+title.get(j).attr("href")).get(); // 책의 상세페이지
					   
					   Element Category = doc2.select("dl.yesAlertDl ul.yesAlertLi li:eq(0) a").get(1);//책의 카테고리
					   Element Author = doc2.select("span.gd_auth").get(0);// 책 저자
					   Element Pub = doc2.select("div.tp_book span.gd_pub ").get(0);// 책 출판사
					   Element Grade =doc2.select("div.tp_book em.yes_b").get(0); // 평점
					  
					   System.out.println("순위 : "+k);
					   System.out.println("카테고리 : " + Category.text());
					   System.out.println("책제목: " + title.get(j).text());
					   System.out.println("가격 : " + price.get(j).text());
					   System.out.println("줄거리 : "+Summary.get(j).text());
					   System.out.println("책 저자 : "+ Author.text().split("정보")[0]); // 책저자의 텍스트만 추출 후 출력
					   System.out.println("출판사 : "+Pub.text()); // 출판사의 텍스트만 추출 후 출력
					   System.out.println("평점 : " + Grade.text() );
					   
					   
					   k++;
					   System.out.println("=========================================================");
				       
					   Yes24VO vo = new Yes24VO();//초기화
					   
					   //데이타 저장
					   vo.setRank(k); //순위
					   vo.setCategory(Category.text());	//카테고리
					   vo.setTitle(title.get(j).text()); //책제목
					   vo.setPrice(price.get(j).text());  //가격
					   vo.setSummary(Summary.get(j).text()); //줄거리
					   vo.setAuthor(Author.text().split("정보")[0]); // 저자.
					   vo.setPub(Pub.text()); //출판사
					   vo.setGrade(Grade.text()); //평점
					   
					
				
					   ddb.Yes24Insert(vo);
					   
				   }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
		

 

private int method() {
	System.out.println(">> 원하는 작업을 선택해 주세요. <<");
	System.out.println("0: 프로그램 종료 1.크롤링 및 데이터 저장 2. 화면 구현 실행");
	System.out.print(">> ");
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	sc.nextLine();
	
	return input;
}

public void menuStart() {
	while (true) {
		int choice = method();
		
		switch (choice) {
		case 1:
			yes24Book();
			break;
		case 2:
			DBBooks db = DBBooks.newInstance();
			db.menuBookStart();
		case 0:
			System.out.println("프로그램을 종료합니다.");
			return;
		}
	}
}
}
package com.ezen.ex01;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Yes24 {

	List<Yes24>list = new ArrayList<Yes24>();
   public static void main(String[] args){
   
      Yes24 ys = new Yes24();
      ys.yes24Best();
      }
   

  
	
//	public void Yes24Show() {
//		System.out.println("정보 출력-----------------");
//		for(Yes24VO yes : list) {
//			System.out.println("순위 : " + yes.getRank());
//			System.out.println("카테고리 : " + yes.getCategory());
//			System.out.println("책이름 : " + yes.getTitle());
//			System.out.println("저자 : " + yes.getAuthor());
//			System.out.println("출판사 : " + yes.getPub());
//			System.out.println("가격 : " + yes.getPrice());
//			System.out.println("줄거리 : " + yes.getSummary());
//			System.out.println("평점 : " + yes.getGrade());
//			System.out.println("-------------------------------");
//		}
			
	
   public void yes24Best() {
	      
//	      int rank; //순위
//	      String category; //카테고리 
//	      String title; //책이름
//	      String author; //저자
//	      String pub; //출판사
//	      String price;  //가격
//	      String summary;  //줄거리
//	      double grade;  //평점
	      
  		
		Yes24DAO dao = Yes24DAO.newInstance();
		
		try
		{	int k =1;
			for(int i=1;i<=1;i++)
			{
				Document doc = Jsoup.connect("http://www.yes24.com/24/category/bestseller?categorynumber=001&sumgb=09&pagenumber="+i).get(); 
				//월별 베스트
				Elements title = doc.select("table.list td.goodsTxtInfo p:eq(0) a:eq(0)");
//				Elements poster=doc.select("table.list td.image div a img"); //책 이미지
			    Elements link=doc.select("table.list td.image div a"); //책 세부설명 링크
			   for(int j=0;j<title.size(); j++)
			   {
				   try{
					   System.out.println("순위: "+k);
					   System.out.print("책제목: " + title.get(j).text());
					   
//					   System.out.println(poster);	//책 이미지
					   
					   Document doc2=Jsoup.connect("http://www.yes24.com"+link.get(j).attr("href")).get(); // 책의 상세페이지
//					   System.out.println(doc2);			   
					   
//					   Elements Author = doc.select("table.list td.goodsTxtInfo div.aupu a");// 책 저자
//					   System.out.println("책 저자:"+ Author.get(j).text()); // 책저자의 텍스트만 추출 후 출력
					   
					   Element Author = doc2.select("div.tp_book span.gd_auth ").get(0);// 책 저자
					   System.out.println("책 저자:"+ Author.text()); // 책저자의 텍스트만 추출 후 출력
					   
					   Elements price = doc.select("table.list td.goodsTxtInfo p span.priceB");
					   System.out.println("가격 : " + price.get(j).text());
					   
//					   Elements Pub = doc.select("table.list td.goodsTxtInfo div.aupu a");//책출판사
					   Element Pub = doc2.select("div.tp_book span.gd_pub ").get(0);// 책 출판사
					   System.out.println("출판사: "+Pub.text()); // 출판사의 텍스트만 추출 후 출력
					   
					   Elements Summary = doc.select("table.list td.line p.read");//줄거리
					   System.out.println(Summary.get(j).text());
					   
					   Element Grade =doc2.select("div.tp_book em.yes_b").get(0); // 평점
					   System.out.println("평점 : " + Grade.text() );
					   System.out.println("=========================================================");
				       
//					   Yes24VO yes = new Yes24VO();
//					   //데이타 저장
//					   yes.setRank(k); //순위
//					   yes.setTitle(title.text()); //책제목
//					   yes.setAuthor(Author.text()); // 저자.
//					   yes.setPrice(price.text());  //가격
//					   yes.setPub(Pub.text()); //출판사
//					   yes.setSummary(Summary.text()); //줄거리
//					   yes.setGrade(Grade.text()); //평점
//					   
//					
//					dao.Yes24Insert(yes);
					   
					   
					   k++;
				   }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
		
}
 

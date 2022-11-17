package com.ezen.ex01;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class KyoboBooks {

	List<KyoboBooks>list = new ArrayList<KyoboBooks>();
   public static void main(String[] args){
   
      KyoboBooks kb = new KyoboBooks();
      kb.KyoboBook();
      }
   

  
	
//	public void seoulLocationShow() {
//		System.out.println("정보 출력-----------------");
//		for(KyoboBooksVO sl : list) {
//			System.out.println("순위 : " + sl.getRank());
//			System.out.println("카테고리 : " + sl.getCategory());
//			System.out.println("책이름 : " + sl.getTitle());
//			System.out.println("저자 : " + sl.getAuthor());
//			System.out.println("출판사 : " + sl.getPub());
//			System.out.println("가격 : " + sl.getPrice());
//			System.out.println("줄거리 : " + sl.getSummary());
//			System.out.println("평점 : " + sl.getGrade());
//			System.out.println("-------------------------------");
//		}
//			
//	}
   public void KyoboBook() {
	      
	      int rank; //순위
	      String category; //카테고리 
	      String title; //책이름
	      String author; //저자
	      String pub; //출판사
	      String price;  //가격
	      String summary;  //줄거리
	      double grade;  //평점
	      
		
		DBBooks dao = DBBooks.newInstance();
		
		try
		{	int k =1;
			for(int i=1;i<=1;i++)
			{
			   Document doc=Jsoup.connect("https://product.kyobobook.co.kr/bestseller/total?period=004").get(); //교보문고 연간베스트 목록 페이지
			   Elements poster=doc.select("ol.nth-child(1) li.nth-child(1) div.prod_area.horizontal div.prod_thumb_box.size_lg a span.img_box img"); //책 이미지
			   Elements link=doc.select("ol.nth-child(1) li.nth-child(1) div.prod_area.horizontal div.prod_thumb_box.size_lg a"); //책 세부설명 링크
			   for(int j=0;j<poster.size();j++)
			   {
				   try{
					   System.out.println("순위:"+k);
					   
					   Document doc2=Jsoup.connect("https://www.kyobobook.co.kr"+link.get(j).attr("href")).get();// 책의 상세페이지
					  
					   Elements Title = doc2.select("div.prod_info_box a span");
					   System.out.println("책 이름: " + Title.text());//책이름
					   
					   Element Author =doc2.select("div.author a").get(k); // 책 저자
					   Element Pub =doc2.select("div.prod_info_text a").get(k); // 책 출판사
					   System.out.println("책 저자:"+ Author.text()); // 책저자의 텍스트만 추출 후 출력
					   System.out.println("출판사: "+ Pub.text()); // 출판사의 텍스트만 추출 후 출력
					   
					   Element Price = doc2.select("div.prod_price span.price").get(k); // 가격
					   System.out.println("가격 : " + Price.text());
					   
					   
					   Elements Summary = doc2.select("div.prod_price p");
					   System.out.print(Summary.text()); //책의 간략한 줄거리
					   Element Grade =doc2.select("div.prod_price span.price").get(k); // 평점
					   System.out.println("평점 : " + Grade.text() );
					   System.out.println("=========================================================");
				       
					   KyoboBooksVO sl = new KyoboBooksVO();
					   //데이타 저장
					   sl.setRank(k); //순위
					   sl.setTitle(Title.text()); //책제목
					   sl.setAuthor(Author.text()); // 저자.
					   sl.setPrice(Price.text());  //가격
					   sl.setPub(Pub.text()); //출판사
					   sl.setSummary(Summary.text()); //줄거리
					   sl.setGrade(Grade.text()); //평점
					   
					
					dao.KyoboBooksInsert(sl);
					   
					   
					   k++;
				   }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
		
}
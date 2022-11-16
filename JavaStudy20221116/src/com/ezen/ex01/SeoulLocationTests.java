package com.ezen.ex01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SeoulLocationTests {

	public static void main(String[] args){

		SeoulLocationTests se = new SeoulLocationTests();
//		se.seoulLocation();
		se.seoulNature();
	}
	
	public void seoulLocation() {
		
		try
		{
			int k=1;
			for(int i=1;i<=2;i++)
			{
			   Document doc=Jsoup.connect("https://korean.visitseoul.net/attractions?curPage="+i).get(); //명소 목록 페이지
			   Elements poster=doc.select("ul.article-list li.item div.thumb"); //썸네일 이미지
			   Elements comment=doc.select("ul.article-list li.item div.infor-element span.text-dot-d"); //썸네일 장소 설명
			   Elements link=doc.select("ul.article-list li.item a"); // 썸네일 장소 세부설명 링크
			   Elements title=doc.select("ul.article-list li.item div.infor-element span.title"); //썸네일 장소 이름
			   for(int j=0;j<poster.size();j++)
			   {
				   try{
					   System.out.println("번호:"+k);
					   System.out.println(title.get(j).text()); //title의 텍스트만 추출 후 출력
					   System.out.println(poster.get(j).attr("style")); // poster style의 속성값을 반환
					   System.out.println(comment.get(j).text()); //장소를 설명하는 부분의 텍스트만 추출 후 출력
					   System.out.println(link.get(j).attr("href")); // link의 url을 반환 후 출력
					   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get();// 사진속 장소의 상세페이지
					   Element address=doc2.select("div.detail-map-infor:eq(1) dl dd").get(0); // 사진 속 장소의 주소 및 교통정보
					   System.out.println("주소:"+address.text()); // 주소 및 교통정보의 텍스트만 추출 후 출력
					   System.out.println("=========================================================");
				       
					   k++;
				   }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
	
	
	public void seoulNature()
	{
		try
		{
			int k=1;
			for(int i=1;i<=14;i++)
			{
			   Document doc=Jsoup.connect("https://korean.visitseoul.net/nature?curPage="+i).get();
			   
			   Elements poster=doc.select("ul.article-list li.item div.thumb");
			   Elements comment=doc.select("ul.article-list li.item div.infor-element span.text-dot-d");
			   Elements link=doc.select("ul.article-list li.item a");
			   Elements title=doc.select("ul.article-list li.item div.infor-element span.title");
			   for(int j=0;j<poster.size();j++)
			   {
				  try
				  {
				   System.out.println("번호:"+k);
				   System.out.println(title.get(j).text());
				   System.out.println(poster.get(j).attr("style"));
				   System.out.println(comment.get(j).text());
				   System.out.println(link.get(j).attr("href"));
				   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get();
				   Element address=doc2.select("div.detail-map-infor:eq(1) dl dd").get(0);
				   System.out.println("주소:"+address.text());
				   System.out.println("=========================================================");
				   k++;
				  }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
}
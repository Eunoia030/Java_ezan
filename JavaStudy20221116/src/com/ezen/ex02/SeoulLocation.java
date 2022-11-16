package com.ezen.ex02;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.SliderUI;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SeoulLocation {
	
	List<SeoulLocation> list = new ArrayList<SeoulLocation>();
	
	public static void main(String[] args){

		SeoulLocation se = new SeoulLocation();
		se.seoulLocation();
//		se.seoulNature();
	}
	
	public void seoulLocation() {
		
		SeoulLocationVO sl =  new SeoulLocationVO();
		
		try
		{
			int k=1;
			for(int i=1;i<=5;i++)	// i = 페이지수 
			{
			   Document doc=Jsoup.connect("https://korean.visitseoul.net/attractions?curPage="+i).get(); //명소 목록 페이지	//i를 더한 이유? 각페이지를 넘길때 주소값옆에 +1된다.(첫페이지에는 따로 1이 안써있으나 두번째 페이지부터는 2로 시작 쭉 플러스된다)
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
					   Element telInfo=doc2.select("div.detail-map-infor:eq(0) dl dd").get(0); // 사진 속 장소의 주소 및 교통정보
					   System.out.println("주소:"+address.text()); // 주소 및 교통정보의 텍스트만 추출 후 출력
					   System.out.println("전화:"+telInfo.text()); // 주소 및 교통정보의 텍스트만 추출 후 출력
					   
					   Elements Info=doc2.select("div.border dl:eq(4) dd"); // 이용시간
					   System.out.println("이용시간 : " + Info.text());
					   
//					   Element traffics =doc2.select("div.detail-map-infor").get(1); // 이용시간
//					   String traffic = traffics.text().substring(traffics.text().lastIndexOf("교통 정보")+5);
//					   System.out.println("교통정보 : " +  traffic  );
					   Element traffic=doc2.select("div.detail-map-infor:eq(1) dl dd").get(1); // 사진 속 장소의 주소 및 교통정보
					   System.out.println("교통정보 : " +  traffic.text());
					   System.out.println("=========================================================");
				       
					   //데이터를 저장
					   sl.setNo(k); //번호
			
					   
					   
					   
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

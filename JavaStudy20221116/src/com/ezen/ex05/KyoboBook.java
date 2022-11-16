package com.ezen.ex05;
/*
 * 
 * */
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
create table SeoulLcation(
no NUMBER(4) PRIMARY KEY,
title NVARCHAR2(20),
titleInfo NVARCHAR2(200),
address NVARCHAR2(50),
phone NVARCHAR2(20),
info NVARCHAR2(100),
traffic NVARCHAR2(200)
);  */
public class KyoboBook {

	List<KyoboBookVO> list = new ArrayList<>();
	
	
	public static void main(String[] args){

		KyoboBook se = new KyoboBook();
		se.seoulLocation();
//		se.seoulNature();
		
		se.SeoulLocationShow();
	}
	
	public void SeoulLocationShow() {
		System.out.println("----------------------베스트 셀러----------------------");
		for(KyoboBookVO sl : list) {
			System.out.println("번호 : " + sl.getNo());
			System.out.println("장소 : " + sl.getTitle());
			System.out.println("장소정보 : " + sl.getTitleInof());
			System.out.println("전화 : " + sl.getPhone());
			System.out.println("이용시간 : " + sl.getInfoTime());
			System.out.println("교통정보 : " + sl.getTaffic());
			System.out.println("-------------------------------");
		}
			
	}
	
	public void seoulLocation() {
		
		DataDAO dao = DataDAO.newInstance();
		
		
		try
		{
			int k=1;
			for(int i=1; i<=1; i++)
			{
			   Document doc=Jsoup.connect("https://product.kyobobook.co.kr/bestseller/total?period=004").get(); // 년간 베스트셀러 목록 페이지
			   Elements Kategorie=doc.select("");//베스트셀러 카테고리
			   Elements poster=doc.select("ol.prod_list li.prod_item div.prod_area div.prod_thumb_box a.prod_link span.img_box"); //책이미지
			   Elements comment=doc.select("ol.prod_list li.prod_item div.prod_area div.prod_area div.prod_info_box p"); //책 줄거리
			   Elements link=doc.select("ol.prod_list li.prod_item div.prod_area div.prod_area div.prod_info_box a"); // 베스트셀러 책의 세부설명 링크
			   Elements title=doc.select("ul.article-list li.item div.infor-element span.title"); //책 가격 (할인가 : span.prod_price span.val   // 정가 : span.price_normal) 
			   for(int j=0;j<poster.size();j++)
			   {
				   try{
					   System.out.println("번호:"+k);
					   System.out.println(title.get(j).text()); //title의 텍스트만 추출 후 출력
					//   System.out.println(poster.get(j).attr("style")); // poster style의 속성값을 반환
					   System.out.println(comment.get(j).text()); //장소를 설명하는 부분의 텍스트만 추출 후 출력
					  // System.out.println(link.get(j).attr("href")); // link의 url을 반환 후 출력
					   Document doc2=Jsoup.connect("https://korean.visitseoul.net"+link.get(j).attr("href")).get();// 사진속 장소의 상세페이지

					   Element address=doc2.select("div.detail-map-infor:eq(1) dl dd").get(0); // 사진 속 장소의 주소 및 교통정보
					   Element telInfo=doc2.select("div.detail-map-infor:eq(0) dl dd").get(0); // 사진 속 장소의 주소 및 교통정보
					   System.out.println("주소:"+address.text()); // 주소 및 교통정보의 텍스트만 추출 후 출력
					   System.out.println("전화:"+telInfo.text()); // 주소 및 교통정보의 텍스트만 추출 후 출력
					   
					   Elements Info=doc2.select("div.border dl:eq(4) dd"); // 이용시간
					   System.out.println("이용시간 : " + Info.text());
					   
					   Element traffics =doc2.select("div.detail-map-infor").get(1); // 이용시간
					   String traffic = traffics.text().substring(traffics.text().lastIndexOf("교통 정보")+5);
					   System.out.println("교통정보 : " +  traffic  );
					   System.out.println("=========================================================");
				       
					   KyoboBookVO sl = new KyoboBookVO();
					   //데이타 저장
					   sl.setNo(k); //번호
					   sl.setTitle(title.get(j).text()); //title
					   sl.setTitleInof(comment.get(j).text()); // 설명란.
					   sl.setAddress(address.text());  //주소
					   sl.setInfoTime(Info.text()); //이용시간
					   sl.setPhone(telInfo.text()); //전화번호
					   sl.setTaffic(traffic); //교통 정보
					   
//					   list.add(sl);
					   
					   dao.seoulLocationInsert(sl);
					   
					   
					   
					   k++;
				   }catch(Exception ex) {}
			   }
			}
		}catch(Exception ex){}
	}
	
	
	
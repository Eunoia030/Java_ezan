package com.ezen.ex02;

public class SeoulLocationVO {
   
   private int no; //번호
   private String name; //명소 이름
   private String comment; //명소 설명
   private String address; //명소 주소
   private String tel; // 명소 전화번호
   private String time; // 명소 이용시간
   private String traffic; // 명소 교통정보
   
   public SeoulLocationVO() {
      
   }
   
   public int getNo() {
      return no;
   }
   public void setNo(int no) {
      this.no = no;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getComment() {
      return comment;
   }
   public void setComment(String comment) {
      this.comment = comment;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getTel() {
      return tel;
   }
   public void setTel(String tel) {
      this.tel = tel;
   }
   public String getTime() {
      return time;
   }
   public void setTime(String time) {
      this.time = time;
   }
   public String getTraffic() {
      return traffic;
   }
   public void setTraffic(String traffic) {
      this.traffic = traffic;
   }
   
   
   
}

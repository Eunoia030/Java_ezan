package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
NUM        NOT NULL NUMBER(5)       
CATEGORY            NVARCHAR2(1000) 
TITLE               NVARCHAR2(1000) 
PRICE               NVARCHAR2(20)   
SUMMARY             VARCHAR2(4000)  
AUTHOR              NVARCHAR2(1000) 
PUB                 NVARCHAR2(1000) 
GRADE               NVARCHAR2(10)   
PICTUREURL          VARCHAR2(3000)
 */

@Getter
@Setter
@ToString
public class BookVO {
	private int num;
	private String category;
	private String title;
	private String price;
	private String summary;
	private String author;
	private String pub;
	private String grade;
	private String pictureurl;
}

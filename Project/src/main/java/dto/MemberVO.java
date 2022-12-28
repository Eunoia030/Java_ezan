package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
ID    NOT NULL VARCHAR2(20) 
PASS  NOT NULL VARCHAR2(20) 
NAME           VARCHAR2(10) 
PHONE          VARCHAR2(13) 
EMAIL          VARCHAR2(30) 
LEV            CHAR(1)
 */

@Getter
@Setter
@ToString
public class MemberVO {
	private String id;
	private String pass;
	private String name;
	private String phone;
	private String email;
	private String lev;
}

CREATE TABLE Book (
 NUM NUMBER(5) PRIMARY KEY, 
 Category NVARCHAR2(1000),
 Title NVARCHAR2(1000), 
 Price NVARCHAR2(20), 
 Summary VARCHAR2(4000),
 Author NVARCHAR2(1000), 
 Pub NVARCHAR2(1000),
 Grade NVARCHAR2(10)
);

CREATE SEQUENCE Book_seq
INCREMENT BY 1
START WITH 1;

SELECT * FROM Book;

DESC Book;

CREATE TABLE MEMBER (
ID VARCHAR2(20) PRIMARY KEY,
PASS VARCHAR2(20) NOT NULL,
NAME VARCHAR2(10),
PHONE VARCHAR2(13),
EMAIL VARCHAR2(30),
LEV CHAR(1) DEFAULT 'B' -- A: 관리자, B: 일반회원
);

DESC MEMBER;

INSERT INTO MEMBER VALUES('admin', '1234', '관리자', '010-1111-1111', 'admin@naver.com', 'A');

SELECT * FROM MEMBER;
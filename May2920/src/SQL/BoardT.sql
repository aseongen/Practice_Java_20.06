-- 오라클 다루는 쿼리문의 한줄 주석문기호 
/* 한줄 이상 주석문 기호
 */
--boardT 테이블 생성
create table boardT3 (

--b_no 는 컬럼명(필드명), number(38)은 오라클 자료형으로 정수숫자값을 최대 38자까지 저장 가능함
--primary key는 기본키 제약조건으로 b_no 컬럼에 중복번호 저장금지,null 저장금지
--제약조건이란?) 해당 필드 즉 컬럼에 자료 저장시 제한을 가하는 것을 말한다.
b_no number(38) primary key --int

--varchar2가변문자 오라클 자료형, not null 제약조건은 null 저장금지 
--not null : 공백 허용안함 
--varchar : 가변적 문자이기때문에, 작성한 만큼만 공간을 차지한다. 
,b_name varchar2(50) not null  --string
,b_title varchar2(200) not null-- 게시판 제목 , string
,b_count varchar2(4000) -- 게시판 내용 --string
,b_date date -- date는 오라클 날짜 자료형 --string : 시간,분,초 다나옴
);


create table guestbook(
g_no number(38) primary Key
,g_name varchar2(50) not null
,g_title varchar2(200) not null
,g_cont varchar2(4000) not null
,g_date date 
);

select * from guestbook order by g_no desc;

--boardT 테이블의 전체 컬럼 목록을 검색 
--order by는 정렬문이다.
--b_no 컬럼 레코드 번호값을 기준으로 내림차순 정렬(desc: 생략불가),*(전체컬럼 목록)을 검색하는 쿼리문이다.

--select : 전체를 조회
select * from boardT order by b_no desc;

/* 오라클 시퀀스란 ?)
 *  : 시퀀스는 번호 발생기 오라클 객체이다. 
 *  : 중복번호가 없고, 1부터 1씩 증가되는 번호가 발생한다.
 *  : 주로 게시판, 자료실 번호값 저장 용도로 활용된다. 
 *  : primary key 즉 기본키 제약 조건 , 정수 자료형 타입으로 선언된 컬럼 레코드 값으로 시퀀스를 활용한다. 
 *  : b_no 중간 번호를 삭제하고 다시 입력을 하면 빈공간이 아닌 다음 번호로 부여가 된다. 
 */

-- b_no_seq라는 시퀀스를 생성
create sequence b_no_seq
start with 1 -- 1부터 시작 옵션
increment by 1 --1씩 증가
nocache; --임시 저장 장소를 사용하지 않겠다는 뜻

--시퀀스 번호값 확인
-- 시퀀스명.nextval 은 시퀀스의 다음 번호값을 확인
-- dual 테이블은 오라클 설치시 설치되는 임시테이블로 오라클 함수, 시퀀스 번호값, 연산 결과값 확인 용도로 많이 사용된다.
select b_no_seq.nextval from dual ;

--boardT 테이블 레코드 저장문법
/* 형식)
 * insert into boardT (컬럼목록) values(값목록);
 * 컬럼 목록을 생략할 경우 테이블 생성되는 컬럼 순서대로 전체컬럼에 자료가 저장된다. 
 * 레코드란 컬럼에  저장된 한해의 자료 집합을 뜻한다
 */

--sysdate는 오라클 날짜 함수, 쿼리문에서 문자열 자료를 자바와 다르게 작은따옴표(' ')로 처리한다. 
insert into boardT values(b_no_seq.nextval, '  홍길동','제목01','내용01',sysdate);

--번호값을 기준으로 내림차순 정렬(desc: 큰 숫자 번호부터 먼저 정렬)
select * from boardT order by b_no desc;

/* 레코드 수정 문법)
 * update 테이블명 set 컬럼명 = 변경값,... where 조건식;
 * 주의할점은 where 조건식을 생략하면 전체 행 레코드 해당 컬럼값이 수정되니 꼭 조건식을 지정해서 수정해야한다. 
 */

update boardT set b_name= '수정홍길동', b_title ='수정제목'
where b_no =3;  --b_n=3 번을 수정함.

/* 레코드 삭제문)
 * delete from 테이블명 where 조건식;
 * : 주의할점은 조건식을 생략하면 전체형 레코드가 삭제된다. 
 * : 그러므로 꼭 조건식을 지정해서 원하는 레코드만 삭제해야한다.
 */

delete from BOARDT where b_no=2; --2번 레코드만 삭제
select * from BOARDT; --전체 컬럼 목록을 검색 

--sysdate 오라클 날짜함수 값 확인
select sysdate from dual;

/* 문제) 번호값, 신사임당, 제목10, 내용10, sysdate 오라클 날짜 함수를 활용해서 1개 레코드 행을 저장시켜보자 
 * 시퀀스 번호값 , 세종대왕, 제목 11, 내용11 sysdate로 두번째 레코드값도 저장 
 */
insert into boardT values (b_no_seq.nextval, '신사임당', '제목10', '내용10', sysdate);
insert into boardT values (b_no_seq.nextval, '세종대왕', '제목11', '내용11', sysdate);
select * from boardT order by b_no asc; --오름차순

--삭제기능 b_no5번째
delete from boardT where b_no=5;

/* 문제) 번호를 기준으로 내림차순 정렬  */
select * from BOARDT order by b_no desc;

--번호,이름,제목만 검색
select b_no,b_title From BOARDT;

--4번 레코드만 검색
select * from boardT where B_no=4;

select * from boardT order by b_no desc;

--삭제 
delete from boardT where b_no=6;



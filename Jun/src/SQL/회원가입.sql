create table gbl_member(
g_id varchar2 (38) primary key
, g_name varchar2 (200) not null
, g_pwd varchar2 (200) not null
, g_date date
);
drop table gbl_member;

select *from gbl_member ;
--날짜 생성
select sysdate from dual;
select *from gbl_member where g_id='smith' and g_pwd='나빳어';
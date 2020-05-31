/*  그룹함수 종류)
 * 1. SUM(합계), AVG(평균), COUNT(레코드 개수), 
 *    MAX(최대값),MIN(최소값),STDEV(표준편차), VARIANCE(분산)
 */

--실습. emp02 테이블 생성
create table emp02(
dept_no number(38) --부서 번호
,ename varchar2(20)-- 사원명
,sal int --월급
,comm number(38) --보너스
,job varchar2(20) --업무부서
);

insert into emp02 values(10,'scott',1000,100,'salessman');
insert into emp02 values(10,'tiger',1500,150,'salessman');
insert into emp02 (dept_no,ename,sal,job)values(20,'james',2000,'manager');
insert into emp02 (dept_no,ename,sal,job)values(20,'king',2500,'manager');

select *from emp02 order by dept_no asc;
 
--전체 사원의 급여합
select sum(sal) from emp02;

--보너스 합
select sum(comm) from emp02;

--그룹 함수를 사용하면 comm필드에서 null을 제외하고 총합을 구한다. 
select avg(sal) from emp02;
select max(sal), min(sal) from emp02;

select count(comm) as "보너스를 받은 사원 수" from emp02;
select count(*) as "전체 사원 수 " from emp02;
select count(job) as "업무 수" from emp02;

--distinct 키워드는 중복 업무수를 제거한다.
select count(distinct job) as "중복 업무수를 제외한 업무수" from emp02;

--부서별로 그룹화 시켜서 부서별 급여 평균
select dept_no, avg(sal) from emp02 group by dept_no;

select dept_no, sum(sal), avg(sal) from emp02 group by dept_no; --부서별 급여합과 평균
select dept_no, max(sal), min(sal) from emp02 group by dept_no; --부서별 최대 최소급여합
select dept_no, count(*), count(comm) from emp02 group by dept_no; --부서별 사원수와 보너스를 받는 사원 수

--부서별 급여 평균이 2000이상인 경우 부서번호, 부서별 급여 평균을 구함
select dept_no, avg(sal) from emp02 group by dept_no having avg(sal) >= 2000;

select dept_no, max(sal), min(sal) from emp02 group by dept_no having max(sal) > 2000; --부서별

create table tbl_guest (
 g_no number(38) primary key
, g_name varchar2(50) not null
, g_title varchar2(200) not null
, g_pwd varchar2(20) not null
, g_cont varchar2(4000) not null
, g_date date
);
select *from tbl_guest ;

create sequence g_no_seq
start with 1 
increment by 1 
nocache; 

select g_no_seq.nextval from dual ;

select * from tbl_guest order by g_no desc;

select sysdate from dual;


create table tbl_guest2 (
 t_no number(38) primary key
, t_name varchar2(50) not null
, t_title varchar2(200) not null
, t_pwd varchar2(20) not null
, t_cont varchar2(4000) not null
, t_date date
);
create sequence t_no_seq2
start with 1 
increment by 1 
nocache;

select t_no_seq2.nextval from dual ;

select * from tbl_guest2 order by t_no desc;

select sysdate from dual;


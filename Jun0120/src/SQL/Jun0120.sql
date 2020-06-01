create table jun{
nno number (35)primary key
,name varchar2(70) null key
,title varchar2 (200) null key
,cont varchar2(2000) 
);

select *from jun ordr by nno desc;

create sqeuence nno seqp
start with 1
increment by 1
nocache;

select nno.nextval from dual;

insert into jun order by nno desc;
create database myDtb;

use myDtb;

Drop table semp;

create table SEMP(EMPNO CHAR(4), EMPNAME CHAR(20), BASIC FLOAT(9,2), DEPTNO CHAR(2),DEPTHEAD CHAR(4));

create table SDEPT (DEPTNO CHAR(2), DEPTNAME CHAR(15));

insert into SDEPT (DEPTNO,DEPTNAME)
values(10, 'Development');

insert into SDEPT (DEPTNO,DEPTNAME)
values(20, 'Traning');


delete from SDEPT where DEPTNO=20;
select * from SDEPT;

insert into SEMP(EMPNO, EMPNAME, BASIC, DEPTNO)
values('0001','SUNIL',6000,'10');
insert into SEMP(EMPNO, EMPNAME, BASIC, DEPTNO)
values('0002','HIREN',8000,'20');
insert into SEMP(EMPNO, EMPNAME, BASIC, DEPTNO,DEPTHEAD)
values('0003','ALI',4000,'10','0001');
insert into SEMP(EMPNO, EMPNAME, BASIC, DEPTNO,DEPTHEAD)
values('0004','GEORGE',6000, null,'0002');

select * from SEMP;
create table S(`S#` CHAR(4),Sname VARCHAR(10),Status VARCHAR(10)
,City VARCHAR(10));
create table P(`P#` CHAR(4), Pname CHAR(10),Colour CHAR(10),Weight CHAR(10), City CHAR(10));
create table J(`j#` CHAR(4),City VARCHAR(10));
insert into S(`S#`)values('S3');
insert into J(`J#`)values('J3');

select * from S;

create table S(`S#` char(10),Sname char(10), Status char(10),City char(10));

insert into S(`S#`, Sname, Status, City)
values('S1','Roger','10','Thane'),('S2','Teja','20','London'),('S3','Seminam','30','Ulhasnagar');

create table P(`P#` char(10),Pname char(10), Colour char(10),Weight int,City char(10));

insert into P(`P#`,Pname,Colour,Weight,City)
values('P1','Breaks','Black',1,'Tokyo'),
	  ('P2','Disk','Silver',3,'Japan'),
      ('P3','Clutch','Red',4,'India');

create table J(`J#` char(10),Jname char(10),City char(10));

insert into J(`J#`,Jname,City)
values('J1','PROJECT 1','Tokyo'),
	  ('J2','PROJECT 2','Japan'),
      ('J3','PROJECT 3','India');

create table SPJ(`S#` char(10),`P#` char(10),`J#`char(10), Qty INT(10));

select * from P;
select `S#`,Sname from S;
select Sname from S where City='London';
select Sname from S where City='London' or City ='Paris';

update S set City='Paris' where City='Ulhasnagar';
select * from P;
select Pname ,Colour from P where City='London';
select * from S where City='London';
select * from S where City='Paris' or City= 'London';

select * from J;
update  J set City='Athens' where City ='Japan';
select * from J where City='Athens';
select * from P where weight between 1 and 4;
select Sname, Status from S where Status>=20;
Select Sname,City from S where City!='London';
Select City from S; 
select Weight "GRAMS",Weight"MILLIGRAMS", Weight "KILOGRAMS" from P; 














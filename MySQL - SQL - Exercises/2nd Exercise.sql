use myDtb;

select * from S order by Sname desc;
select * from S order by City desc;
select * from P order by City asc, Pname asc;
select Sname, status from S where Status between 10 and 20;
select Pname ,Weight from P Where weight not between 1 and 3;
select * from P where Pname like 'D%'; 
select * from S where City like 'L%';
update J set Jname='Skynet' where Jname='PROJECT 2';
select * from J where Jname like '___n%';

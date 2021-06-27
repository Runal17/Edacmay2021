use myDtb;
select * from S;
select * from P;
select * from J;

select Sname,min(Status) from S;

select Pname,max(Weight) from P;

select avg(Weight) from P;

select * from sdept;
select * from semp;
select * from spj;
select count(*) from S;
select count(Jname),Jname,City from J group by Jname;
select Sname "Suppliers" ,count(Sname) "Suppliers Count" ,Status from S group by Sname;
select Jname,count(Jname) "Count",City from J group by City order by City;

Select count(*)-count(Status) "Difference" from S;
select 
case 
When status=10 then 'Ten'
when status=20 then 'Twenty'
when status=30 then 'Thirty'
else 'Zero'
end "Status",count(Sname) "Count"
from S group by Status;
use myDtb;

select upper(Sname) from S;
select lower(Sname) from S;
select concat(upper(substr(Sname,1,1)),lower(substr(Sname,2)))from S;
select lpad(Sname,25,' ') from S;
select *, replace(Sname,'e','ro') from S;


select Sname,length(Sname) "Length" from S; 
select soundex('Eminam');
 select *,case
 when Sname then 'Ten'
 when Status then 'Twenty'
 else 'Thirty'
 end "CASE SWITCH" 
 from S;
 
 select Sname ,
case
when status=10 then 'Ten'
when status =20 then 'Twenty'
when status =30 then 'Thirty'
end "status"
from S;


select dayname(Curdate());
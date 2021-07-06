use assignments;

-- . Write a program that computes the perimeter and the area of a rectangle. Define 
-- your own values for the length and width. (Assuming that L and W are the length 
-- and width of the rectangle, Perimeter = 2*(L+W) and Area = L*W.

create table temp (first varchar(20),second float);

truncate table temp;
drop procedure ex1;
delimiter //
create procedure ex1(a float, b float)
begin
	declare l float;
    declare w float;
    declare area float;
    declare peri float;
    set l=a;
    set w=b;
    set peri=2*(l+w);
    set area =(L*W);
    insert into temp values('area',area),
						   ('peri',peri);
    
    end; //
delimiter ;
call ex1(6,5);
select * from temp;

-- 2. Write a program that declares an integer variable called num, assigns a value to it, 
-- and computes and inserts into the tempp table the value of the variable itself, its 
-- square, and its cube.

truncate table temp;
drop procedure ex2;
delimiter //
create procedure ex2(i int)
begin
    declare s int ;
    declare c int;
    set s=i*i;
    set c=i*i*i;
    insert into temp values('Square',s),('Cube',c);
end; //
delimiter ;

call ex2(5);
select * from temp;

-- 3. Convert a temperature in Fahrenheit (F) to its equivalent in Celsius (C) and vice 
-- versa. The required formulae are:- C= (F-32)*5/9 
-- F= 9/5*C + 32

truncate table temp;
drop procedure ex3;
delimiter //
create procedure ex3(a float,b float)
begin
	declare f float;
	declare c float;
    declare ans float;
    set c=((a-32)*5/9);
    set f=(9/5*b+32);
    insert into temp values('Celsius',c),('Fahrenheit',f);
end;//
delimiter ;

call ex3(90,32);
select * from temp;

-- 4.Convert a number of inches into yards, feet, and inches. For example, 124 inches 
-- equals 3 yards, 1 foot, and 4 inches. 


truncate temp;
drop procedure ex4;
delimiter //
create procedure ex4(inch float)
 begin 
	declare yard float;
    declare feet float;
    declare foot float;
	set feet  = inch/12;
    set yard = feet/3;
    set foot = mod(feet,3);
	set inch = mod(inch,12);
    insert into temp values 
    (floor(yard),'yards'),(floor(foot),'foot');-- (floor(inch),'inches');
 end; //
 delimiter ;

call ex4(124);
select * from temp;


-- 5. Write a program that enables a user to input an integer. The program should then 
-- state whether the integer is evenly divisible by 5. 

truncate temp;
drop procedure ex5;
delimiter //
create procedure ex5(j int)
begin
		
        if (mod(j,5)=0) then
             insert into temp values('Divisible',j);
		else
             insert into temp values('Not Devisible',j);
        end if;    
end; //
delimiter ;

call ex5(14);
select * from temp;

-- 6. Your block should read in two real numbers and tell 
-- whether the product of the two 
-- numbers is equal to or greater than 100.



truncate table temp;
drop procedure ex6;

delimiter //
create procedure ex6(a float,b float)

begin
declare q float;
	if a*b=100 then
    insert into temp values('Equal',q);
    else
    insert into temp values('Greater than 100',q);
    end if;
end ; //
delimiter ;

call ex6(50,2);
select * from temp;




CREATE TABLE student(
    RollNo number(6),
    Name varchar(15),
    City varchar(12),
    Pincode varchar(8),
    Age number(2)
);




Insert into student(RollNo,Name,City,Pincode,Age)values(1,'Amit','Delhi','214213',21);
Insert into student(RollNo,Name,City,Pincode,Age)values(2,'Kumar','Bombay',NULL,25);
Insert into student(RollNo,Name,City,Pincode,Age)values(3,'Kshitij','Madras','110101',16);
Insert into student(RollNo,Name,City,Pincode,Age)values(4,'Punnet','calcutta','110107',18);
Insert into student(RollNo,Name,City,Pincode,Age)values(5,'Rohit','Delhi','502207',19);
Insert into student(RollNo,Name,City,Pincode,Age)values(6,'Karnal','Dehradun',NULL,28);
Insert into student(RollNo,Name,City,Pincode,Age)values(7,'Shweta','Dehradun',98102,23);
Insert into student(RollNo,Name,City,Pincode,Age)values(8,'Mohit','Bombay',NULL,17);
Insert into student(RollNo,Name,City,Pincode,Age)values(9,'Pankaj','Bombay',NULL,17);
Insert into student(RollNo,Name,City,Pincode,Age)values(10,'Parul','dELhi','76312',24);
Insert into student(RollNo,Name,City,Pincode,Age)values(11,'Rohit','Baroda','12131',2);

-- Below is the query to insert date in a table and (Syntax of date variable in oracle server) -:

insert into dt(name,dat)values('first','23-04-2003'); --date variable formate DD-MM-YY

insert into stu(name,stdate)values('mork',To_date('14-03-2003','DD-MM-YYYY'));


-- Show record of all student whose name starts with “A”.
-- ➢ Show record of all student whose second alphabet of name is “a”.
-- ➢ Show record of all student whose name ends with “it”.
-- ➢ Show record of all student whose name contains “t”.
-- ➢ Show record of all student whose name contains “t” but not in end.
-- ➢ Show records of all students having age greater than 25 & living in Dehradun.
-- ➢ Show the list of all cities (names of cities should not be repeated)
-- ➢ Show the names students alphabetically in ascending order
-- ➢ Show the records of those students which are either less than 20 year or they are living in
-- Bombay.
-- ➢ Show records of all those student who are not living in Dehradun.
-- ➢ Display all names in uppercase.
-- ➢ Display all cities in lowercase.
-- ➢ Display name in lowercase, cities in uppercase.
-- ➢ Show all records in uppercase
-- ➢ Display those records which do not have pin code





--SOLUTION
SQL> select * from student where name like('A%');

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 1 Amit 	   Delhi	214213		 21

SQL> select * from student where name like('_a%');

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 6 Karnal	   Dehradun			 28
	 9 Pankaj	   Bombay			 17
	10 Parul	   dELhi	76312	 24

SQL> select * from student where name like('%it');

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 1 Amit 	   Delhi	214213		 21
	 5 Rohit	   Delhi	502207		 19
	 8 Mohit	   Bombay			     17


SQL> select * from student where name like('%t%');

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 1 Amit 	   Delhi	214213		 21
	 3 Kshitij	   Madras	110101		 16
	 4 Punnet	   calcutta	110107		 18
	 5 Rohit	   Delhi	502207		 19
	 7 Shweta	   Dehradun	98102		 23
	 8 Mohit	   Bombay			     17

6 rows selected.


SQL> select * from student where name like('%t%') and name not like('%t');

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 3 Kshitij	   Madras	110101		 16
	 7 Shweta	   Dehradun	98102		 23


SQL> select * from student where age > 25 and city = 'Dehradun';

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 6 Karnal	   Dehradun			 28

SQL> select city from student;

CITY
------------
Delhi
Bombay
Madras
calcutta
Delhi
Dehradun
Dehradun
Bombay
Bombay
dELhi

10 rows selected.

SQL> select city from student group by city;

CITY
------------
Dehradun
Bombay
dELhi
Delhi
calcutta
Madras

6 rows selected.


SQL> select name from student order by (name)asc;

NAME
---------------
Amit
Karnal
Kshitij
Kumar
Mohit
Pankaj
Parul
Punnet
Rohit
Shweta

10 rows selected.

SQL> select upper(name) from student;

UPPER(NAME)
---------------
AMIT
KUMAR
KSHITIJ
PUNNET
ROHIT
KARNAL
SHWETA
MOHIT
PANKAJ
PARUL

10 rows selected.

SQL> select lower(name) from student;

LOWER(NAME)
---------------
amit
kumar
kshitij
punnet
rohit
karnal
shweta
mohit
pankaj
parul

10 rows selected.

SQL> select lower(name),upper(city) from student;

LOWER(NAME)	UPPER(CITY)
--------------- ------------
amit		DELHI
kumar		BOMBAY
kshitij 	MADRAS
punnet		CALCUTTA
rohit		DELHI
karnal		DEHRADUN
shweta		DEHRADUN
mohit		BOMBAY
pankaj		BOMBAY
parul		DELHI

10 rows selected.


SQL> select * from student where pincode is null;

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 2 Kumar	   Bombay			 25
	 6 Karnal	   Dehradun			 28
	 8 Mohit	   Bombay			 17
	 9 Pankaj	   Bombay			 17





















-- 9. Write queries for the following :-
-- (i) Assign Roll No. “13” to Manish.
-- (ii) Assign the name “Abhijeet” to Roll No. 15
-- (iii) Set the cities of Roll No. 13 & 14 to “Meerut”
-- (iv) Increase all age by 3 years.
-- (v) Set the age of all students living in Meerut to “25”.
-- 10. Add a new column named “Balance”, type number”(6) to the student table.
-- 11. Set the balance of all students to Rs. 20,000/-
-- 12. Increase the balance by Rs. 500/- for all Bombay & Delhi students.
-- 13. Show the total balance due from all students.
-- 14. Show the maximum balance.
-- 15. Increase the size of “balance” column to 10.
-- 16. Reduce the size of city to “10”
-- 17. Create a new table “student2” as a copy of student with all records from student table.
-- 18. Show the structure of student2
-- 19. Delete the records of those students from “student2” who are greater or equal to 25 years.
-- 20. Show all records of student2 table
-- 21. Change the name of student2 to “Newstudent”
-- 22. Delete all records from “newstudent”
-- 23. Drop the “newstudent” table.
-- 24. Again create the “Newstudent” table similar to student table but this time do not copy the
-- record, only the structure.
-- 25. Create a new table named “BCA” with only three columns Roll No, Name & balance,
-- similar to student table. (Create with the help of student table only & also copy its data)
-- 26. Show all records of “BCA” table in upper case.



L> select * from student;

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 1 Amit 	   Delhi	214213		 21
	 2 Kumar	   Bombay			 25
	 3 Kshitij	   Madras	110101		 16
	 4 Punnet	   calcutta	110107		 18
	 5 Rohit	   Delhi	502207		 19
	 6 Karnal	   Dehradun			 28
	 7 Shweta	   Dehradun	98102		 23
	 8 Mohit	   Bombay			 17
	 9 Pankaj	   Bombay			 17
	10 Parul	   dELhi	76312		 24
	   Manish			314136

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	14 Aviral			319143		 29
	15		   Gwaliar	313149		 25
	11 Rohit	   Baroda	12131		  2
	12 Gaurav	   Rampur	312125

15 rows selected.

SQL> update student set rollno = 13 where name = 'Manish';

1 row updated.

SQL> select * from student;

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 1 Amit 	   Delhi	214213		 21
	 2 Kumar	   Bombay			 25
	 3 Kshitij	   Madras	110101		 16
	 4 Punnet	   calcutta	110107		 18
	 5 Rohit	   Delhi	502207		 19
	 6 Karnal	   Dehradun			 28
	 7 Shweta	   Dehradun	98102		 23
	 8 Mohit	   Bombay			 17
	 9 Pankaj	   Bombay			 17
	10 Parul	   dELhi	76312		 24
	13 Manish			314136

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	14 Aviral			319143		 29
	15		   Gwaliar	313149		 25
	11 Rohit	   Baroda	12131		  2
	12 Gaurav	   Rampur	312125

15 rows selected.

SQL> update student set name = 'Abhijeet' where rollno = 15;

1 row updated.

SQL> select * from student;

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 1 Amit 	   Delhi	214213		 21
	 2 Kumar	   Bombay			 25
	 3 Kshitij	   Madras	110101		 16
	 4 Punnet	   calcutta	110107		 18
	 5 Rohit	   Delhi	502207		 19
	 6 Karnal	   Dehradun			 28
	 7 Shweta	   Dehradun	98102		 23
	 8 Mohit	   Bombay			 17
	 9 Pankaj	   Bombay			 17
	10 Parul	   dELhi	76312		 24
	13 Manish			314136

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	14 Aviral			319143		 29
	15 Abhijeet	   Gwaliar	313149		 25
	11 Rohit	   Baroda	12131		  2
	12 Gaurav	   Rampur	312125

15 rows selected.

SQL> update student set age = age+3;

15 rows updated.

SQL> select * from student;

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	 1 Amit 	   Delhi	214213		 24
	 2 Kumar	   Bombay			 28
	 3 Kshitij	   Madras	110101		 19
	 4 Punnet	   calcutta	110107		 21
	 5 Rohit	   Delhi	502207		 22
	 6 Karnal	   Dehradun			 31
	 7 Shweta	   Dehradun	98102		 26
	 8 Mohit	   Bombay			 20
	 9 Pankaj	   Bombay			 20
	10 Parul	   dELhi	76312		 27
	13 Manish			314136

    ROLLNO NAME 	   CITY 	PINCODE 	AGE
---------- --------------- ------------ -------- ----------
	14 Aviral			319143		 32
	15 Abhijeet	   Gwaliar	313149		 28
	11 Rohit	   Baroda	12131		  5
	12 Gaurav	   Rampur	312125

15 rows selected.

SQL> update student set age = 25 where city = 'Meerut';

0 rows updated.

SQL> Alter table student add Balance number(6);

Table altered.

SQL> desc student;
 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 ROLLNO 					    NUMBER(6)
 NAME						    VARCHAR2(15)
 CITY						    VARCHAR2(12)
 PINCODE					    VARCHAR2(8)
 AGE						    NUMBER(2)
 BALANCE					    NUMBER(6)

SQL> update student set Balance = 20000;

15 rows updated.

SQL> select * from student;

    ROLLNO NAME 	   CITY 	PINCODE 	AGE    BALANCE
---------- --------------- ------------ -------- ---------- ----------
	 1 Amit 	   Delhi	214213		 24	 20000
	 2 Kumar	   Bombay			 28	 20000
	 3 Kshitij	   Madras	110101		 19	 20000
	 4 Punnet	   calcutta	110107		 21	 20000
	 5 Rohit	   Delhi	502207		 22	 20000
	 6 Karnal	   Dehradun			 31	 20000
	 7 Shweta	   Dehradun	98102		 26	 20000
	 8 Mohit	   Bombay			 20	 20000
	 9 Pankaj	   Bombay			 20	 20000
	10 Parul	   dELhi	76312		 27	 20000
	13 Manish			314136			 20000

    ROLLNO NAME 	   CITY 	PINCODE 	AGE    BALANCE
---------- --------------- ------------ -------- ---------- ----------
	14 Aviral			319143		 32	 20000
	15 Abhijeet	   Gwaliar	313149		 28	 20000
	11 Rohit	   Baroda	12131		  5	 20000
	12 Gaurav	   Rampur	312125			 20000

15 rows selected.

SQL> Update student set Balance = Balance+500 where city in('Delhi','Bombay');

5 rows updated.

SQL> select * from student;

    ROLLNO NAME 	   CITY 	PINCODE 	AGE    BALANCE
---------- --------------- ------------ -------- ---------- ----------
	 1 Amit 	   Delhi	214213		 24	 20500
	 2 Kumar	   Bombay			 28	 20500
	 3 Kshitij	   Madras	110101		 19	 20000
	 4 Punnet	   calcutta	110107		 21	 20000
	 5 Rohit	   Delhi	502207		 22	 20500
	 6 Karnal	   Dehradun			 31	 20000
	 7 Shweta	   Dehradun	98102		 26	 20000
	 8 Mohit	   Bombay			 20	 20500
	 9 Pankaj	   Bombay			 20	 20500
	10 Parul	   dELhi	76312		 27	 20000
	13 Manish			314136			 20000

    ROLLNO NAME 	   CITY 	PINCODE 	AGE    BALANCE
---------- --------------- ------------ -------- ---------- ----------
	14 Aviral			319143		 32	 20000
	15 Abhijeet	   Gwaliar	313149		 28	 20000
	11 Rohit	   Baroda	12131		  5	 20000
	12 Gaurav	   Rampur	312125			 20000

15 rows selected.

SQL> select total(balance) from student;
select total(balance) from student
       *
ERROR at line 1:
ORA-00904: "TOTAL": invalid identifier


SQL> select sum(balance) from student;

SUM(BALANCE)
------------
      302500


SQL> alter table student modify balance number(10);

Table altered.

SQL> desc student;
 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 ROLLNO 					    NUMBER(6)
 NAME						    VARCHAR2(15)
 CITY						    VARCHAR2(12)
 PINCODE					    VARCHAR2(8)
 AGE						    NUMBER(2)
 BALANCE					    NUMBER(10)

SQL> Alter table student modify city varchar(10);

Table altered.

SQL> desc student;
 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 ROLLNO 					    NUMBER(6)
 NAME						    VARCHAR2(15)
 CITY						    VARCHAR2(10)
 PINCODE					    VARCHAR2(8)
 AGE						    NUMBER(2)
 BALANCE					    NUMBER(10)




---RENAME THE COLUMN 
alter table student rename column Balance to Bal;


--DIFFERENCE BETWEEN DROP,DELETE AND TRUNCATE
DROP: Cannot be rolled back. Once you drop a table, it's gone, and there's no way to get it back unless you have a separate backup. No rollback command exists for DROP.

DELETE: Can be rolled back with ROLLBACK or undo operations specific to the database system. If you use DELETE within a transaction and then issue a ROLLBACK, the deleted rows will be restored. Similarly, some database systems offer specific undo functionalities for DELETE even outside of transactions.

TRUNCATE: Cannot be rolled back. Just like DROP, truncating a table is an irreversible operation.



--create a table which is copy of another table
create table student2 as select * from student;


--create one table and copy only structure from another table
create table newtable as select * from student where 1 = 2;

--create bca table and only copy the first 3 columns from student table along with data
create table bca as select name,rollno,city from student;



--QUESTION IS :-
--FIND THE NAME WITH MINIMUM AVERAGE AGE;
SELECT AVG(age) AS avgg, name
FROM student
GROUP BY name
ORDER BY avgg ASC
fetch first 2 row only;

select name,avg(age) from student group by name order by avg(age) asc fetch first 1 row only;



--show the data of those whose age is less then kumar age

select * from student where age <(select age from student where name = 'Amit');



******

--if city Delhii age 10% , bombay age 15%, dehradun age 12%

-- update student set age = case when city = 'Delhi' then  age+(age*0.1) when city = 'Bombay' then age+(age*0.15)  when city = 'dehradun' then age+(age*)) end;
 In files large amount of data is not stores.
files there is no predefined methods

mysql is software where we use sql 

flag file (MS excel) 
rdms(mysql)
structured form 
storing data in two forms files  databases.
on row is called record
one column is called as field



Databases  (Perment data storage)
SQL It provides security , partition of data
MySql is openSource , oracle is licenced version

Relational DataBase (Data stored in rows  coloumns)
DBMS
non relational(MongoDb,noSql)

CommondLine   
GUI interface 


create database Harish;
show databases;
use Harish;
show tables;
create table employee(empId int(5),empName varchar(20), 				//DDL 
		salary double(8,2), emailvarchar(30), password varchar(20));      // (8,2) means 99999999.65  (8 digits before point and 2 digits after point)

 desc employee; // it gives table structure
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| empId    | int         | YES  |     | NULL    |       |
| name     | varchar(20) | YES  |     | NULL    |       |
| salary   | double(8,2) | YES  |     | NULL    |       |
| email    | varchar(30) | YES  |     | NULL    |       |
| password | varchar(20) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+


insert into employee values(1,'Harish',8888.5,'xyz@gmail.com','Hello');  //insering data into table

 select * from employee; // total table
+-------+--------+---------+---------------+----------+
| empId | name   | salary  | email         | password |
+-------+--------+---------+---------------+----------+
|     1 | Harish | 8888.50 | xyz@gmail.com | Hello    |
|     2 | Pasha  | 8888.50 | abc@gmail.com | Hai      |
+-------+--------+---------+---------------+----------+

select salary from employee; //

+---------+
| salary  |
+---------+
| 8888.50 |
| 8888.50 |
+---------+

sql is not a case sensitive language
select name,salary from employee;

+--------+---------+
| name   | salary  |
+--------+---------+
| Harish | 8888.50 |
| Pasha  | 8888.50 |
+--------+---------+


update employee set salary = 100002 where empid=2;  //it updates the salary bases on empid
update employee set email="harish@gmail.com" where empid=1;
select * from employee;

+-------+--------+-----------+------------------+----------+
| empId | name   | salary    | email            | password |
+-------+--------+-----------+------------------+----------+
|     1 | Harish |   8888.50 | harish@gmail.com | Hello    |
|     2 | Pasha  | 100002.00 | abc@gmail.com    | Hai      |
+-------+--------+-----------+------------------+----------+

select * from employee;

+-------+----------+-----------+--------------------+---------------+
| empId | name     | salary    | email              | password      |
+-------+----------+-----------+--------------------+---------------+
|     1 | Harish   |   8888.50 | harish@gmail.com   | Hello         |
|     2 | Pasha    | 100002.00 | abc@gmail.com      | Hai           |
|     3 | SaiPavan | 100000.00 | sai@gmail.com      | janaki        |
|     4 | LoverBoy | 500000.00 | loverboy@gmail.com | NavyaLoverBoy |
|     5 | kiran    | 120000.00 | kiran@gmail.com    | kiranKango    |
|     6 | satya    | 120000.00 | satya@gmail.com    | MiaKalifa     |
+-------+----------+-----------+--------------------+---------------+

 delete from employee where empid=2;
+-------+----------+-----------+--------------------+---------------+
| empId | name     | salary    | email              | password      |
+-------+----------+-----------+--------------------+---------------+
|     1 | Harish   |   8888.50 | harish@gmail.com   | Hello         |
|     3 | SaiPavan | 100000.00 | sai@gmail.com      | janaki        |
|     4 | LoverBoy | 500000.00 | loverboy@gmail.com | NavyaLoverBoy |
|     5 | kiran    | 120000.00 | kiran@gmail.com    | kiranKango    |
|     6 | satya    | 120000.00 | satya@gmail.com    | MiaKalifa     |
+-------+----------+-----------+--------------------+---------------+

alter table employee add adress varchar(50); // it adds new coloumn;

+-------+----------+-----------+--------------------+---------------+--------+
| empId | name     | salary    | email              | password      | adress |
+-------+----------+-----------+--------------------+---------------+--------+
|     1 | Harish   |   8888.50 | harish@gmail.com   | Hello         | NULL   |
|     3 | SaiPavan | 100000.00 | sai@gmail.com      | janaki        | NULL   |
|     4 | LoverBoy | 500000.00 | loverboy@gmail.com | NavyaLoverBoy | NULL   |
|     5 | kiran    | 120000.00 | kiran@gmail.com    | kiranKango    | NULL   |
|     6 | satya    | 120000.00 | satya@gmail.com    | MiaKalifa     | NULL   |
|     7 | jaleel   | 120000.00 | jaleel@gmail.com   | sunnyleonon   | NULL   |
|     8 | chillBro | 120000.00 | bro@gmail.com      | haiii         | NULL   |
+-------+----------+-----------+--------------------+---------------+--------+

alter table employee rename column adress to Address;  // rename column name 

DDL  Data defination language
DML Data maniculation  language
DCL Data control language

Constraints
------------------
Not Null: 

 create table employee1(id int primary key, name varchar(50) not null);

alter table employee1 modify column empid int primary key;  // To modify constraints



create table employee(id int primary key auto_increment,name varchar(50));  //automatic increment key values
insert into employee values(1,"Harish");
insert into employee (name) values ("Shiva");
alter table employee modify column id int auto_increment;

one to many   2 tables
many to one   2 tables
many to many  3 tables

Foreign key First checks wheather it present or not in tables again its take


create table course (cid int(5) primary key auto_increment, cname varchar(50),suration int(4), fees double(8,2));

create table student(sid int(5) primary key auto_increment, sname varchar(20), cid int(5), foreign key(cid) references course(cid));

Quaries 
Database engine is like JVM
Joints :  equi joint is also called inner join
Displaying the data by joining two tables Or retriving the data from multiple tables based on commomn column

select ename,job,dname,loc from emp,dept where emp.dept no=dept.deptno;

Aliase name like reference variables
Anscy style
inner joint gives both having values
left join & right join

Self join,  Take one table joints in side the table 

select e.empno,e.ename,e.job,m.ename,e.sal from emp e inner join emp m on(e.mgr=m.empno);

select * from employee where salary<5556;
select * from employee where ename="Harish";

SUB Queries
---------------
Query in the another query

Agregate or group Functions (sum,avg,min,max,count)
having clause
group clause

select * from emp order by ename desc;
to change column names for showing
select ename, job, sal,sal*12,com from emp;

select ename, job, sal,sal*12 "Annual Salary",com from emp;
aliase names

number + null = null;

sal+ifnull(com,0);  // to add null with number

select distinct sal from employee // it will not shows duplicate values

view  is restricted show


create view temp as select enmae,job,hiredate from emp;

Functions




JDBC 
===============
Statement object is useful to execute multiple different queries
Connection  is interface 
DriverManager is class
Statement is interface
com.mysql.jdbc.Driver 
executeUpdate  --- 
executeQuery === select (ResultSet**)
ResultSet rs=
rs is object 
ResultSet is provides the data
ResultSet provide 

PreparedStatement  pst// same query multiple times
pst=con.prepare

Statement // Two or more different queries then it is suitable
Tokenizing query
parsing query result
compiling

executing
statement performs all the above again and again 
PreparedStatement (It saves the time) (t,p,c) only once


 
mysql> create database SHsystem;
Query OK, 1 row affected (0.02 sec)

mysql> use shsystem;
Database changed
mysql> show tables;
Empty set (0.02 sec)

mysql> create table HOD(name varchar(30) not null, username varchar(30) not null, password varchar(30) not null);
Query OK, 0 rows affected (0.10 sec)

mysql> desc HOD;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| name     | varchar(30) | NO   |     | NULL    |       |
| username | varchar(30) | NO   |     | NULL    |       |
| password | varchar(30) | NO   |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
3 rows in set (0.01 sec)

mysql> select * from hod;
Empty set (0.01 sec)


mysql> drop table HOD;
Query OK, 0 rows affected (0.07 sec)

mysql> create table HOD(HODId int auto_increment primary key,name varchar(30) not null, username varchar(30) not null, password varchar(30) not null);
Query OK, 0 rows affected (0.03 sec)

mysql> desc HOD;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| HODId    | int         | NO   | PRI | NULL    | auto_increment |
| name     | varchar(30) | NO   |     | NULL    |                |
| username | varchar(30) | NO   |     | NULL    |                |
| password | varchar(30) | NO   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

mysql> create table complaints( complaintId int not null, empId int,complain
tType varchar(30), engId int, status varchar(12),dataRaised date, dataResolv
ed date);
Query OK, 0 rows affected (0.04 sec)

mysql>  desc complaints;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| complaintId   | int         | NO   |     | NULL    |       |
| empId         | int         | YES  |     | NULL    |       |
| complaintType | varchar(30) | YES  |     | NULL    |       |
| engId         | int         | YES  |     | NULL    |       |
| status        | varchar(12) | YES  |     | NULL    |       |
| dataRaised    | date        | YES  |     | NULL    |       |
| dataResolved  | date        | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
7 rows in set (0.00 sec)


mysql> use SHsystem;
Database changed
mysql> show tables;
+--------------------+
| Tables_in_shsystem |
+--------------------+
| complaints         |
| hod                |
+--------------------+
2 rows in set (0.03 sec)

mysql> desc complaints;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| complaintId   | int         | NO   |     | NULL    |       |
| empId         | int         | YES  |     | NULL    |       |
| complaintType | varchar(30) | YES  |     | NULL    |       |
| engId         | int         | YES  |     | NULL    |       |
| status        | varchar(12) | YES  |     | NULL    |       |
| dataRaised    | date        | YES  |     | NULL    |       |
| dataResolved  | date        | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
7 rows in set (0.01 sec)

mysql> Create Table Department(deptID int primary key auto_increment, dname
varchar(20) unique not null, location varchar(20) not null);
Query OK, 0 rows affected (0.04 sec)

mysql> desc department;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| deptID   | int         | NO   | PRI | NULL    | auto_increment |
| dname    | varchar(20) | NO   | UNI | NULL    |                |
| location | varchar(20) | NO   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> Create table Employee(EmpId int primary key auto_increment, deptId in
t,Foreign key(deptId) references Department(deptID), name varchar(20) not nu
ll, username varchar(30) not null, password varchar(12) not null);
Query OK, 0 rows affected (0.03 sec)

mysql> desc Employee;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| EmpId    | int         | NO   | PRI | NULL    | auto_increment |
| deptId   | int         | YES  | MUL | NULL    |                |
| name     | varchar(20) | NO   |     | NULL    |                |
| username | varchar(30) | NO   |     | NULL    |                |
| password | varchar(12) | NO   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)

mysql> Create table Employee(EnggId int primary key auto_increment, name varchar(20) not null,username varchar(30) not null, password varchar(20) not null, type varchar(30) , location varchar(12) not null);
ERROR 1050 (42S01): Table 'employee' already exists
mysql> Create table Engineer(EnggId int primary key auto_increment, name varchar(20) not null,username varchar(30) not null, password varchar(20) not null, type varchar(30) , location varchar(12) not null);
Query OK, 0 rows affected (0.02 sec)

mysql> desc Engineer;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| EnggId   | int         | NO   | PRI | NULL    | auto_increment |
| name     | varchar(20) | NO   |     | NULL    |                |
| username | varchar(30) | NO   |     | NULL    |                |
| password | varchar(20) | NO   |     | NULL    |                |
| type     | varchar(30) | YES  |     | NULL    |                |
| location | varchar(12) | NO   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
6 rows in set (0.00 sec)

mysql> desc hod;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| HODId    | int         | NO   | PRI | NULL    | auto_increment |
| name     | varchar(30) | NO   |     | NULL    |                |
| username | varchar(30) | NO   |     | NULL    |                |
| password | varchar(30) | NO   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
4 rows in set (0.04 sec)

mysql> insert into hod values(11,"Pritam","pritamkumar","Pritam@123");
Query OK, 1 row affected (0.02 sec)

mysql> insert into engineer values(101,"Suraj","surajkumar","Suraj@123","active","Noida");
Query OK, 1 row affected (0.01 sec)

mysql> select * from hod;
+-------+--------+-------------+------------+
| HODId | name   | username    | password   |
+-------+--------+-------------+------------+
|    11 | Pritam | pritamkumar | Pritam@123 |
+-------+--------+-------------+------------+
1 row in set (0.00 sec)

mysql> select * from Engineer;
+--------+-------+------------+-----------+--------+----------+
| EnggId | name  | username   | password  | type   | location |
+--------+-------+------------+-----------+--------+----------+
|    101 | Suraj | surajkumar | Suraj@123 | active | Noida    |
+--------+-------+------------+-----------+--------+----------+
1 row in set (0.00 sec)

mysql> desc employee;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| EmpId    | int         | NO   | PRI | NULL    | auto_increment |
| deptId   | int         | YES  | MUL | NULL    |                |
| name     | varchar(20) | NO   |     | NULL    |                |
| username | varchar(30) | NO   |     | NULL    |                |
| password | varchar(12) | NO   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)


mysql> insert into employee values(101,11,"suraj","surajkumar","Suraj@123");
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`shsystem`.`employee`, CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`deptId`) REFERENCES `department` (`deptID`))
mysql> desc department;
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| deptID   | int         | NO   | PRI | NULL    | auto_increment |
| dname    | varchar(20) | NO   | UNI | NULL    |                |
| location | varchar(20) | NO   |     | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
3 rows in set (0.02 sec)

mysql> insert into department values(1,"HR","Noida");
Query OK, 1 row affected (0.01 sec)

mysql> insert into department values(2,"SSM","New Delhi");
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee values(101,1,"suraj","surajkumar","Suraj@123");
Query OK, 1 row affected (0.01 sec)

mysql> insert into employee values(102,2,"rohan","rohankumar","rohan@123");
Query OK, 1 row affected (0.00 sec)

mysql> select* from employee;
+-------+--------+-------+------------+-----------+
| EmpId | deptId | name  | username   | password  |
+-------+--------+-------+------------+-----------+
|   101 |      1 | suraj | surajkumar | Suraj@123 |
|   102 |      2 | rohan | rohankumar | rohan@123 |
+-------+--------+-------+------------+-----------+
2 rows in set (0.00 sec)

mysql> select* from department;
+--------+-------+-----------+
| deptID | dname | location  |
+--------+-------+-----------+
|      1 | HR    | Noida     |
|      2 | SSM   | New Delhi |
+--------+-------+-----------+
2 rows in set (0.00 sec)

mysql> select* from employee;
+-------+--------+-------+------------+-----------+
| EmpId | deptId | name  | username   | password  |
+-------+--------+-------+------------+-----------+
|   101 |      1 | suraj | surajkumar | Suraj@123 |
|   102 |      2 | rohan | rohankumar | rohan@123 |
|   103 |      2 | Mohan | mohankumar | Mohan@123 |
+-------+--------+-------+------------+-----------+
3 rows in set (0.01 sec)
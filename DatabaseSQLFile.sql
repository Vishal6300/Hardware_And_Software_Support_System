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

mysql>
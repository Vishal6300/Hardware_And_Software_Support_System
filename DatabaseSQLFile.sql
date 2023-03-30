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
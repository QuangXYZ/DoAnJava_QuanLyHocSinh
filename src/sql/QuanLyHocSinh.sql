create database QLHS;
use QLHS;

create table USERS(
	USERNAME nchar(20) not null primary key,
    USERPASSWORD nchar(20)
);
insert into USERS(USERNAME,USERPASSWORD) values ('Admin','123456');
insert into USERS(USERNAME,USERPASSWORD) values ('Quang','123456');
insert into USERS(USERNAME,USERPASSWORD) values ('Quan','123456');
insert into USERS(USERNAME,USERPASSWORD) values ('Nhu Y','123456');

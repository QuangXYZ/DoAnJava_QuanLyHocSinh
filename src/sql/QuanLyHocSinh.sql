create database QLHS;
use QLHS;
create table HOCSINH(
	MAHS nchar(8) not null primary key,
    HOTEN nvarchar(50)
 );

insert into HOCSINH(MAHS,HOTEN)values ('K25.0005','Thanh Quang');
insert into HOCSINH(MAHS,HOTEN)values ('K25.0006','Nhu Y');
insert into HOCSINH(MAHS,HOTEN)values ('K25.0007','Minh Quan');


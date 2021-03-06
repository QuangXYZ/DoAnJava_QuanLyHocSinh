create database QLHS;
use QLHS;
create table USERS(
	USERNAME nchar(20) not null primary key,
    USERPASSWORD nchar(20),
    USERLEVEL int(10)
);

insert into USERS(USERNAME,USERPASSWORD,USERLEVEL) values ('Admin','123456',0);
insert into USERS(USERNAME,USERPASSWORD,USERLEVEL) values ('Quang','123456',1);
insert into USERS(USERNAME,USERPASSWORD,USERLEVEL) values ('Quan','123456',1);
insert into USERS(USERNAME,USERPASSWORD,USERLEVEL) values ('Nhu Y','123456',1);

create table HOCSINH (
    MAHS nchar(20) not null primary key,
    HOTEN nvarchar(40),
    NGAYSINH nchar(20),
    GIOITINH nchar(20),
    QUEQUAN nvarchar(30),
    LOP nchar(20),
    IMG nchar(40)
);


insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('123','Nguyễn Thanh Quang','30/07/2002','Nam','Hà Nội','DCT1201','\\src\\images\\Quang.jpg');
insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('124','Đặng Huỳnh Như Y','30/07/2002','Nam','Hà Nội','DCT1201','\\src\\images\\NhuY.jpg');
insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('125','Trần Minh Quân','30/07/2002','Nam','Hà Nội','DCT1202','\\src\\images\\Quan.jpg');
insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('126','Nguyễn Thanh Quang','30/07/2002','Nam','Hà Nội','DCT1202','\\src\\images\\Quang.jpg');
insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('127','Đặng Huỳnh Như Y','30/07/2002','Nam','Hà Nội','DCT1203','\\src\\images\\NhuY.jpg');
insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('128','Trần Minh Quân','30/07/2002','Nam','Hà Nội','DCT1203','\\src\\images\\Quan.jpg');
create table GIAOVIEN (
    MAGV nchar(20) not null primary key,
    HOTEN nvarchar(40),
    NGAYSINH nchar(20),
    GIOITINH nchar(20),
    QUEQUAN nvarchar(30),
    LOP nchar(20),
    IMG nchar(40)
);

insert into GIAOVIEN(MAGV,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('1234','Nguyễn Thanh Quang','30/07/2002','Nam','Hà Nội','DCT1206','\src\images\Quang.jpg');
insert into GIAOVIEN(MAGV,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('1235','Đặng Huỳnh Như Y','30/07/2002','Nam','Hà Nội','DCT1206','\\src\\images\\NhuY.jpg');
insert into GIAOVIEN(MAGV,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('1236','Trần Minh Quân','30/07/2002','Nam','Hà Nội','DCT1206','\\src\\images\\Quan.jpg');
create table DIEMHOCSINH (
	id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    MAHS nchar(20) not null UNIQUE,
    TOAN FLOAT(4),
    ANH FLOAT(4),
    VAN FLOAT(4),
    SINH FLOAT(4),
    LI FLOAT(4),
    HOA FLOAT(4),
    FOREIGN KEY(MAHS) REFERENCES HOCSINH(MAHS)
);


create table LOPHOC(
	MALOP nchar(20) not null primary key,
    TENLOP nchar(20)
);

insert into LOPHOC(MALOP,TENLOP) values ('DCT1201','Lop 1');
insert into LOPHOC(MALOP,TENLOP) values ('DCT1202','Lop 2');
insert into LOPHOC(MALOP,TENLOP) values ('DCT1203','Lop 3');
insert into LOPHOC(MALOP,TENLOP) values ('DCT1204','Lop 4');
insert into LOPHOC(MALOP,TENLOP) values ('DCT1205','Lop 5');
insert into LOPHOC(MALOP,TENLOP) values ('DCT1206','Lop 5');

create table KETQUA (
	id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    MAHS nchar(20) not null UNIQUE,
    DIEMTB FLOAT(2),
    HOCLUC nchar(20),
    FOREIGN KEY(MAHS) REFERENCES HOCSINH(MAHS)
);


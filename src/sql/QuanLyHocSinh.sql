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

create table HOCSINH (
    MAHS nchar(20) not null primary key,
    HOTEN nvarchar(40),
    NGAYSINH nchar(20),
    GIOITINH nchar(20),
    QUEQUAN nvarchar(30),
    LOP nchar(20),
    IMG nchar(40)
);

insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('123','Nguyễn Thanh Quang','30/07/2002','Nam','Hà Nội','DCT1206','\src\images\Quang.jpg');
insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('124','Đặng Huỳnh Như Y','30/07/2002','Nam','Hà Nội','DCT1206','\\src\\images\\NhuY.jpg');
insert into HOCSINH(MAHS,HOTEN,NGAYSINH,GIOITINH,QUEQUAN,LOP,IMG) values ('125','Trần Minh Quân','30/07/2002','Nam','Hà Nội','DCT1206','\\src\\images\\Quan.jpg');

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
    MAHS nchar(20),
    TOAN FLOAT(4),
    ANH FLOAT(4),
    VAN FLOAT(4),
    SINH FLOAT(4),
    LI FLOAT(4),
    HOA FLOAT(4)
);
ALTER TABLE DIEMHOCSINH MODIFY MAHS nchar(20) NOT NULL;

ALTER TABLE DIEMHOCSINH
ADD CONSTRAINT fk_hs_mahs_sanpham
 FOREIGN KEY (MAHS)
 REFERENCES HOCSINH (MAHS);

insert into DIEMHOCSINH(MAHS,TOAN,ANH,VAN,SINH,LI,HOA) values ('123',7,8,9,10,8,9.3);
insert into DIEMHOCSINH(MAHS,TOAN,ANH,VAN,SINH,LI,HOA) values ('124',7.5,8,9,10,8,9.3);
insert into DIEMHOCSINH(MAHS,TOAN,ANH,VAN,SINH,LI,HOA) values ('125',7,8,9.5,10,8,9.3);










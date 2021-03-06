﻿CREATE DATABASE  qlsv_swing
GO
USE qlsv_swing
GO
CREATE TABLE tbluser(
	id int identity PRIMARY KEY,
	username nvarchar(20) NOT NULL UNIQUE,
	password nvarchar(200)NOT NULL,
	email varchar(50) null UNIQUE,
	roleId int default 0,
	verifyCode int default null,
	status  int default 1
)
GO

CREATE TABLE student(
	id varchar(20) NOT NULL PRIMARY KEY,
	name nvarchar(50) NOT NULL,
	age int NOT NULL,
	gender smallint ,
	address nvarchar(200) NOT NULL,
	phone varchar(11) NOT NULL UNIQUE,
	gpa float,
	status smallint

)
GO

INSERT INTO tbluser(username,password,email) VALUES('admin9','123456','a@')
GO

CREATE INDEX ix_student_name
ON student(name)
GO

ALTER TABLE tbluser
DROP CONSTRAINT pinky;
SELECT * FROM tbluser
declare @name varchar(20) 'admin'
IF EXISTS (SELECT* FROM tbluser where username LIKE '%admin%'  )
SELECT *from tbluser
INSERT INTO student VALUES ('B8861',N'Nguyễn Trường Giang',31,1,N'Phú vinh An khánh Hoài Đức Hà Nội','0934646892',6.5,1)
GO
--Thủ tục thêm mới tài khoản 
ALTER PROCEDURE sp_addnewuser(
	@username varchar(20),
	@password nvarchar(200),
	@mes nvarchar(100) OUTPUT
)
AS

	BEGIN 				
		IF NOT EXISTS(select * FROM tbluser where username LIKE @username )				
					BEGIN 		
					INSERT INTO tbluser(username,password) VALUES(@username,@password)
			
					print 'them moi thanh cong';
					SET @mes = 'them moi thanh cong';
					END
			ELSE				
					BEGIN
					print 'them moi that bai';
					SET @mes  ='them moi that bai';
					END
		
	END
GO
--test add new sp
declare @username varchar(20),@pass nvarchar(200),@mes nvarchar(100)
EXEC sp_addnewuser 'admin5','123456',@mes OUTPUT
select @mes
-- thủ tục lấy tất cả sinh viên
CREATE PROC sp_getAll AS
SELECT * FROM student WHERE status =1
GO
SELECT * FROM tbluser where username LIKE 'admin'
-- thủ tục thêm sinh viên
CREATE PROC sp_addST (
	@id varchar(20),
	@name nvarchar(50) ,
	@age int ,
	@gender smallint,
	@address nvarchar(200),
	@phone varchar(11) ,
	@gpa float,
	@status smallint
)
AS
BEGIN
INSERT INTO student VALUES(	@id,@name,@age,@gender,@address,@phone,@gpa,@status)
END
GO
EXEC sp_getAll
GO
SELECT count(id) From student
GO
-- thủ tục đếm số sinh viên
CREATE PROC sp_get_count_student
@count int OUTPUT
AS
	BEGIN
		SELECT id From student
		set @count = @@ROWCOUNT
	END
	RETURN @count
GO
declare @i int;
EXEC sp_get_count_student @i OUTput;
SELECT @i;
GO
--Thủ tục lấy sinh viên theo Id
CREATE PROCEDURE sp_get_Student_By_Id
@id varchar(20)
AS
	BEGIN
		SELECT *FROM student 
		WHERE id = @id
	END

	DECLARE @id1 varchar(20);
	EXEC sp_get_Student_By_Id 'B0002'
GO
-- Thủ tục cập nhật sinh viên
CREATE PROC sp_editSt (
	@id varchar(20),
	@name nvarchar(50) ,
	@age int ,
	@gender smallint,
	@address nvarchar(200),
	@phone varchar(11) ,
	@gpa float,
	@status smallint
)
AS
BEGIN
UPDATE  student SET	name=@name,age=@age,gender=@gender,address=@address,phone=@phone,gpa=@gpa,status=@status WHERE id=@id
END
GO
--Thủ tục xóa sinh viên
CREATE PROC sp_deleteSt(
@id varchar(20),
@status smallint
)

AS
BEGIN
UPDATE student SET status = @status WHERE id = @id
END


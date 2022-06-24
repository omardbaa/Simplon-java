
//========= USER =========\\

create table Userr (
	UserName varchar (50) primary key,
	FirstName varchar(50),
	LastName varchar(50),
	PassWord varchar(50)
);

select  from Userr where UserName = 'omar1' AND FirstName = 'omar' AND LastName = 'dbaa' AND PassWord ='123'


//========= TASK =========\\
Create table Task(
	Title varchar(50) Primary key,
	Description varchar(300),
	Status varchar(50),
	Deadline Date,
	Category varchar(50),
	foreign key (Category ) references Categories(Category ) 
);

//========= CATEGORIES =========\\
Create table Categories(
	Category  varchar(50) Primary key
);

INSERT INTO categories (Category) Values ('Brief');
INSERT INTO categories (Category) Values ('Standby topic');
INSERT INTO categories (Category) Values ('Research');
INSERT INTO categories (Category) Values ('Presentation')
INSERT INTO Userr (UserName, FirstName, LastName, PassWord) Values ('omar-dbaa', 'omar','dbaa', '123abc');


DELETE  from Userr where UserName = 'qfq';

select * from Userr
select * from Task
select * from Categories

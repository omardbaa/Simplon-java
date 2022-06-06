create table Users (

	UserId int primary key,
	FirstName varchar(50),
	LastName varchar(50),
	Email varchar(50),
	City varchar(50),
	Country varchar(50)
);


Create table Product(
	IdProduct int Primary key,
	ProductName varchar(40),
	Stock int,
	CategoryName varchar(40),IdCategory int,
	foreign key (IdCategory) references Category(IdCategory) 
);



Create table Categories(
	IdCategory int Primary key,
	CategoryName varchar(40)
);




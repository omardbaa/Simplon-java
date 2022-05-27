/*1- Créer la base de données.*/

/Client/
Create table Client(
	id_Client int Primary key,
	Nom_Client varchar(25),
	Prenom_Client varchar(25),
	Ville_Client varchar(25),
	Email_Client varchar(25),
	Password_Client varchar(25)
);

/Admin/
Create table Admin(
	id_Admin int Primary key,
	Nom_Admin varchar(25),
	Prenom_Admin varchar(25),
	Ville_Admin varchar(25),
	Email_Admin varchar(25),
	Password_Admin varchar(25)
);

/Produit/
Create table Produit(
	id_Produit int Primary key,
	Nom_Produit varchar(25),
	Prix_Produit float,
	Qte_Stock int,
	id_Admin int references Admin(id_Admin)
);


/Vote/
Create table Vote(
	id_Client int references Client(id_Client),
	id_Produit int references Produit(id_Produit),
	Date_Vote Date,
	Rate decimal ,
	primary key (id_Client,id_Produit)
);


/*2- Remplir la base de données.*/


/Client/
Insert into Client values (1 ,'Omar' ,'Dbaa' ,'Agadir' ,'omar.dbaa@gmail.com' ,'omar123');
Insert into Client values (2 ,'Khalil' ,'Farouqi' ,'Agadir' ,'khalil.farouqi@gmail.com' ,'khalil123');
Insert into Client values (3 ,'Ayoub' ,'Oudor' ,'Agadir' ,'ayoub.oudor@gmail.com' ,'ayoub123')

/* Anass
insert into client (id_Client,Nom_Client,Prenom_Client ,Ville_Client ,Email_Client,Password_Client)
values (5,'Anass' ,'Elmakhloufi' ,'Agadir' ,'anass.elmakhloufi@gmail.com' ,'anass123')*/

/Admin/
Insert into Admin values (1 ,'Khalil' ,'Farouqi' ,'Agadir' ,'khalil.farouqi@gmail.com' ,'omar123');
Insert into Admin values (2 ,'Ayoub' ,'Oudor' ,'Agadir' ,'ayoub.oudor@gmail.com' ,'khalil123');
Insert into Admin values (3 ,'Omar' ,'Dbaa' ,'Agadir' ,'omar.dbaa@gmail.com' ,'ayoub123')


/Produit/
Insert into Produit values (1 ,'Argan' ,500 ,100 ,1);
Insert into Produit values (2 ,'Zaafran' ,600 ,100 ,2);
Insert into Produit values (3 ,'Amlou' ,200 ,100 ,3)

update Produit set qte_stock=200 where id_produit=2;
update Produit set qte_stock=300 where id_produit=3;
/Vote/
Insert into Vote values (1 ,2 ,'2022-05-27' ,5);
Insert into Vote values (2 ,3 ,'2022-05-27' ,4.5);
Insert into Vote values (3 ,1 ,'2022-05-27' ,4);
Insert into Vote values (4 ,1 ,'2022-05-27' ,4);
Insert into Vote values (1 ,4 ,'2022-05-27' ,4);


/*3- Lister les données enregistrées dans la base de données*/

select * from Client
select * from Admin
select * from Produit
select * from Vote

select * from Vote, Produit, Admin, Client
where Produit.id_Admin = Admin.id_Admin and Vote.id_Client = Client.id_Client
and Vote.id_Produit = Produit.id_Produit and Vote.id_Produit = Produit.id_Produit 

select * from Client inner join Vote inner join Produit inner join Admin 
on Admin.id_Admin = Produit.id_Admin on Produit.id_Produit = Vote.id_Produit
on Vote.id_Client = Client.id_Client

select * from Client ;
select id_client , nom_client from Client where id_client >1;
select * from Produit;
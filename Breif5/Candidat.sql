/*par un identifiant, un nom, un prénom, un mail, adresse, ville, pays*/


/*Candidat*/
Create table Candidat(
	ID_Candidat int Primary key,
	Nom_Candidat varchar(25),
	Prenom_Candidat varchar(25),
	Email_Candidat varchar(25),
	Password_Candidat varchar(25),
	Adresse_Candidat varchar(25),
	Ville_Candidat varchar(25),
	Pays_Candidat varchar(25)
	
);


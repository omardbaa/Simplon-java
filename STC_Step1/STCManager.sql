create table role(
nom_role varchar(20) primary key,
fullName varchar(20),
CONSTRAINT fk FOREIGN KEY(fullName)
REFERENCES utilisateur(fullName)
);

create table utilisateur(
fullName varchar(20) primary key,
telephone varchar(20)  not null
);

create table administrateur(
id_admin int primary key,
email varchar(20) not null, 
login varchar(20)not null,
password varchar(20) not null , 
etat varchar(20)	
);

create table participent(
fullNameParticipent varchar(20) primary key,
domaine varchar(20) not null,	
email varchar(20) not null,
structure varchar(20) not null	
);

create table responsable(
fullNameResponsable varchar(20) primary key,
domaine varchar(20) not null,
type varchar(20) not null,
etat varchar(20) not null
);

create table activite(
titreActivite varchar(20) primary key,
descriptif varchar(200),
type varchar(20),
dateDebut varchar(20),
dateFin varchar(20),
etat varchar(20),
fullNameResponsable varchar(20),
CONSTRAINT fk_activite_responsable FOREIGN KEY(fullNameResponsable)
REFERENCES responsable(fullNameResponsable) ON DELETE CASCADE
);

create table ParticipentActivite(
ref_ParAct int primary key,
fullNameParticipent varchar(20),
CONSTRAINT fk_activite_participent FOREIGN KEY(fullNameParticipent)
REFERENCES participent(fullNameParticipent) ON DELETE CASCADE,
titreActivite varchar(20),
CONSTRAINT fk_participent_activite FOREIGN KEY(titreActivite)
REFERENCES activite(titreActivite) ON DELETE CASCADE
);


create table exercice(
ref_exercice int primary key,
annee varchar(20),
dateDebut varchar(20),
dateFin varchar(20), 
statut varchar(20),
titreActivite varchar(20),
CONSTRAINT fk_exercice_activite FOREIGN KEY(titreActivite)
REFERENCES activite(titreActivite) ON DELETE CASCADE
);


select * FROM utilisateur
select * from role
select * from administrateur
select * from responsable
select * from participent
select * from exercice
select * from activite
select * from participentactivite
select * from participentactivite where fullnameparticipent='participent 3';
select * from participentactivite where titreactivite='dev games';

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO public.utilisateur(
	fullname, telephone)
	VALUES ('ayoub oudor', '0888888');
	
INSERT INTO public.utilisateur(
	fullname, telephone)
	VALUES ('seny balde', '0888888');
	
INSERT INTO public.utilisateur(
	fullname, telephone)
	VALUES ('omar dbaa', '0888888');
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO public.role(
	nom_role, fullname)
VALUES ('ADMIN', 'ayoub oudor');

INSERT INTO public.role(
	nom_role, fullname)
VALUES ('RESPONSABLE', 'seny balde');

INSERT INTO public.role(
	nom_role, "fullname")
VALUES ('PARTICIPENT', 'omar dbaa');
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO public.administrateur(
	id_admin, email, login, password, etat)
	VALUES (1, 'omar@gmail.com', 'dbaa', '123', 'activé');
	
INSERT INTO public.administrateur(
	id_admin, email, login, password, etat)
	VALUES (2, 'ayoub@gmail.com', 'oudor', '123', 'activé');
	
INSERT INTO public.administrateur(
	id_admin, email, login, password, etat)
	VALUES (3, 'seny@gmail.com', 'balde', '123', 'activé');
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 1', 'data science', 'part1@gmail.com', 'university');
	
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 2', 'data science', 'part2@gmail.com', 'faculty of AI');
	
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 3', 'front end', 'part3@gmail.com', 'entreprise');
	
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 4', 'front end', 'part4@gmail.com', 'technopark');
	
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 5', 'back end', 'part5@gmail.com', 'entreprise');
	
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 6', 'back end', 'part6@gmail.com', 'technopark');
	
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 7', 'full stack', 'part7@gmail.com', 'school');
	
INSERT INTO public.participent(
	fullNameParticipent, domaine, email, structure)
	VALUES ('participent 8', 'full stack', 'part8@gmail.com', 'startup');
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO public.responsable(
	fullNameResponsable, domaine, type, etat)
	VALUES ('responsable 1', 'dev informatique', 'formateur', 'active');
INSERT INTO public.responsable(
	fullNameResponsable, domaine, type, etat)
	VALUES ('responsable 2', 'machine learning', 'intervenant', 'désactive');
INSERT INTO public.responsable(
	fullNameResponsable, domaine, type, etat)
	VALUES ('responsable 3', 'security', 'intervenant', 'désactive');
INSERT INTO public.responsable(
	fullNameResponsable, domaine, type, etat)
	VALUES ('responsable 4', 'cloud computing', 'formateur', 'active');
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('dev mobile', 'create new app mobile', 'Formation', '15/08/2021', '15/08/2022', 'Active','responsable 1');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('dev games', 'create new games', 'Talk', '15/08/2021', '15/08/2022', 'Active','responsable 2');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('dev web', 'create new web ', 'Événement', '15/08/2021', '15/08/2022', 'desactive','responsable 3');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('objet of things', 'create new web ', 'Formation', '15/08/2021', '15/08/2022', 'desactive','responsable 4');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('App security', 'create new games ', 'Talk', '15/08/2021', '15/08/2022', 'desactive','responsable 3');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('driver', 'create new app mobile ', 'Événement', '15/08/2021', '15/08/2022', 'desactive','responsable 4');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('bank security', 'create new web ', 'Formation', '15/08/2021', '15/08/2022', 'desactive','responsable 3');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
		VALUES ('data struct', 'create new app mobile ', 'Talk', '15/08/2021', '15/08/2022', 'desactive','responsable 2');
	
INSERT INTO public.activite(
	titreActivite, descriptif, type, datedebut, datefin, etat, fullNameResponsable)
	VALUES ('java', 'create new games ', 'Événement', '15/08/2021', '15/08/2022', 'desactive','responsable 1');

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

INSERT INTO public.exercice(
	ref_exercice, annee, datedebut, datefin, statut, titreActivite)
	VALUES (1, '2021', '10/08/2021', '16/08/2022', 'terminé','dev web');
	
INSERT INTO public.exercice(
	ref_exercice, annee, datedebut, datefin, statut, titreActivite)
	VALUES (2, '2021', '10/08/2021', '16/08/2022', 'en cours','dev mobile');
	
INSERT INTO public.exercice(
	ref_exercice, annee, datedebut, datefin, statut, titreActivite)
	VALUES (3, '2021', '10/08/2021', '16/08/2022', 'en cours','dev games');
	
INSERT INTO public.exercice(
	ref_exercice, annee, datedebut, datefin, statut, titreActivite)
	VALUES (4, '2021', '10/08/2021', '16/08/2022', 'en cours','App security');

INSERT INTO public.exercice(
	ref_exercice, annee, datedebut, datefin, statut, titreActivite)
	VALUES (5, '2021', '10/08/2021', '16/08/2022', 'terminé','objet of things');
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (1, 'participent 1', 'data struct');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (2, 'participent 2', 'java');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (3, 'participent 3', 'bank security');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (4, 'participent 4', 'data struct');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (5, 'participent 5', 'java');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (6, 'participent 6', 'dev mobile');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (7, 'participent 7', 'driver');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (8, 'participent 8', 'objet of things');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (9, 'participent 6', 'dev web');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (10, 'participent 3', 'dev games');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (11, 'participent 2', 'App security');
INSERT INTO public.participentactivite(
	ref_paract, fullnameparticipent, titreactivite)
	VALUES (12, 'participent 1', 'driver');
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

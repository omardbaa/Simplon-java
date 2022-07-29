package model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(name = "employes")
public class Employe {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nom_employe")
		private String nomEmp;
		
		@Column(name = "prenom_employe")
		private String prenomEmp;
		
		@Column(name = "email_employe")
		private String emailEmp;
		
		@Column(name = "telephone_employe")
		private String telEmp;
		
		@Column(name = "salaire_employe")
		private double salaireEmp;
		
		@Column(name = "adresse_employe")
		private String adresseEmp;
		
		@Column(name = "dateNaissance_employe")
		private LocalDate dateNaisEmp;
		
		@Column(name = "statut_employe")
		private String statutEmp;
		
		@Column(name = "role_employe")
		private String roleEmp;
		
		public Employe(String nomEmp, String prenomEmp, String emailEmp, String telEmp, double salaireEmp,
				String adresseEmp, LocalDate dateNaisEmp, String statutEmp, String roleEmp) {
			this.nomEmp = nomEmp;
			this.prenomEmp = prenomEmp;
			this.emailEmp = emailEmp;
			this.telEmp = telEmp;
			this.salaireEmp = salaireEmp;
			this.adresseEmp = adresseEmp;
			this.dateNaisEmp = dateNaisEmp;
			this.statutEmp = statutEmp;
			this.roleEmp = roleEmp;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNomEmp() {
			return nomEmp;
		}
		public void setNomEmp(String nomEmp) {
			this.nomEmp = nomEmp;
		}
		public String getPrenomEmp() {
			return prenomEmp;
		}
		public void setPrenomEmp(String prenomEmp) {
			this.prenomEmp = prenomEmp;
		}
		public String getEmailEmp() {
			return emailEmp;
		}
		public void setEmailEmp(String emailEmp) {
			this.emailEmp = emailEmp;
		}
		public String getTelEmp() {
			return telEmp;
		}
		public void setTelEmp(String telEmp) {
			this.telEmp = telEmp;
		}
		public double getSalaireEmp() {
			return salaireEmp;
		}
		public void setSalaireEmp(double salaireEmp) {
			this.salaireEmp = salaireEmp;
		}
		public String getAdresseEmp() {
			return adresseEmp;
		}
		public void setAdresseEmp(String adresseEmp) {
			this.adresseEmp = adresseEmp;
		}
		public LocalDate getDateNaisEmp() {
			return dateNaisEmp;
		}
		public void setDateNaisEmp(LocalDate dateNaisEmp) {
			this.dateNaisEmp = dateNaisEmp;
		}
		public String getStatutEmp() {
			return statutEmp;
		}
		public void setStatutEmp(String statutEmp) {
			this.statutEmp = statutEmp;
		}
		public String getRoleEmp() {
			return roleEmp;
		}
		public void setRoleEmp(String roleEmp) {
			this.roleEmp = roleEmp;
		}
		@Override
		public String toString() {
			return "Employe [id=" + id + ", nomEmp=" + nomEmp + ", prenomEmp=" + prenomEmp + ", emailEmp=" + emailEmp
					+ ", telEmp=" + telEmp + ", salaireEmp=" + salaireEmp + ", adresseEmp=" + adresseEmp
					+ ", dateNaisEmp=" + dateNaisEmp + ", statutEmp=" + statutEmp + ", roleEmp=" + roleEmp + "]";
		}
		
		

}

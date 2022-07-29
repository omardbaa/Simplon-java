package model;

import jakarta.persistence.*;


@Entity
@Table(name = "administrateur")
public class Administrateur {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nom_admin")
		private String nomAdmin;
		
		@Column(name = "password_Admin")
		private String passwordAdmin;
		
		@Column(name = "email_email")
		private String emailAdmin;

		public Administrateur() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Administrateur(String nomAdmin, String passwordAdmin, String emailAdmin) {
			super();
			this.nomAdmin = nomAdmin;
			this.passwordAdmin = passwordAdmin;
			this.emailAdmin = emailAdmin;
		}

		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNomAdmin() {
			return nomAdmin;
		}

		public void setNomAdmin(String nomAdmin) {
			this.nomAdmin = nomAdmin;
		}

		public String getPasswordAdmin() {
			return passwordAdmin;
		}

		public void setPasswordAdmin(String passwordAdmin) {
			this.passwordAdmin = passwordAdmin;
		}

		public String getEmailAdmin() {
			return emailAdmin;
		}

		public void setEmailAdmin(String emailAdmin) {
			this.emailAdmin = emailAdmin;
		}

		@Override
		public String toString() {
			return "Administrateur [id=" + id + ", nomAdmin=" + nomAdmin + ", passwordAdmin=" + passwordAdmin
					+ ", emailAdmin=" + emailAdmin + "]";
		}

}

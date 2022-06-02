package brief5.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Candidat {

	private  int IdCandidat;
	private  String NomCandidat;
	private  String PrenomCandidat;
	private  String EmailCandidat;
	private  String PassWordCandidat;
	private  String AdresseCandidat;
	private  String Ville_Candidat;
	private  String PaysCandidat;
	


	public Candidat() {
	
	}
	public Candidat(int idCandidat, String nomCandidat, String prenomCandidat, String emailCandidat,
			String passWordCandidat, String adresseCandidat,String Ville_Candidat, String paysCandidat) {
		
		super();
		IdCandidat = idCandidat;
		NomCandidat = nomCandidat;
		PrenomCandidat = prenomCandidat;
		EmailCandidat = emailCandidat;
		PassWordCandidat = passWordCandidat;
		AdresseCandidat = adresseCandidat;
		PaysCandidat = paysCandidat;
	}
	
	
	public int getIdCandidat() {
		return IdCandidat;
	}
	public  void setIdCandidat(int idCandidat) {
		this.IdCandidat = idCandidat;
	}
	public String getNomCandidat() {
		return NomCandidat;
	}
	public  void setNomCandidat(String nomCandidat) {
		this.NomCandidat = nomCandidat;
	}
	public String getPrenomCandidat() {
		return PrenomCandidat;
	}
	public  void setPrenomCandidat(String prenomCandidat) {
		this.PrenomCandidat = prenomCandidat;
	}
	public String getEmailCandidat() {
		return EmailCandidat;
	}
	public  void setEmailCandidat(String emailCandidat) {
		this.EmailCandidat = emailCandidat;
	}
	public String getPassWordCandidat() {
		return PassWordCandidat;
	}
	public void setPassWordCandidat(String passWordCandidat) {
		this.PassWordCandidat = passWordCandidat;
	}
	public String getAdresseCandidat() {
		return AdresseCandidat;
	}
	public  void setAdresseCandidat(String adresseCandidat) {
		this.AdresseCandidat = adresseCandidat;
	}
	
	
	public String getVille_Candidat() {
		return Ville_Candidat;
	}
	public  void setVille_Candidat(String ville_Candidat) {
		this.Ville_Candidat = ville_Candidat;
	}
	public String getPaysCandidat() {
		return PaysCandidat;
	}
	public void setPaysCandidat(String paysCandidat) {
		this.PaysCandidat = paysCandidat;
	}
	@Override
	public String toString() {
		return "Candidat [IdCandidat=" + IdCandidat + ", NomCandidat=" + NomCandidat + ", PrenomCandidat="
				+ PrenomCandidat + ", EmailCandidat=" + EmailCandidat + ", PassWordCandidat=" + PassWordCandidat
				+ ", AdresseCandidat=" + AdresseCandidat + ", Ville_Candidat=" +AdresseCandidat + " ,PaysCandidat=" + PaysCandidat + "]";
	}
	public static void closeConnection(Connection connect) {
		// TODO Auto-generated method stub
		
	}
	public static void closePreparedStatement(PreparedStatement p_S) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}



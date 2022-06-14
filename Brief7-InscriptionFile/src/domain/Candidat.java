package domain;

public class Candidat {
private  int IdCandidat;
private  String NomCandidat;
private  String PrenomCandidat;
private  String EmailCandidat;
private  String AdresseCandidat;
private  String VilleCandidat;
private  String PaysCandidat;



public Candidat() {

}
public Candidat(int idCandidat, String nomCandidat, String prenomCandidat, String emailCandidat, String adresseCandidat,String villeCandidat, String paysCandidat) {
	
	super();
	IdCandidat = idCandidat;
	NomCandidat = nomCandidat;
	PrenomCandidat = prenomCandidat;
	EmailCandidat = emailCandidat;
	AdresseCandidat = adresseCandidat;
    VilleCandidat = villeCandidat;
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

public String getAdresseCandidat() {
	return AdresseCandidat;
}
public  void setAdresseCandidat(String adresseCandidat) {
	this.AdresseCandidat = adresseCandidat;
}


public String getVilleCandidat() {
	return VilleCandidat;
}
public  void setVilleCandidat(String VilleCandidat) {
	this.VilleCandidat = VilleCandidat;
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
			+ PrenomCandidat + ", EmailCandidat=" + EmailCandidat + ""
			+ ", AdresseCandidat=" + AdresseCandidat + ", VilleCandidat=" +VilleCandidat + " ,PaysCandidat=" + PaysCandidat + "]";
}



}



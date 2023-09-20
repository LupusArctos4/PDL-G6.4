package model;

public class CreerEnseignant {
	private String login;
	private String pass;
	private String nom;
	private String prenom;
	private String typeEmploi;
	private String numTel;
	private String matiere;
	
	public CreerEnseignant (String login, String pass, String nom, String prenom, String typeEmploi, String numTel, String matiere) {
		this.login=login;
		this.pass=pass;
		this.nom=nom;
		this.prenom=prenom;
		this.typeEmploi=typeEmploi;
		this.numTel=numTel;
		this.matiere=matiere;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the typeEmploi
	 */
	public String getTypeEmploi() {
		return typeEmploi;
	}
	/**
	 * @param typeEmploi the typeEmploi to set
	 */
	public void setTypeEmploi(String typeEmploi) {
		this.typeEmploi = typeEmploi;
	}
	/**
	 * @return the numTel
	 */
	public String getNumTel() {
		return numTel;
	}
	/**
	 * @param numTel the numTel to set
	 */
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	/**
	 * @return the matiere
	 */
	public String getMatiere() {
		return matiere;
	}
	/**
	 * @param matiere the matiere to set
	 */
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
}
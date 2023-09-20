package model;

public class CreerEtudiant {
	private String login;
	private String pass;
	private String nom;
	private String prenom;
	private String typeEmploi;
	private boolean filiere;
	private String mail;
	
	public CreerEtudiant (String login, String pass, String nom, String prenom, String typeEmploi, boolean filiere, String mail) {
		this.login=login;
		this.pass=pass;
		this.nom=nom;
		this.prenom=prenom;
		this.typeEmploi=typeEmploi;
		this.filiere=filiere;
		this.mail=mail;
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
	 * @return the filiere
	 */
	public boolean isFiliere() {
		return filiere;
	}
	/**
	 * @param filiere the filiere to set
	 */
	public void setFiliere(boolean filiere) {
		this.filiere = filiere;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}

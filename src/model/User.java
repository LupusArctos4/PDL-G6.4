package model;

public class User extends SuperAdmin{
	protected String nom;
	protected String prenom;

	public User (String login, String pass, int util, String nom, String prenom) {
		super(login, pass, util);
		this.nom = nom;
		this.prenom = prenom;
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
}

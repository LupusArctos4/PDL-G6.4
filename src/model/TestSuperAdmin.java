package model;

public class TestSuperAdmin {
	/** 
	 * reference du super admin
	 */
	private int id;		
	/**
	 * nom
	 */
	private String name;	
	/**
	 * prenom
	 */
	private String prenom;		
	/**
	 * email
	 */
	private String email;


	/**
	 * Constructor
	 * @param id identifiant du fournisseur
	 * @param name nom (ou raison sociale)
	 * @param address adresse postale
	 * @param email adresse mail du contact
	 */
	public TestSuperAdmin(int id, String name, String prenom, String email) {
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.email = email;
	}
	
	
	// GETTERS & SETTERS
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	
	/**
	 * Redefinition de la methode toString permettant de definir la traduction de l'objet en String
	 * pour l'affichage dans la console par exemple
	 */
	@Override
	public String toString() {
		return "Fournisseur [ref : " + id + ", " + name + ", " + prenom + ", " + email + "]";
	}
}


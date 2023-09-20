package model;


/**
 * Classe SuperAdmin
 * @author loic
 * @version 1.0
 */
public class SuperAdmin {
	private int id;
	private String login;
	private String pass;
	private int util;
	
	/**
	 * Constructeur d'initialisation
	 */
	public SuperAdmin() {
		this.id = 0;
		this.login = null;
		this.pass = null;
		this.util = 0;
	}
	
	public SuperAdmin(String login, String pass, int utilisateur) {
		this.login = login;
		this.pass = pass;
		this.util = utilisateur;
	}
	
	
	/**
	 * Constructeur c'est celui qu'on utilise
	 * @param id
	 * @param login
	 * @param pass
	 * @param utilisateur
	 */
	public SuperAdmin(int id, String login, String pass, int utilisateur) {
		this.id = id;
		this.login = login;
		this.pass = pass;
		this.util = utilisateur;
	}

	
	
	
	/**
	 * GETTERS & SETTERS
	 */
	
	
	
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
	 * @return the util
	 */
	public int getUtil() {
		return util;
	}

	/**
	 * @param util the util to set
	 */
	public void setUtil(int util) {
		this.util = util;
	}	
}
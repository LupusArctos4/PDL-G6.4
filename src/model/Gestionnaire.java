package model;

public class Gestionnaire extends User{
	private String mailGestio;
	public static int utilGest = 1;
	
	public Gestionnaire(String login, String pass, int util, String nom, String prenom, String mailGestio) {
		super(login, pass, util, nom, prenom);
		this.mailGestio=mailGestio;
	}
	/**
	 * @return the mailGestio
	 */
	public String getMailGestio() {
		return mailGestio;
	}
	/**
	 * @param mailGestio the mailGestio to set
	 */
	public void setMailGestio(String mailGestio) {
		this.mailGestio = mailGestio;
	}
	
}

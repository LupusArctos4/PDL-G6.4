package model;

public class Administration extends User{
	private String mailAdmin;
	public static int utilAdmin = 2;
	
	public Administration (String login, String pass, int util, String nom, String prenom, String mailAdmin) {
		super(login, pass, util, nom, prenom);
		this.mailAdmin=mailAdmin;
	}
	/**
	 * @return the mailAdmin
	 */
	public String getMailAdmin() {
		return mailAdmin;
	}
	/**
	 * @param mailAdmin the mailAdmin to set
	 */
	public void setMailAdmin(String mailAdmin) {
		this.mailAdmin = mailAdmin;
	}
	
}

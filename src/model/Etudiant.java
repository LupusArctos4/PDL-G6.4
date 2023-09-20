package model;

public class Etudiant extends User{
	private int filiereEtudiant; // soit 1 (classique) soit 2 (apprentissage) et ca le verif dans le GUI
	private String mailEtudiant;
	private int nomGroupeEtudiant;
	public static int utilEtu = 4;
	
	public Etudiant (String login, String pass, int util, String nom, String prenom, String mailEtudiant, int filiereEtudiant, int nomGroupeEtudiant){
		super(login, pass, util, nom, prenom);
		this.filiereEtudiant=filiereEtudiant;
		this.mailEtudiant=mailEtudiant;
		this.nomGroupeEtudiant=nomGroupeEtudiant;
	}
	/**
	 * @return the filiereEtudiant
	 */
	public int isFiliereEtudiant() {
		return filiereEtudiant;
	}
	/**
	 * @param filiereEtudiant the filiereEtudiant to set
	 */
	public void setFiliereEtudiant(int filiereEtudiant) {
		this.filiereEtudiant = filiereEtudiant;
	}
	/**
	 * @return the mailEtudiant
	 */
	public String getMailEtudiant() {
		return mailEtudiant;
	}
	/**
	 * @param mailEtudiant the mailEtudiant to set
	 */
	public void setMailEtudiant(String mailEtudiant) {
		this.mailEtudiant = mailEtudiant;
	}
	/**
	 * @return the nomGroupeEtudiant
	 */
	public int getNomGroupeEtudiant() {
		return nomGroupeEtudiant;
	}
	/**
	 * @param nomGroupeEtudiant the nomGroupeEtudiant to set
	 */
	public void setNomGroupeEtudiant(int nomGroupeEtudiant) {
		this.nomGroupeEtudiant = nomGroupeEtudiant;
	}
	
}

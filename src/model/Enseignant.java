package model;

public class Enseignant extends User{
	private String numTelProf;
	private String matiere;
	public static int utilEns = 3;
	private int absence;
	
	public Enseignant (String login, String pass, int utilEns, String nom, String prenom, String numTelProf, String matiere) {
		super(login, pass, utilEns, nom, prenom);
		this.matiere=matiere;
		this.numTelProf=numTelProf;
	}
	
	public Enseignant (String login, String pass, int utilEns, String nom, String prenom, String numTelProf, String matiere, int absence) {
		super(login, pass, utilEns, nom, prenom);
		this.matiere=matiere;
		this.numTelProf=numTelProf;
		this.absence=absence;
	}
	
	/**
	 * method de display de l'enseignant
	 */
	public void diplay() {
		System.out.println(getLogin());
		System.out.println(getPass());
		System.out.println(getUtil());
		System.out.println(getNom());
		System.out.println(getPrenom());
		System.out.println(this.numTelProf);
		System.out.println(this.matiere);
	}
	
	/**
	 * @return the numTelProf
	 */
	public String getNumTelProf() {
		return numTelProf;
	}
	/**
	 * @param numTelProf the numTelProf to set
	 */
	public void setNumTelProf(String numTelProf) {
		this.numTelProf = numTelProf;
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

	public int getAbsence() {
		return absence;
	}

	public void setAbsence(int absence) {
		this.absence = absence;
	}
	
}

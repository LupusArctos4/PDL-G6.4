package model;

public class Absence {
	private SuperAdmin sa;
	private Cours cours;
	private String nomAbs;
	private String dateAbs;
	private int justifierAbs = 0; //0 ou 1 d'apres la BDD
	
	/**
	 * Constructor celui pour initialiser
	 */
	public Absence() {
		this.sa=null;
		this.nomAbs=null;
		this.dateAbs=null;
	}
	
	/**
	 * Constructeur celui qu'on va utiliser
	 * @param etu
	 * @param nomAbs
	 * @param dateAbs
	 * @param justifierAbs
	 */
	public Absence (SuperAdmin sa, String nomAbs, String dateAbs){
		this.sa=sa;
		this.nomAbs=nomAbs;
		this.dateAbs=dateAbs;
	}
	
	/**
	 * Constructeur plus pousser donc plus long a programme
	 * @param etu
	 * @param cours
	 * @param nomAbs
	 * @param dateAbs
	 * @param justifierAbs
	 */
	public Absence(SuperAdmin sa, Cours cours, String nomAbs, String dateAbs, int justifierAbs){
		this.sa=sa;
		this.cours=cours;
		this.nomAbs=nomAbs;
		this.dateAbs=dateAbs;
		this.justifierAbs=justifierAbs;
	}
	/**
	 * @return the etu
	 */
	public SuperAdmin getSA() {
		return sa;
	}
	/**
	 * @param etu the etu to set
	 */
	public void setSA(SuperAdmin sa) {
		this.sa = sa;
	}
	/**
	 * @return the cours
	 */
	public Cours getCours() {
		return cours;
	}
	/**
	 * @param cours the cours to set
	 */
	public void setCours(Cours cours) {
		this.cours = cours;
	}
	/**
	 * @return the nomAbs
	 */
	public String getNomAbs() {
		return nomAbs;
	}
	/**
	 * @param nomAbs the nomAbs to set
	 */
	public void setNomAbs(String nomAbs) {
		this.nomAbs = nomAbs;
	}
	/**
	 * @return the dateAbs
	 */
	public String getDateAbs() {
		return dateAbs;
	}
	/**
	 * @param dateAbs the dateAbs to set
	 */
	public void setDateAbs(String dateAbs) {
		this.dateAbs = dateAbs;
	}
	/**
	 * @return the justifierAbs
	 */
	public int getJustifierAbs() {
		return justifierAbs;
	}
	/**
	 * @param justifierAbs the justifierAbs to set
	 */
	public void setJustifierAbs(int justifierAbs) {
		this.justifierAbs = justifierAbs;
	}
	
	
}

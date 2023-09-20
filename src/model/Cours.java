package model;

public class Cours {
	private Enseignant ens;
	private GroupeEtudiant grpEtu;
	private String nomCours;
	private double nbHeureCours;
	private String typeCours;
	
	public Cours (String nomCours, double nbHeureCours, String typeCours) {
		this.nomCours = nomCours;
		this.nbHeureCours = nbHeureCours;
		this.typeCours = typeCours;
	}
	/**
	 * @return the ens
	 */
	public Enseignant getEns() {
		return ens;
	}
	/**
	 * @param ens the ens to set
	 */
	public void setEns(Enseignant ens) {
		this.ens = ens;
	}
	/**
	 * @return the grpEtu
	 */
	public GroupeEtudiant getGrpEtu() {
		return grpEtu;
	}
	/**
	 * @param grpEtu the grpEtu to set
	 */
	public void setGrpEtu(GroupeEtudiant grpEtu) {
		this.grpEtu = grpEtu;
	}
	/**
	 * @return the nomCours
	 */
	public String getNomCours() {
		return nomCours;
	}
	/**
	 * @param nomCours the nomCours to set
	 */
	public void setNomCours(String nomCours) {
		this.nomCours = nomCours;
	}
	/**
	 * @return the nbHeureCours
	 */
	public double getNbHeureCours() {
		return nbHeureCours;
	}
	/**
	 * @param nbHeureCours the nbHeureCours to set
	 */
	public void setNbHeureCours(double nbHeureCours) {
		this.nbHeureCours = nbHeureCours;
	}
	/**
	 * @return the typeCours
	 */
	public String getTypeCours() {
		return typeCours;
	}
	/**
	 * @param typeCours the typeCours to set
	 */
	public void setTypeCours(String typeCours) {
		this.typeCours = typeCours;
	}
	
}

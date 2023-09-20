package model;

import java.util.ArrayList;

public class GroupeEtudiant {
	private ArrayList<Etudiant> listEtu; 
	private int numeroGrpEtudiant;
	private int capMaxGrp;
	
	public GroupeEtudiant(int numeroGrpEtudiant, int capMaxGrp) {
		listEtu= new ArrayList<>();
		this.numeroGrpEtudiant=numeroGrpEtudiant;
		this.capMaxGrp=capMaxGrp;
	}
	/**
	 * @return the listEtu
	 */
	public ArrayList<Etudiant> getListEtu() {
		return listEtu;
	}
	/**
	 * @param listEtu the listEtu to set
	 */
	public void setListEtu(ArrayList<Etudiant> listEtu) {
		this.listEtu = listEtu;
	}
	/**
	 * @return the numeroGrpEtudiant
	 */
	public int getNumeroGrpEtudiant() {
		return numeroGrpEtudiant;
	}
	/**
	 * @param numeroGrpEtudiant the numeroGrpEtudiant to set
	 */
	public void setNumeroGrpEtudiant(int numeroGrpEtudiant) {
		this.numeroGrpEtudiant = numeroGrpEtudiant;
	}
	/**
	 * @return the capMaxGrp
	 */
	public int getCapMaxGrp() {
		return capMaxGrp;
	}
	/**
	 * @param capMaxGrp the capMaxGrp to set
	 */
	public void setCapMaxGrp(int capMaxGrp) {
		this.capMaxGrp = capMaxGrp;
	}
	
}

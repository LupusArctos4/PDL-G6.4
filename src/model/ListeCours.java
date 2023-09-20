package model;

import java.util.ArrayList;

public class ListeCours {
	private ArrayList<Cours> listeCours;
	
	public ListeCours () {
		listeCours = new ArrayList<Cours>(); 
	}
	/**
	 * @return the listeCours
	 */
	public ArrayList<Cours> getListeCours() {
		return listeCours;
	}
	/**
	 * @param listeCours the listeCours to set
	 */
	public void setListeCours(ArrayList<Cours> listeCours) {
		this.listeCours = listeCours;
	}
	public void display() {
		System.out.println("La liste des cours est :" + listeCours);
	}
}

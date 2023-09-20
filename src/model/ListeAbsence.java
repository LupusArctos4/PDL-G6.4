package model;

import java.util.ArrayList;

public class ListeAbsence {
	private ArrayList<Absence> listAbs;
	
	public ListeAbsence () {
		listAbs = new ArrayList<>();
	}
	/**
	 * @return the listAbs
	 */
	public ArrayList<Absence> getListAbs() {
		return listAbs;
	}
	/**
	 * @param listAbs the listAbs to set
	 */
	public void setListAbs(ArrayList<Absence> listAbs) {
		this.listAbs = listAbs;
	}

}

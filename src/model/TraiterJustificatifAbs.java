package model;

public class TraiterJustificatifAbs {
	private SuperAdmin sa;
	private Absence abs;
	
	public TraiterJustificatifAbs(SuperAdmin sa, Absence abs){
		this.sa = sa;
		this.abs=abs;
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
	 * @return the abs
	 */
	public Absence getAbs() {
		return abs;
	}

	/**
	 * @param abs the abs to set
	 */
	public void setAbs(Absence abs) {
		this.abs = abs;
	}
	
}

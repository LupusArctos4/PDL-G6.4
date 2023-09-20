package model;

public class PenaliteAbs {
	private Quota quota;
	private Absence abs;
	private Etudiant etu;
	private int nbHeureQuota;
	
	public PenaliteAbs (Quota quota, Absence abs, Etudiant etu, int nbHeureQuota) {
		this.quota = quota;
		this.abs=abs;
		this.etu=etu;
		this.nbHeureQuota=nbHeureQuota;
	}
	public int attributionZero (Absence abs) {
		if(abs.getJustifierAbs()==0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	public void limiteDepasser () {
		if (this.nbHeureQuota>this.quota.getNbHQuota()) {
			double a = nbHeureQuota-quota.getNbHQuota();
			System.out.println("La limite d'absence � �t� d�passer de :" + a);
		}
		else {
			System.out.println("La limite d'abscence n'est pas d�pass�e");
		}
	}
	/**
	 * @return the quota
	 */
	public Quota getQuota() {
		return quota;
	}
	/**
	 * @param quota the quota to set
	 */
	public void setQuota(Quota quota) {
		this.quota = quota;
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
	/**
	 * @return the etu
	 */
	public Etudiant getEtu() {
		return etu;
	}
	/**
	 * @param etu the etu to set
	 */
	public void setEtu(Etudiant etu) {
		this.etu = etu;
	}
	/**
	 * @return the nbHeureQuota
	 */
	public int getNbHeureQuota() {
		return nbHeureQuota;
	}
	/**
	 * @param nbHeureQuota the nbHeureQuota to set
	 */
	public void setNbHeureQuota(int nbHeureQuota) {
		this.nbHeureQuota = nbHeureQuota;
	}
	
}


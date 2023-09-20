package model;

public class Quota {
	private int nbHQuota;
	private double penaliteQuota;
	
	public Quota (int nbHQuota, double penaliteQuota) {
		this.nbHQuota=nbHQuota;
		this.penaliteQuota=penaliteQuota;
	}
	/**
	 * @return the nbHQuota
	 */
	public int getNbHQuota() {
		return nbHQuota;
	}
	/**
	 * @param nbHQuota the nbHQuota to set
	 */
	public void setNbHQuota(int nbHQuota) {
		this.nbHQuota = nbHQuota;
	}
	/**
	 * @return the penaliteQuota
	 */
	public double getPenaliteQuota() {
		return penaliteQuota;
	}
	/**
	 * @param penaliteQuota the penaliteQuota to set
	 */
	public void setPenaliteQuota(double penaliteQuota) {
		this.penaliteQuota = penaliteQuota;
	}
	
}

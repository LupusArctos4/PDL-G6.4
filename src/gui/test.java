package gui;

import java.lang.*;
import java.sql.*;
import java.util.ArrayList;
// a voir pour le model
import model.*;


public class test {

	public static void main(String[] args) {
		String nom = "Dupont";
		String prenom = "Jean";
		//ENLEVER LES MAJUSCULES
		String login = nom + "." + prenom;
		String numTel = "0785146215";
		String pass = "ens" + numTel;
		String matiere = "Java";
		Enseignant ens = new Enseignant(login, pass, Enseignant.utilEns, nom, prenom, numTel, matiere);
		ens.diplay();
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		String[] login = {"gest", "admin", "ens", "etudiant"};
//		System.out.println(login[1]);
//		
//		
//		
//		// pour les test et ne pas ouvrir la bdd
//		String[] loginPreset = {"gest", "admin", "ens", "etudiant"};
//		
//		// char a verifier pour savoir quel type d'utilisateur c'est
//		String[] loginVerif = {"ges", "adm", "ens", "etu"};
		
		// recuperer les 3 premiers char du login
		//String char3 = "";
		//char3 = login.substring(0,3);
		// TEST 
		/*String char3gest = "";
		char3gest = loginPreset[0].substring(0,3);*/
		/*String char3admi = "";
		char3admi = loginPreset[1].substring(0,3);
		String char3ense = "";
		char3ense = loginPreset[2].substring(0,3);
		String char3etud = "";
		char3etud = loginPreset[3].substring(0,3);*/
		
		
		// verification login
		/*for (int i=0; i<4; i++) {
			if (char3gest.equals(loginVerif[i])) {
				System.out.println("bien maintenant ouvre l\'IHM");
			}
		}*/
		
		
	}
	/*public void getUtil(String login) {
		Connection con = null;
		PreparedStatment ps = null;
		ResultSet rs = null;
		
		// trouver par quoi le remplacer le type
		SuperAdmin returnValue = null;
		
		String resquest = "SELECT util_auth FROM authentification WHERE login = ?";

		// connexion a la base de donnees
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM supplier WHERE id = ?");
			ps.setInt(1, id);

			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps.executeQuery();
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				//System.out.println(rs.getInt("id"));
				returnValue = new SuperAdmin(rs.getInt("id"),
									       rs.getString("name"),
									       rs.getString("address"),
									       rs.getString("email"));
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// fermeture du ResultSet, du PreparedStatement et de la Connexion
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception ignore) {
			}
		}
		return returnValue;

	
	}*/
		
	/**
	 * Permet de recuperer un fournisseur a partir de sa reference
	 * 
	 * @param reference la reference du fournisseur a recuperer
	 * @return le fournisseur trouve;
	 * 			null si aucun fournisseur ne correspond a cette reference
	 */
	/*public Supplier get(int id) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Supplier returnValue = null;

		// connexion a la base de donnees
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM supplier WHERE id = ?");
			ps.setInt(1, id);

			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps.executeQuery();
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				//System.out.println(rs.getInt("id"));
				returnValue = new Supplier(rs.getInt("id"),
									       rs.getString("name"),
									       rs.getString("address"),
									       rs.getString("email"));
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			// fermeture du ResultSet, du PreparedStatement et de la Connexion
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception ignore) {
			}
		}
		return returnValue;
	}*/
	
		
		
}

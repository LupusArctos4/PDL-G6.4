package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import guiGestionnaire.*;
import model.Enseignant;
import model.SuperAdmin;

public class Lot1EnseignantDAO extends ConnectionDAO {
	
	
	/**
	 * Constructor
	 */
	public Lot1EnseignantDAO() {
		super();
	}
	
	
	/**
	 * Permet d'ajouter un enseignant
	 * @param enseignant
	 * @return
	 */
	public int addLot1Enseignant(Enseignant Lot1enseignant) {
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
				
		int ensLoginPass = 0;
		PreparedStatement ps2 = null;
		ResultSet rs = null;
		
		int returnValuePS = 0;
		int returnValuePS1 = 0;
		int returnValuePS2 = 0;

		// connexion a la base de donnees
		try {

			// tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// preparation de l'instruction SQL, chaque ? represente une valeur
			// a communiquer dans l'insertion.
			// les getters permettent de recuperer les valeurs des attributs souhaites
			
			
			ps1 = con.prepareStatement("INSERT INTO authentification(login_auth, pass_auth, util_auth) VALUES (?,?,?)");
			//String loginSet = enseignant.getNom() + "." + enseignant.getPrenom();
			//String passSet = "ens" + enseignant.getNumTelProf();
			ps1.setString(1, Lot1enseignant.getLogin()); //loginSet);
			ps1.setString(2, Lot1enseignant.getPass()); //passSet);
			ps1.setInt(3,  Enseignant.utilEns);
			
			// Execution de la requete
			returnValuePS1 = ps1.executeUpdate();
			
			ps2 = con.prepareStatement("SELECT id_auth FROM authentification WHERE login_auth = ?");
			ps2.setString(1, Lot1enseignant.getLogin()); //loginSet);
			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps2.executeQuery();	
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				ensLoginPass = rs.getInt("id_auth");
			}
			
			// Execution de la requete
			returnValuePS2 = ps2.executeUpdate();
			
			ps = con.prepareStatement("INSERT INTO enseignantl1(noml1, prenoml1, numtell1, matierel1, loginpass_ensl1) VALUES (?,?,?,?,?)");
			ps.setString(1, Lot1enseignant.getNom());
			ps.setString(2, Lot1enseignant.getPrenom());
			ps.setString(3, Lot1enseignant.getNumTelProf());
			ps.setString(4, Lot1enseignant.getMatiere());
			ps.setInt(5, ensLoginPass);
			

			// Execution de la requete
			returnValuePS = ps.executeUpdate();

		} catch (Exception e) {
			if (e.getMessage().contains("ORA-00001"))
				System.out.println("Une erreur est survenue !");
			else
				e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
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
			try {
				if (ps1 != null) {
					ps1.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (ps2 != null) {
					ps2.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception ignore) {
			}
		}
		return returnValuePS;
	}
	
	
	
	
	
	/*
	 * 	Cette fonctionnalité n'est pas fonctionnel !
	 */
	public int update(Enseignant enseignant) {
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
				
		int ensLoginPass = 0;
		PreparedStatement ps2 = null;
		ResultSet rs = null;
		
		int returnValuePS = 0;
		int returnValuePS1 = 0;
		int returnValuePS2 = 0;

		// connexion a la base de donnees
		try {

			// tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// preparation de l'instruction SQL, chaque ? represente une valeur
			// a communiquer dans l'insertion.
			// les getters permettent de recuperer les valeurs des attributs souhaites
			
			
			ps1 = con.prepareStatement("UPDATE authentification set login_auth = ?, pass_auth = ? WHERE id_auth = ?");
			//String loginSet = enseignant.getNom() + "." + enseignant.getPrenom();
			//String passSet = "ens" + enseignant.getNumTelProf();
			ps1.setString(1, enseignant.getLogin()); //loginSet);
			ps1.setString(2, enseignant.getPass()); //passSet);
			ps1.setInt(3,  enseignant.getId());
			
			// Execution de la requete
			returnValuePS1 = ps1.executeUpdate();
			
			ps2 = con.prepareStatement("SELECT id_auth FROM authentification WHERE login_auth = ?");
			ps2.setString(1, enseignant.getLogin()); //loginSet);
			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps2.executeQuery();	
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				ensLoginPass = rs.getInt("id_auth");
			}
			
			// Execution de la requete
			returnValuePS2 = ps2.executeUpdate();
			
			ps = con.prepareStatement("UPDATE enseignant set nom = ?, prenom = ?, numtel = ?, matiere = ? WHERE loginpass_ens = ?");
			ps.setString(1, enseignant.getNom());
			ps.setString(2, enseignant.getPrenom());
			ps.setString(3, enseignant.getNumTelProf());
			ps.setString(4, enseignant.getMatiere());
			ps.setInt(5, enseignant.getId());
			ps.setInt(6, ensLoginPass);
			

			// Execution de la requete
			returnValuePS = ps.executeUpdate();

		} catch (Exception e) {
			if (e.getMessage().contains("ORA-00001"))
				System.out.println("Une erreur est survenue !");
			else
				e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
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
			try {
				if (ps1 != null) {
					ps1.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (ps2 != null) {
					ps2.close();
				}
			} catch (Exception ignore) {
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception ignore) {
			}
		}
		return returnValuePS;
	}
	
	
	
	/*
	 * 	Cette fonctionnalité n'est pas fonctionnel !
	 */
	public int delete(String loginAuth, String passAuth) {
		Connection con = null;
		PreparedStatement ps = null;
		int returnValue = 0;

		// connexion a la base de donnees
		try {

			// tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			// preparation de l'instruction SQL, le ? represente la valeur de l'ID
			// a communiquer dans la suppression.
			// le getter permet de recuperer la valeur de l'ID du fournisseur
			ps = con.prepareStatement("DELETE FROM authentification WHERE login_auth = ? AND pass_auth = ?");
			ps.setString(1, loginAuth);
			ps.setString(2, passAuth);

			// Execution de la requete
			returnValue = ps.executeUpdate();
			System.out.println(returnValue);
		} catch (Exception e) {
			if (e.getMessage().contains("ORA-02292"))
				System.out.println("Une erreur est survenue !");
			else
				e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
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
	}
	
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Gestionnaire;
import model.Administration;

/**
 * classe qui permet d'ajouter des gestionnaires et des personnels administration
 * @author faucq
 *
 */

public class SuperAdminDAO extends ConnectionDAO {

	
	/**
	 * Constructor
	 */
	public SuperAdminDAO() {
		super();
	}
	
	/**
	 * Ajouter un gestionnaire
	 * @param gest
	 * @return
	 */
	public int addGestionnaire(Gestionnaire gest) {
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
				
		int gestLoginPass = 0;
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
			ps1.setString(1, gest.getLogin()); //loginSet);
			ps1.setString(2, gest.getPass()); //passSet);
			ps1.setInt(3,  gest.utilGest);
			
			// Execution de la requete
			returnValuePS1 = ps1.executeUpdate();
			
			ps2 = con.prepareStatement("SELECT id_auth FROM authentification WHERE login_auth = ?");
			ps2.setString(1, gest.getLogin()); //loginSet);
			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps2.executeQuery();	
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				gestLoginPass = rs.getInt("id_auth");
			}
			
			// Execution de la requete
			returnValuePS2 = ps2.executeUpdate();
			
			ps = con.prepareStatement("INSERT INTO gestionnaire(nom, prenom, email, loginpass_gest) VALUES (?,?,?,?)");
			ps.setString(1, gest.getNom());
			ps.setString(2, gest.getPrenom());
			ps.setString(3, gest.getMailGestio());
			ps.setInt(4, gestLoginPass);
			

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
				if (rs != null) {
					rs.close();
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
				if (ps1 != null) {
					ps1.close();
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
		return returnValuePS;
	}
	
	
	/**
	 * Ajouter du personnel d'administration
	 * @param admin
	 * @return
	 */
	public int addAdministration(Administration admin) {
		Connection con = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
				
		int adminLoginPass = 0;
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
			ps1.setString(1, admin.getLogin()); //loginSet);
			ps1.setString(2, admin.getPass()); //passSet);
			ps1.setInt(3,  admin.utilAdmin);
			
			// Execution de la requete
			returnValuePS1 = ps1.executeUpdate();
			
			ps2 = con.prepareStatement("SELECT id_auth FROM authentification WHERE login_auth = ?");
			ps2.setString(1, admin.getLogin()); //loginSet);
			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps2.executeQuery();	
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				adminLoginPass = rs.getInt("id_auth");
			}
			
			// Execution de la requete
			returnValuePS2 = ps2.executeUpdate();
			
			ps = con.prepareStatement("INSERT INTO administration(nom, prenom, email, loginpass_adm) VALUES (?,?,?,?)");
			ps.setString(1, admin.getNom());
			ps.setString(2, admin.getPrenom());
			ps.setString(3, admin.getMailAdmin());
			ps.setInt(4, adminLoginPass);
			

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
				if (rs != null) {
					rs.close();
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
				if (ps1 != null) {
					ps1.close();
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
		return returnValuePS;
	}
}

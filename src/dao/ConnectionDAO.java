package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.SuperAdmin;

/**
 * Classe d'acces a la base de donnees
 * 
 * @author groupe 4 PDL
 * @version 1.0
 * */
public class ConnectionDAO {
	/**
	 * Parametres de connexion a la base de donnees oracle
	 * URL, LOGIN et PASS sont des constantes
	 */
	// � utiliser si vous �tes sur une machine personnelle :
	final static String URL   = "jdbc:oracle:thin:@oracle.esigelec.fr:1521:orcl";
	
	// � utiliser si vous �tes sur une machine de l'�cole :
	//final static String URL   = "jdbc:oracle:thin:@//srvoracledb.intranet.int:1521/orcl.intranet.int";

	
	/*
	 * Connection BDD Loic
	 */
	//final static String LOGIN = "C##BDD6_14";   // remplacer les ********. Exemple C##BDD1_1
	//final static String PASS  = "BDD614";   // remplacer les ********. Exemple BDD11
	
	/*
	 * Connection BDD Ywen
	 */
	final static String LOGIN = "C##BDD6_14";
	final static String PASS  = "BDD614";
	
	
	/**
	 * Constructor
	 * 
	 */
	public ConnectionDAO() {
		// chargement du pilote de bases de donnees
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.err.println("Impossible de charger le pilote de BDD, ne pas oublier d'importer le fichier .jar dans le projet"
					+ "et de bien verifier qu'il n'y en a qu'un !!!");
		}
	}
	
	/**
	 * permet de recup le superadmin a partir du login
	 * @param login
	 * @return
	 */
	public SuperAdmin get(String login) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		SuperAdmin sa = null;
		// connexion a la base de donnees
		try {

			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM authentification WHERE login_auth = ?");
			
			ps.setString(1, login);

			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			rs = ps.executeQuery();
			// passe a la premiere (et unique) ligne retournee
			if (rs.next()) {
				sa = new SuperAdmin(rs.getInt("id_auth"),
									rs.getString("login_auth"),
									rs.getString("pass_auth"),
									rs.getInt("util_auth"));
				
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
		return sa;
	}
	
}

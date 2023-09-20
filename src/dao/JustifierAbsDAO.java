package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JustifierAbsDAO extends ConnectionDAO{

	/**
	 * Constructor
	 */
	public JustifierAbsDAO() {
		super();
	}
	
	public int justifierAbs() {
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
			
			
			ps1 = con.prepareStatement("SELECT");
			
			
			
			

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

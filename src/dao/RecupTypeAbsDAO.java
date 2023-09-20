package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.TypeAbsence;

public class RecupTypeAbsDAO extends ConnectionDAO {
	
	/**
	 * Constructor
	 */
	public RecupTypeAbsDAO() {
		super();
	}
	
	
	public ArrayList<TypeAbsence> recupTypeAbsence() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<TypeAbsence> typeAbsList = new ArrayList<>();
		PreparedStatement ps1 = null;
		// faire recherche avec debug
		//en ouvrant et fermant la bdd
		// en testant plsueirus requette
		
		// connexion a la base de donnees
		try {

			// tentative de connexion
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM typeAbsence");
			ps1 = con.prepareStatement("SELECT nom_typeAbs FROM typeAbsence");
			System.out.println(ps.toString());
			// on execute la requete
			// rs contient un pointeur situe juste avant la premiere ligne retournee
			try {
				rs = ps1.executeQuery();
				System.out.println("try");
			}
			catch (Exception ignore) {
				System.out.println("catch");
			}
			System.out.println(rs.getString(0));
			// passe a la premiere (et unique) ligne retournee
			while (rs.next()) {
				System.out.println(2);
				System.out.println(rs.getString("nom_typeAbs"));
				
				String nomType = rs.getString("nom_typeAbs");
				TypeAbsence typeAbs = new TypeAbsence(nomType);
				typeAbsList.add(typeAbs);
				//typeAbsList.add(new TypeAbsence(rs.getString("nom_typeAbs")));
			}

		} catch (Exception e) {
			if (e.getMessage().contains("ORA-02292"))
				System.out.println("Une erreur est survenue !");
			else
				e.printStackTrace();
		} finally {
			// fermeture du preparedStatement et de la connexion
			try {
				if (rs != null) {
					rs.close();
					System.out.println("nnnul");
				}
			} catch (Exception ignore) {
				System.out.println("nul");
			}
			try {
				if (ps != null) {
					ps.close();
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
		
		return typeAbsList;
	}
}

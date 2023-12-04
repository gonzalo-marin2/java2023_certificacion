package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import model.Nadador;

public class NadadoresService {
	String cadenaCon="jdbc:mysql://localhost:3306/formacion";
	String user="root";
	String pwd="root";
	
	public boolean guardarNadador(Nadador nadador) {
		try(Connection con=DriverManager.getConnection(cadenaCon, user, pwd);){
			//instrucción sql parametrizada, las interrogantes son parámetros
			String sql="insert into nadadores (nombre,tiempo) values (?,?) ";
			//se crea el PreparedStatement a partir de la sql
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, nadador.getNombre());
			ps.setDouble(2, nadador.getTiempo());
			ps.execute();
			return true;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	public boolean guardarNadador(String nombre, double tiempo) {
		try(Connection con=DriverManager.getConnection(cadenaCon, user, pwd);){
			//instrucción sql parametrizada, las interrogantes son parámetros
			String sql="insert into nadadores (nombre,tiempo) values (?,?) ";
			//se crea el PreparedStatement a partir de la sql
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, nombre);
			ps.setDouble(2, tiempo);
			ps.execute();
			return true;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}

}

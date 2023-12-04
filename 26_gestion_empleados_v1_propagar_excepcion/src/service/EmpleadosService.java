package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import exceptions.ModificacionException;
import model.Empleado;

public class EmpleadosService {
	String cadenaCon="jdbc:mysql://localhost:3306/empresa";
	String user="root";
	String pwd="root";

	public boolean altaEmpleado(Empleado empleado) {
		
		try(Connection con=DriverManager.getConnection(cadenaCon, user, pwd);){
			//Ejecución de la sentencia sql(Paso 3)
			/*String sql="insert into empleados (nombre,email,departamento,salario) ";
			sql+="values( '"+empleado.getNombre()+"','"+empleado.getEmail()+"','"+empleado.getDepartamento()+"','"+empleado.getSalario()+"')";
			Statement st=con.createStatement();//Creamos el objeto Statement
			st.execute(sql);//ejecutamos la sentencia sql
			return true;*/
			
			//Opción con PreparedStatement
			//instrucción sql parametrizada, las interrogantes son parámetros
			String sql="insert into empleados (nombre,email,departamento,salario) values (?,?,?,?) ";
			//se crea el PreparedStatement a partir de la sql
			PreparedStatement ps=con.prepareStatement(sql);
			//sustituimos parámetros por valores
			ps.setString(1, empleado.getNombre());
			ps.setString(2, empleado.getEmail());
			ps.setString(3, empleado.getDepartamento());
			ps.setDouble(4, empleado.getSalario());
			ps.execute();
			return true;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}	
	}
	
	//eliminar empleados por email
	
	public boolean eliminarEmpleado(String email) {
		try(Connection con=DriverManager.getConnection(cadenaCon, user, pwd);){
			String sql="delete from empleados where email=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ps.execute();
			return true;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	//modificar salario de empleado: se recibe el idEmpleado y el nuevo salario
	public void modificarSalario(double nuevoSalario, int idEmpleado) throws ModificacionException {//aquí se propaga la excepción
		try(Connection con=DriverManager.getConnection(cadenaCon, user, pwd);){
			String sql="update empleados set salario=? where idEmpleado=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDouble(1, nuevoSalario);
			ps.setInt(2, idEmpleado);
			ps.execute();
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			String m;
			switch(ex.getErrorCode()) {
			case 100:
				m="error sql de código 100";
				break;
			case 200:
				m="error sql de código 200";
				break;
			default:
				m="error no determinado";
			}
			throw new ModificacionException(m);//aquí se lanza
			//hemos creado la clase ModificacionException
			//vamos a crear una excepción de una clase
		}
	}
	
}

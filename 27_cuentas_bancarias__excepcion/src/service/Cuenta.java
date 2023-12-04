package service;

import exceptions.SaldoNegativoException;

//Esta es la clase original.
//Vía herencia, debemos crear una clase nueva llamada CuentaLimit
//CuentaLimit incorporará un atributo "limite", para limitar la extracción a dicho valor
//No permite extraer o ingresar una cantidad mayor del límite
//Dispondrá de un método "ajustarLimite()" que fijará el límite en la mitad del saldo

public class Cuenta {
	private String codigoCuenta;
	private double saldo;
	public Cuenta(String codigoCuenta, double saldo) {
		this.codigoCuenta = codigoCuenta;
		this.saldo = saldo;
	}
	public Cuenta(String codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
		this.saldo=50;
	}
	
	//métodos
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public void extraer(double cantidad) throws SaldoNegativoException {
		if(saldo>=cantidad) {
			saldo-=cantidad;
		}else {
			throw new SaldoNegativoException();//provocamos la excepción si el saldo es menor que la cantidad
		}
			
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}

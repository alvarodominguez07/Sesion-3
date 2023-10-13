package pkg;

import java.util.List;

public class Cuenta {

	private double Saldo;
	private String titular;
	private String Numero;
	public List <Movimiento> mMovimientos;
	
	
	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(Movimiento mMovimientos) {
		this.mMovimientos.add(mMovimientos);
	}

	public Cuenta(double saldo, String numero) {
		super();
		Saldo = saldo;
		Numero = numero;
		
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {		
		this.Saldo = saldo;
	}

	public void ingresar(double i) {
		
	}

	public void reintegro(double i) {
		
	}

}

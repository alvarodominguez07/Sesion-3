package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private double Saldo;
	private String titular;
	private String Numero;
	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}
	List <Movimiento> mMovimientos;
	
	
	
	public Cuenta(double saldo, String titular, String numero) {
		super();
		Saldo = saldo;
		this.titular = titular;
		Numero = numero;
		this.mMovimientos=new ArrayList<>();
	}

	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}

	public void setmMovimientos(Movimiento mMovimientos) {
		this.mMovimientos.add(mMovimientos);
	}

	

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {		
		this.Saldo = saldo;
	}

	public void ingresar(double i) {
		mMovimientos.add(new Movimiento(i,Movimiento.signo.H));
		
	}

	public void reintegro(double i) {
		mMovimientos.add(new Movimiento(i,Movimiento.signo.D));
		
	}
	public double saldofinal() {

		double saldofin = Saldo;
		System.out.println("Saldo inicial " + Saldo + " €");
		for (Movimiento m : mMovimientos) {
			if(m.getDetalle()=="H")
			{
				System.out.println("Ingreso de : "+m.getImporte());
				saldofin=saldofin+m.getImporte();
			}
			else if(m.getDetalle()=="D")
			{
				
				if(saldofin-m.getImporte()>=-500)
				{
					System.out.println("Reintegro de : "+m.getImporte());
					saldofin=saldofin-m.getImporte();
				}
				else
				{
					System.out.println("Reintegro rechazado para la cuenta "+Numero+", dispone de "+saldofin+", e intenta sacar "+m.getImporte()+"€");
				    saldofin=-500;
				}
				
			}
			else
			{return -1;}
			
		}
		System.out.println("Saldo final : "+saldofin+"€");
		return saldofin;
		}
}

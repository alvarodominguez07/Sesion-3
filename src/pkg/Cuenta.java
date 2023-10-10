package pkg;

public class Cuenta {

	private double Saldo;
	
	public Cuenta(double saldo) {
		super();
		Saldo = saldo;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {		
		this.Saldo = saldo;
	}

	public void ingresar(double i) {
		this.setSaldo(this.getSaldo()+i);		
	}

	public void reintegro(double i) {
		if(this.getSaldo()>=i)
		this.setSaldo(this.getSaldo()-i);	
		
		else
			System.out.println("Saldo insuficiente");
	}

}

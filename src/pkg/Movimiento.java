package pkg;

public class Movimiento {
	private double importe;
	public enum signo{D, H};
	private String detalle;
	
	public Movimiento(double importe, signo s) {
		super();
		this.importe = importe;
		if(s==signo.D)
		{
			this.detalle="D";
		}
		else
		{
			this.detalle="H";
		}
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
}

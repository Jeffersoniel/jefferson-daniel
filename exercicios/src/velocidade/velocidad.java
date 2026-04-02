package velocidade;

public class velocidad {

	private double vel;

	public velocidad (double vel){
		setVel(vel);
	}
	
	
	public double getVel() {
		return vel;
	}

	public void setVel(double vel) {
		if (vel <= 0 && vel > 20) {
		throw new IllegalArgumentException("Valor invalido");
		}
		this.vel = vel;
	}
}
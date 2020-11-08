package entities;

public class fisica extends Contribuentes {

	
	private double gastosSaude;

	public fisica(String name, double renda, double gastosSaude) {
		super(name, renda);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double taxa() {
		if (getRenda() < 20000) {
		return getRenda() * 0.15 - gastosSaude * 0.5;
	}
		else { 
			return getRenda() * 0.25 - gastosSaude * 0.5;
	
	
	
	}
	}
}
	


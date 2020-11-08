package entities;

public class juridica extends Contribuentes {
	private int numeroFuncionarios;

	public juridica(String name, double renda, int numeroFuncionarios) {
		super(name, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double taxa() {
		if (getNumeroFuncionarios() < 10) {
		return getRenda() * 0.16;
	}
		else { 
			return getRenda() * 0.14;
	
	
	
	}
	}
	
}

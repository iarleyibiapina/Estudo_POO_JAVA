package classe_abstrata;

public abstract class Veiculo {
	private String placa;
	private int combustivelNoTanque, quilometragem;
	private double precoDaDiaria;
	private boolean alugado;
	
	public void abastecer(int combustivel) {
		combustivelNoTanque = combustivelNoTanque+combustivel;
	}
	public abstract boolean viajar(int distancia);

	
	public boolean equals(Veiculo v) {
		if(placa == v.placa)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", combustivelNoTanque=" + combustivelNoTanque + ", quilometragem="
				+ quilometragem + ", precoDaDiaria=" + precoDaDiaria + ", alugado=" + alugado + "]";
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getCombustivelNoTanque() {
		return combustivelNoTanque;
	}
	public void setCombustivelNoTanque(int combustivelNoTanque) {
		this.combustivelNoTanque = combustivelNoTanque;
	}
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	public double getPrecoDaDiaria() {
		return precoDaDiaria;
	}
	public void setPrecoDaDiaria(double precoDaDiaria) {
		this.precoDaDiaria = precoDaDiaria;
	}
	public boolean isAlugado() {
		return alugado;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
	
	
}

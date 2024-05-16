package exemplo_polimorfismo;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	
	public EmpregadoDaFaculdade() {
		super();
	}
	double getGastos() {
		return this.salario;
	}
	String getInfo(){
		String info = "";
		info = "nome: " + this.nome + " com salário " + this.salario;
		return info;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

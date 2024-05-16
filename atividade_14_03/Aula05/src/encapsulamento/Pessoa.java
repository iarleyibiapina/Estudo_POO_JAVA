package encapsulamento;

public class Pessoa {
	public String nome;
	protected int idade;
	private long RG;
	String email;
	//construtor
	public Pessoa(String nome, int idade, long RG, String email) {
		this.nome = nome;
		this.idade = idade;
		this.RG = RG;
		this.email = email;
	}
	public String mostraInfo() {
		return "Pessoa["+nome+";"+idade+";"+RG+";"+email+"]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getRG() {
		return RG;
	}
	public void setRG(long rG) {
		RG = rG;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

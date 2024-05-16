package exeprincipal;

import encapsulamento.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = 
			new Pessoa("Carla Souza", 18, 123456789, "carla@email.com");
		
		System.out.println("Informaçoes: \n" + p.mostraInfo());
		
		p.setEmail("carlasousa01@gmail.com");
		p.setIdade(21);
		
		System.out.println("Informaçoes alteradas: \n" + p.mostraInfo());
		
		System.out.println("Pegando apenas o RG: "+p.getRG());
		
	}

}

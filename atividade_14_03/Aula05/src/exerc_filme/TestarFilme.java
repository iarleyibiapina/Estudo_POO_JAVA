package exerc_filme;

public class TestarFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filme umFilmeQualquer = new Filme("Os Vingadores", 142);
		Filme meuFilmeFavorito = new Filme("Oppenheimer", 100);
		
		umFilmeQualquer.exibirDuracaoEmHoras();
		
		meuFilmeFavorito.setDuracaoEmMinutos(198);
		meuFilmeFavorito.exibirDuracaoEmHoras();
		
		System.out.println("Os filmes do catalogo são \n"
						+umFilmeQualquer.getTitulo()+"\n"
						+meuFilmeFavorito.getTitulo());
		
		
	}

}

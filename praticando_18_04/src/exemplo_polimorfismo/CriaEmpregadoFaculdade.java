package exemplo_polimorfismo;

public class CriaEmpregadoFaculdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpregadoDaFaculdade empregado;
		ProfessorDaFaculdade professor = new ProfessorDaFaculdade( );
		Reitor reitor = new Reitor( );
		professor.setNome( "Ricardo" );
		professor.setSalario( 3000 );
		professor.setHorasDeAula( 40 );
		reitor.setNome( "Luiz" );
		reitor.setSalario( 4000 );
		empregado = professor;
		System.out.println( empregado.getInfo( ) );
		empregado = reitor;
		System.out.println( reitor.getInfo( ) );

		GeradorDeRelatorio relatorio  = new GeradorDeRelatorio();
		relatorio.adiciona(professor);
		relatorio.adiciona(reitor);
		relatorio.adiciona(empregado);
	}
	
}

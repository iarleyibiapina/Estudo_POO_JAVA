package exemplo_polimorfismo;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{
	private int horasDeAula;
	public ProfessorDaFaculdade() {
		super();
	}
	
	double getGastos( ) {
	return this.getSalario( ) + horasDeAula * 20;
	}
	
	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

	@Override
	String getInfo() {
		// TODO Auto-generated method stub
		String info = super.getInfo();
		info = info + "e " + this.horasDeAula + "número de horas aula.";
		return info;
	}
	
}

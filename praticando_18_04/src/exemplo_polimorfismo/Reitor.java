package exemplo_polimorfismo;

public class Reitor extends ProfessorDaFaculdade{

	@Override
	String getInfo() {
		// TODO Auto-generated method stub
		String info = super.getInfo();
		info = info+ " e ele é um reitor.";
		return info;
	}
	
	
}

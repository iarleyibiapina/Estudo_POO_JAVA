package classe_abstrata;

public class TesteVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classe Veiculo nao pode ser instanciada
		//Veiculo v = new Veiculo();
		
		Moto pcx = new Moto();
		pcx.setPlaca("PW4I678");
		pcx.setCombustivelNoTanque(13);
		pcx.setQuilometragem(45000);
		
		System.out.println("Distancia 240km, consigo ir de PCX?"
		                +pcx.viajar(240));
	}

}

package classe_abstrata;
/*
Método viajar - Carro: Deve considerar que um carro faz 10km  
com um litro de combustível. Fazer as mesmas operações que  as 
descritas no método viajar da classe Moto.
 */
public class Carro extends Veiculo{
	private double potenciaMotor;
	
	@Override
	public boolean viajar(int distancia) {
		if(getCombustivelNoTanque()*10 >= distancia) {
			setCombustivelNoTanque(getCombustivelNoTanque()
					-(getCombustivelNoTanque()*10));
			setQuilometragem(getQuilometragem()+distancia);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Carro [potenciaMotor=" + potenciaMotor + "]";
	}
	

	
}

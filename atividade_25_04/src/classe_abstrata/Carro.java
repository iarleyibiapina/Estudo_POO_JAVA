package classe_abstrata;
/*
M�todo viajar - Carro: Deve considerar que um carro faz 10km  
com um litro de combust�vel. Fazer as mesmas opera��es que  as 
descritas no m�todo viajar da classe Moto.
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

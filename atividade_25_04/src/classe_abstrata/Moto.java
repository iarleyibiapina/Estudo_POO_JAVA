package classe_abstrata;
/*
Método viajar - Moto: o método deve considerar que uma moto  faz 30km 
com 1 litro de combustível. Logo, deve verificar se o  combustível 
no tanque é suficiente para percorrer a distância  passada como 
parâmetro do método. Caso seja, deverá reduzir  essa quantidade do 
atributo combustívelNoTanque e adicionar  o valor da distância ao 
valor do atributo quilometragem. Retorne o valor true caso seja 
possível realizar a viagem. Caso  contrário, retorne false
 */
public class Moto extends Veiculo{
	private int cilindradas;

	@Override
	public boolean viajar(int distancia) {
		if(getCombustivelNoTanque()*30 >= distancia) {
			setCombustivelNoTanque(getCombustivelNoTanque()
					-(getCombustivelNoTanque()*30));
			setQuilometragem(getQuilometragem()+distancia);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Moto [cilindradas=" + cilindradas + "]";
	}
	


}

package classe_abstrata;
/*
M�todo viajar - Moto: o m�todo deve considerar que uma moto  faz 30km 
com 1 litro de combust�vel. Logo, deve verificar se o  combust�vel 
no tanque � suficiente para percorrer a dist�ncia  passada como 
par�metro do m�todo. Caso seja, dever� reduzir  essa quantidade do 
atributo combust�velNoTanque e adicionar  o valor da dist�ncia ao 
valor do atributo quilometragem. Retorne o valor true caso seja 
poss�vel realizar a viagem. Caso  contr�rio, retorne false
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

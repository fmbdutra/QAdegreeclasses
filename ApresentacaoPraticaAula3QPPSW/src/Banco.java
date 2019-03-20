
public class Banco {

	public boolean eValidoTaxaJuros(float taxa) {
		if (taxa >= 5 && taxa <= 20) {
			return true;
		} else {
			return false;
		}
	}
}

import java.util.ArrayList;
import java.util.List;

public class Calendario {

	boolean validaMes(int mes) {

		if (mes <= 0 || mes > 12) {
			return false;
		} else {
			return true;
		}
	}

	boolean ValidaDiasDoMes(int diaDoMes, int mes) {
		List<Integer> mesesMaior = new ArrayList<Integer>();

		mesesMaior.add(1);
		mesesMaior.add(3);
		mesesMaior.add(5);
		mesesMaior.add(7);
		mesesMaior.add(8);
		mesesMaior.add(10);
		mesesMaior.add(12);

		if (diaDoMes > 0 || diaDoMes <= 31) {
			if (diaDoMes == 31) {
				for (int m : mesesMaior) {
					if (m == mes) {
						return true;
					}
				}
			}
			
			if (mes == 2 && diaDoMes > 29) {
				return false;
			}
		}
		
		return false;

	}
}

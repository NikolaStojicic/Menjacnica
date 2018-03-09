package menjacnica;

import valute.Valuta;

public class StvarnaMenjacnica implements menjacnica.interfejs.Menjacnica {

	private Valuta[] nizValuta;
	public StvarnaMenjacnica(int kapacitet) {
			nizValuta = new Valuta[31];
	}
	@Override
	public boolean dodajKurs(Valuta val, int dan) {
		if(dan < 0 || dan > 30) return false;
		nizValuta[dan] = val;
		return true;
	}

	@Override
	public boolean izbrisiKurs(Valuta val, int dan) {
		if(dan < 0 || dan > 30) return false;
		nizValuta[dan] = null;
		return true;
	}

	@Override
	public Valuta pronadjiValutu(int dan) {
		if(dan < 0 || dan > 30) return null;
		return nizValuta[dan];
	}

}

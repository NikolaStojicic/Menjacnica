package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import valute.Valuta;

public class StvarnaMenjacnica implements menjacnica.interfejs.Menjacnica {

	LinkedList<Valuta> listaValuta = new LinkedList<Valuta>();

	@Override
	public boolean dodajKurs(Valuta val, int dan) {
		listaValuta.add(dan, val);
		return true;
	}

	@Override
	public boolean izbrisiKurs(Valuta val, int dan) {
		listaValuta.remove(val);
		return true;
	}

	@Override
	public Valuta pronadjiValutu(int dan) {
		for (int i = 0; i < listaValuta.size(); i++)
			if (listaValuta.get(i).getDatumObjaveKursa().get(GregorianCalendar.DAY_OF_MONTH) == dan)
				return listaValuta.get(i);
		return null;
	}

}

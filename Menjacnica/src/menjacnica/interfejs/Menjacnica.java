package menjacnica.interfejs;

import valute.Valuta;

public interface Menjacnica {
	boolean dodajKurs(Valuta val, int dan);
	boolean izbrisiKurs(Valuta val, int dan);
	Valuta pronadjiValutu(int dan);
}

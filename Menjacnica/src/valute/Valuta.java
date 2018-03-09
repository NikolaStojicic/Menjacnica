package valute;

import java.util.GregorianCalendar;

public class Valuta {
	private String punoImeValute, skracenoImeValute;
	private GregorianCalendar datumObjaveKursa;
	private double prodajniKurs, kupovniKurs, srednjiKurs;
	public String getPunoImeValute() {
		return punoImeValute;
	}
	public void setPunoImeValute(String punoImeValute) {
		this.punoImeValute = punoImeValute;
	}
	public String getSkracenoImeValute() {
		return skracenoImeValute;
	}
	public void setSkracenoImeValute(String skracenoImeValute) {
		this.skracenoImeValute = skracenoImeValute;
	}
	public GregorianCalendar getDatumObjaveKursa() {
		return datumObjaveKursa;
	}
	public void setDatumObjaveKursa(GregorianCalendar datumObjaveKursa) {
		this.datumObjaveKursa = datumObjaveKursa;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumObjaveKursa == null) ? 0 : datumObjaveKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((punoImeValute == null) ? 0 : punoImeValute.hashCode());
		result = prime * result + ((skracenoImeValute == null) ? 0 : skracenoImeValute.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Valuta && ((Valuta) obj).getPunoImeValute().equals(this.getPunoImeValute());
	}

	@Override
	public String toString() {
		return "Ime valute: " + this.getPunoImeValute() + "(" + this.getSkracenoImeValute() + ")" + ", datum objave kursa: "
				+ this.getDatumObjaveKursa().getTime() + "\nKurs:\nProdajni: " + this.getProdajniKurs() + "\tKupovni: "
				+ this.getKupovniKurs() + "\tSrednji: " + this.getSrednjiKurs();
	}
}

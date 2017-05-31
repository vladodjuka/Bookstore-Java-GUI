package Code;

import java.io.Serializable;

public class Korisnik implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7983800668996096705L;
	private String ime;
	private String prezime;
	private int godine;
	private String ePosta;
	private String sifra;
	private String pol;
	private String[] pozicije;

	public Korisnik(String ime, String prezime, int godine, String ePosta,
			String sifra, String pol,String [] pozicije) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.ePosta = ePosta;
		this.sifra = sifra;
		this.pol = pol;
		this.pozicije = pozicije;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Korisnik) {
			Korisnik k = (Korisnik) obj;
			if (k.getIme().equalsIgnoreCase(ime)
					&& k.getPrezime().equalsIgnoreCase(prezime)
					&& k.getSifra().equalsIgnoreCase(sifra)) {
				return true;
			}
		}
		return false;
	}

	private String prikaziPozicije() {
		String s = "";
		for (int i = 0; i < pozicije.length; i++) {
			if (pozicije[i] != null) {
				s += pozicije[i] + " ";
			}
		}
		if (s.equals("")) {
			return "Nepoznato";
		}
		return s;
	}

	public boolean dodajPoziciju(String pozicija) {
		for (int i = 0; i < pozicije.length; i++) {
			if (pozicije[i] == null) {
				pozicije[i] = pozicija;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format(
				"%s %s \nGodina: %d\nSifra:%s\nPol: %s\nE-posta: %s\nPozicije:%s", ime,
				prezime, godine,sifra, pol, ePosta, prikaziPozicije());
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getPol() {
		return pol;
	}

	public void setPol(String pol) {
		this.pol = pol;
	}

	public String[] getPozicije() {
		return pozicije;
	}

	public void setPozicije(String[] pozicije) {
		this.pozicije = pozicije;
	}

}

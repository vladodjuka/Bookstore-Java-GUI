package Code;

public class Knjiga {

	private String naziv;
	private String autor;
	private String zanr;
	private int brStranica;
	private String opis;
	private int ocjena;
	
	public Knjiga(String naziv, String autor, String zanr, int brStranica,
			String opis, int ocjena) {
		super();
		this.naziv = naziv;
		this.autor = autor;
		this.zanr = zanr;
		this.brStranica = brStranica;
		this.opis = opis;
		this.ocjena = ocjena;
	}
	
	@Override
	public String toString() {
		return String.format("%s - Autor:%s (%d)\nZanr:%s\nOpis:%s\nOcjena:%d", naziv,autor,brStranica,zanr,opis,ocjena);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Knjiga){
			Knjiga k = (Knjiga) obj;
			if(naziv.equalsIgnoreCase(k.getNaziv()) && autor.equalsIgnoreCase(k.getAutor())){
				return true;
			}
		}
		return false;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getZanr() {
		return zanr;
	}
	public void setZanr(String zanr) {
		this.zanr = zanr;
	}
	public int getBrStranica() {
		return brStranica;
	}
	public void setBrStranica(int brStranica) {
		this.brStranica = brStranica;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getOcjena() {
		return ocjena;
	}
	public void setOcjena(int ocjena) {
		this.ocjena = ocjena;
	}
	
	
}

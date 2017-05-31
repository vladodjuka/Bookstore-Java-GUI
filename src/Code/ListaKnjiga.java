package Code;

import java.util.ArrayList;
import java.util.List;

public class ListaKnjiga {

	private List<Knjiga>knjige;

	public ListaKnjiga() {
		knjige = new ArrayList<Knjiga>();
	}
	
	@Override
	public String toString() {
		String s = "";
		if (knjige.size()==0) {
			return "Nema zabiljezenih unosa";
		}
		for (Knjiga knjiga : knjige) {
			s += knjiga + "\n";
		}
		return s;
	}
	
	public boolean add(Knjiga k) {
		if (knjige.contains(k)) {
			return false;
		}
		knjige.add(k);
		return true;
	}

	public List<Knjiga> getKnjige() {
		return knjige;
	}

	public void setKnjige(List<Knjiga> knjige) {
		this.knjige = knjige;
	}
	
	
}

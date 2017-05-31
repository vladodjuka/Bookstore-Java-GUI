package Code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaKorisnika implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -20980096017058516L;
	List<Korisnik> korisnici;

	public List<Korisnik> getKorisnici() {
		return korisnici;
	}

	public void setKorisnici(List<Korisnik> korisnici) {
		this.korisnici = korisnici;
	}

	public ListaKorisnika() {
		this.korisnici = new ArrayList<Korisnik>();
	}
	
	public boolean dodajKorisnika(Korisnik k) {
		if (korisnici.contains(k)) {
			return false;
		}else{
			korisnici.add(k);
			return true;
		}
	}
	
	public String prikaziKorisnike() {
		String s = "";
		for (Korisnik korisnik : korisnici) {
			s += korisnik + "\n";
		}
		if (s.equals("")) {
			return "Nema registrovanih korisnika";
		}
		return s;
	}
	
	public void serialize(String fileName) {
		try {
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(fileName));
			write.writeObject(this);
			write.flush();
			write.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ListaKorisnika deserialize(String fileName){
		try {
			ObjectInputStream read = new ObjectInputStream(new FileInputStream(fileName));
			try {
				ListaKorisnika lista = (ListaKorisnika) read.readObject();
				read.close();
				return lista;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

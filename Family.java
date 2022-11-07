package pbo_collection;
import java.util.*;

public class Family {
	private final Set <Uncle> uncles;
	private final Set <Niece> nieces;
	
	public Family() {
		uncles = new HashSet<>();
		nieces = new HashSet<>();
	}
	
	public boolean addNiece(String nama, int tanggal, int bulan) {
		Niece temp;
		temp = new Niece();
		temp.setNama(nama);
		temp.setTanggal(tanggal);
        temp.setBulan(bulan);
        if(nieces.add(temp)) {
            this.updatePresentList();
            return true;
        }
        return false;  
	}
	
	public boolean addUncle(String nama) {
		Uncle temp;
		temp = new Uncle();
		temp.setNama(nama);
		temp.setNama(nama);
		if(uncles.add(temp)) {
            this.updatePresentList();
        }
        return false;
	}
	
	public Niece findNiece(String nama) {
		for(Iterator<Niece> it = nieces.iterator(); it.hasNext();) {
			Niece n = it.next();
			if(n.getNama().equals(nama)) {
				return n;
			}
		}
		return null;
	}
	
	public Uncle findUncle(String nama) {
        for (Iterator<Uncle> it = uncles.iterator(); it.hasNext();) {
            Uncle u = it.next();
            if(u.getNama().equals(nama)) {
                return u;                
            }
        }
        return null;
    }
	
	public void listNieces() {
        System.out.println("List of Nieces ");
        
        TreeSet<Niece> sortedNieces = new TreeSet<>(nieces);
        System.out.println(sortedNieces);
        System.out.print("\n\n");
    }
    
    public void listUncles() {
        System.out.println("List of Uncles ");
        TreeSet<Uncle> sortedUncles = new TreeSet<>(uncles); 
        System.out.println(sortedUncles);
        System.out.print("\n\n");
    }
    
    private void updatePresentList() {
        for(Uncle uncle:uncles) {
            for(Niece niece:nieces) {
                if(!uncle.getPresents().containsKey(niece)) {
                    uncle.addPresent(niece, null);
                }
            }
        }
    }
}

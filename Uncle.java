package pbo_collection;
import java.util.*;

public class Uncle implements Comparable<Uncle>{
	private String nama;
	private final Map<Niece, String> presents;
	
	public Uncle() {
		presents = new HashMap<>();
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public Map<Niece, String> getPresents(){
		return this.presents;
	}
	
	public boolean addPresent(Niece recipient, String description) {
		if(!presents.containsValue(description) && !recipient.getPresents().containsValue(description) || description==null)
			{
				presents.put(recipient, description);
				recipient.getPresents().put(this, description);
				return true;
			}
		return false;
	}
	
	public void listPresents() {
		System.out.println("Hadiah dari " + this.nama + ":");
		for (Map.Entry<Niece, String> entry : presents.entrySet()) {
            System.out.print("- ");
            System.out.print((entry.getValue()==null ? "Tidak ada hadiah untuk " 
                    : entry.getValue() + " for "));
            System.out.println(entry.getKey().getNama());
        }
        System.out.print("\n\n");
	}
	
	@Override
    public String toString() {
        return "nama: "+getNama();
    }
    
    @Override
    public boolean equals(Object p) {
        if(p==this) return true;
        if(p == null) return false;
        if(p.getClass() != this.getClass()) return false;
         return nama.equals(((Uncle)p).nama);
    } 
    
    @Override
    public int hashCode() {
        return nama.hashCode();
    }
    
    @Override
    public int compareTo(Uncle other) {
        return nama.compareTo(other.nama);
    }
}

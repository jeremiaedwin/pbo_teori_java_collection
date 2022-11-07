package pbo_collection;
import java.util.*;

public class Niece implements Comparable<Niece> {
	private String nama;
	private int tanggal, bulan;
	Map <Uncle, String> presents;
	
	public Niece() {
		presents = new HashMap<>();
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getTanggal() {
		return tanggal;
	}
	
	public void setTanggal(int tanggal) {
		this.tanggal = tanggal;
	}
	
	public int getBulan() {
		return bulan;
	}
	
	public void setBulan(int bulan) {
		this.bulan = bulan;
	}
	
	public Map<Uncle, String> getPresents(){
		return this.presents;
	}
	
	public int clearPresents() {
		int totalPresent = presents.size();
		presents.clear();
		return totalPresent;
	}
	
	public void listPresents() {
		System.out.println("Hadiah untuk " + this.nama + ":");
		for (Map.Entry<Uncle, String> entry: presents.entrySet())
		{
			System.out.print("- ");
			System.out.print(entry.getKey().getNama());
			System.out.println((entry.getValue()==null ? " belum memberi hadiah" : " memberi " + entry.getValue()));
		}
		System.out.println("\n\n");
	}
	
	@Override
    public String toString() {
        return "[Nama: "+getNama()+" | Tanggal Ulang Tahun: "+getTanggal()+" "+getBulan()+"]";
    }
	
	@Override
    public boolean equals(Object p) {
        if(p == this) return true;
        if(p == null) return false;
        if(p.getClass() != this.getClass()) return false;   
        return nama.equals(((Niece)p).nama);
    }  
    
    @Override
    public int hashCode() {
        return nama.hashCode();
    }
    
    @Override
    public int compareTo(Niece other) {
        if(this.bulan > other.bulan) return 1;
        if(this.bulan == other.bulan) {
            return (this.tanggal > other.tanggal ? 1 : -1);
        }
        return -1;
    }
}

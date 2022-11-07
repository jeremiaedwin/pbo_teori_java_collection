package pbo_collection;

public class main {
	public static void main(String[] args) {
        
        Family family = new Family();

        family.addNiece("Haidar", 5, 3);
        family.addNiece("Nasrul",2,12);
        family.addNiece("Ardi",3, 10);
        family.addNiece("Edwin",11, 11);
        family.addNiece("Garly",4, 3);
        
        family.addUncle("Gauss Jordan");
        family.addUncle("Bresenham");
        family.addUncle("Pressman");
        family.addUncle("Sommerville");         
        
        Uncle Bresenham = family.findUncle("Bresenham");
        Bresenham.addPresent(family.findNiece("Haidar"),"Pen Tablet");
        
        Uncle Pressman = family.findUncle("Pressman");
        Pressman.addPresent(family.findNiece("Haidar"), "RAM 8GB DDR4");
        Pressman.addPresent(family.findNiece("Nasrul"), "Headset DBE");
        Pressman.addPresent(family.findNiece("Ardi"), "Game GTA 5");
        Pressman.addPresent(family.findNiece("Edwin"), "Aegis Boost 2");
       
        family.listNieces();
        family.listUncles();
        Bresenham.listPresents();
        Pressman.listPresents();
        
        family.findNiece("Nasrul").listPresents();
        family.findNiece("Garly").listPresents();
        
    }
}

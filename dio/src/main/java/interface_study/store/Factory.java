package interface_study.store;
import interface_study.multifulcional.MultifunctionalEquipament;
import interface_study.printer.*;
public class Factory {

	public static void main(String[] args) {
		Printer printer1 = new MultifunctionalEquipament();
		printer1.printer();
		
		Printer printer = new DeskJet();
		printer.printer();
		
		Printer printer2 = new LaserJet();
		printer2.printer();

	}

}

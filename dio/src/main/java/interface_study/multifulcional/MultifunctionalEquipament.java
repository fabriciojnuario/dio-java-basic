package interface_study.multifulcional;

import interface_study.copying.Copying;
import interface_study.digitalizer.Digitalizer;
import interface_study.printer.Printer;

public class MultifunctionalEquipament implements Printer, Digitalizer, Copying{

	@Override
	public void copying() {
		System.out.println("Copying via multifunctional equipament");
		
	}

	@Override
	public void scanner() {
		System.out.println("Scanning via multifunctional equipament");
		
	}

	@Override
	public void printer() {
		System.out.println("Copying via multifunctional equipament");
		
	}

}

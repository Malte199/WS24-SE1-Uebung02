package org.hbrs.se1.ws24.exercises.uebung1.view;

import org.hbrs.se1.ws24.exercises.uebung1.control.Translator;
import org.hbrs.se1.ws24.exercises.uebung1.control.TranslatorFactory;




public class Client {
	private Translator translator;

	public Client() {
		this.translator = TranslatorFactory.createTranslator(); // Holen des Translators über die Factory
	}

	public void display(int number) {
		String result = translator.translateNumber(number); // Aufruf der Methode
		System.out.println("Übersetzte Zahl: " + result);
	}
}






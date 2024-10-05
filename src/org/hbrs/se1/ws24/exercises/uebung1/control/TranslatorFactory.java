package org.hbrs.se1.ws24.exercises.uebung1.control;


public class TranslatorFactory {

    public static Translator createTranslator() {
        GermanTranslator translator = new GermanTranslator();
        translator.setDate("Okt/2024"); // Setzt das vorgegebene Datum
        return new GermanTranslator();

    }
}

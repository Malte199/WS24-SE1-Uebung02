package org.hbrs.se1.ws24.tests.uebung1;

import static org.junit.jupiter.api.Assertions.*;
import org.hbrs.se1.ws24.exercises.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

public class GermanTranslatorTest {

    @Test
    public void testValidNumbers() {
        GermanTranslator translator = new GermanTranslator();

        // Positive Testfälle (gültige Zahlen 1 bis 10)
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("zwei", translator.translateNumber(2));
        assertEquals("drei", translator.translateNumber(3));
        assertEquals("vier", translator.translateNumber(4));
        assertEquals("fünf", translator.translateNumber(5));
        assertEquals("sechs", translator.translateNumber(6));
        assertEquals("sieben", translator.translateNumber(7));
        assertEquals("acht", translator.translateNumber(8));
        assertEquals("neun", translator.translateNumber(9));
        assertEquals("zehn", translator.translateNumber(10));
    }

    @Test
    public void testInvalidNumbers() {
        GermanTranslator translator = new GermanTranslator();

        // Negative Testfälle für Zahlen unterhalb des gültigen Bereichs
        assertEquals("Übersetzung der Zahl -3 nicht möglich (1.0)", translator.translateNumber(-3));
        assertEquals("Übersetzung der Zahl -2 nicht möglich (1.0)", translator.translateNumber(-2));
        assertEquals("Übersetzung der Zahl -1 nicht möglich (1.0)", translator.translateNumber(-1));

        // Positive Testfälle für Zahlen überhalb des gültigen Bereichs
        assertEquals("Übersetzung der Zahl 11 nicht möglich (1.0)", translator.translateNumber(11));
        assertEquals("Übersetzung der Zahl 12 nicht möglich (1.0)", translator.translateNumber(12));
        assertEquals("Übersetzung der Zahl 13 nicht möglich (1.0)", translator.translateNumber(13));
    }

}

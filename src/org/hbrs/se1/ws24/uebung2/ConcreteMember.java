package org.hbrs.se1.ws24.uebung2;

public class ConcreteMember implements Member {

    private Integer id;

    // Konstruktor zur Initialisierung der ID
    public ConcreteMember(Integer id) {
        this.id = id;
    }

    // Implementierung der getID-Methode aus dem Member-Interface
    @Override
    public Integer getID() {
        return this.id;
    }

    // Überschreibung der toString-Methode für die gewünschte Ausgabe
    @Override
    public String toString() {
        return "Member (ID = " + this.id + ")";
    }
}

package org.hbrs.se1.ws24.uebung2;

public class ContainerTest {
    public static void main(String[] args) {
        Container container = new Container();

        // Test 1: Hinzufügen von Member-Objekten
        try {
            System.out.println("Test 1: Hinzufügen von Member-Objekten");
            Member member1 = new ConcreteMember(1);
            Member member2 = new ConcreteMember(2);
            container.addMember(member1);
            container.addMember(member2);
            System.out.println("Anzahl Member nach Hinzufügen: " + container.size());  // Erwartet: 2
        } catch (ContainerException e) {
            System.err.println(e.getMessage());
        }

        // Test 2: Hinzufügen von doppelten Member-IDs
        try {
            System.out.println("\nTest 2: Hinzufügen von doppelten Member-IDs");
            Member member3 = new ConcreteMember(1);  // gleiche ID wie member1
            container.addMember(member3);
        } catch (ContainerException e) {
            System.out.println(e.getMessage());  // Erwartet: Exception
        }

        // Test 3: Löschen eines Members
        System.out.println("\nTest 3: Löschen eines Members");
        String result = container.deleteMember(1);
        System.out.println(result);  // Erwartet: Member mit der ID 1 wurde gelöscht
        System.out.println("Anzahl Member nach Löschen: " + container.size());  // Erwartet: 1

        // Test 4: Löschen eines nicht vorhandenen Members
        System.out.println("\nTest 4: Löschen eines nicht vorhandenen Members");
        result = container.deleteMember(3);  // ID 3 existiert nicht
        System.out.println(result);  // Erwartet: Kein Member mit der ID 3 gefunden

        // Test 5: Dump der aktuellen Member
        System.out.println("\nTest 5: Dump der aktuellen Member");
        container.dump();  // Erwartet: Ausgabe von Member 2

        // Test 6: Überprüfung der Größe
        System.out.println("\nTest 6: Überprüfung der Größe des Containers");
        System.out.println("Anzahl Member: " + container.size());  // Erwartet: 1
    }
}

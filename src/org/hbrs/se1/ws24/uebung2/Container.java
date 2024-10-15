package org.hbrs.se1.ws24.uebung2;

import java.util.ArrayList;
import java.util.List;


public class Container {

    private List<Member> memberList;

    public Container() {
        memberList = new ArrayList<>();
    }

    public void addMember(Member member) throws ContainerException {
        for (Member m : memberList) {
            if (m.getID() == member.getID()) {
                throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
            }
        }
        memberList.add(member);
    }

    // Methode zum Löschen eines Members anhand der ID
    public String deleteMember(Integer id) {
        for (Member m : memberList) {
            if (m.getID() == id) {
                memberList.remove(m);
                return "Member mit der ID " + id + " wurde erfolgreich gelöscht.";
            }
        }
        return "Kein Member mit der ID " + id + " gefunden.";
    }


    // Methode zum Ausgeben der IDs aller Member
    public void dump() {
        for (Member m : memberList) {
            // toString() des Member-Objekts
            System.out.println(m.toString());
        }
    }

    // Methode zur Ermittlung der Anzahl der gespeicherten Member
    public int size() {
        return memberList.size();
    }

}

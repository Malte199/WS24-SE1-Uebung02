Aufgabe 1 Theorie:

Wie kann diese Kommunikationsverbindung nun dennoch mit Hilfe einer zusätzlichen
„Fabrik“-Klasse, welche die dazu notwendige Objekt-Erzeugung übernimmt,
aufgebaut werden?
- Die Factory stellt sicher, dass in der Client-Klasse keine direkte Instanziierung von GermanTranslator mit new erfolgt.
- Die Factory-Klasse erzeugt das Objekt über eine statische Methode, die ein Translator-Interface zurückgibt.
- Das Objekt wird dann über die Factory bezogen, wodurch die direkte Verwendung von new vermieden wird. 
  In der Methode display wird dann die Methode translateNumber des Translators aufgerufen.

In welchem Package sollte diese zusätzliche Klasse liegen?
- Die Factory-Klasse sollte in das control-Package, weil dort die logische Verarbeitung und Hintergrundoperationen stattfinden,
  die von der View genutzt werden.

Welches Entwurfsmuster...?
- Das passende Entwurfsmuster für dieses Problem ist das Factory Pattern. Damit kann man die Erstellung von Objekten "auslagern",
  sodass der Client (also der Aufrufer) nicht weiß  welche konkrete Klasse da eigentlich im Hintergrund instanziiert wird.

Wie muss man den Source Code des Interface ggf. anpassen, um mögliche
auftretende Kompilierfehler zu beseitigen?
- Falls Kompilierfehler auftreten, müssen fehlende Methoden wie translateNumber ins Interface aufgenommen und als 
  public deklariert werden, um die Implementierung zu ermöglichen.


Aufgabe 3 Theorie:

Was ist der Vorteil einer separaten Test-Klasse?
- Man trennt den eigentlichen Code von den Tests, sodass die Tests den Ablauf nicht stören und der Code sauber bleibt.

Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?
- Äquivalenzklassen erlauben es, ähnliche Eingabewerte zusammenzufassen, sodass man nur repräsentative Werte aus jeder 
  Klasse testen muss. Dadurch spart man sich, alle möglichen Eingaben durchzutesten, und verringert den Testaufwand.

Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?
- Der Client ist auf andere Klassen wie die Factory und den Translator angewiesen, wodurch es schwierig wird,
  ihn isoliert zu testen, ohne dass diese Abhängigkeiten mit ins Spiel kommen.

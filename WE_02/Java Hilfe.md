Wiederholung
============


Jeders Java-Programm ist folgendermaßen aufgebaut:

```Java
import java.util.Scanner;		// Wird für die Benutzereingabe benötigt

public class <Programmname> {

	public static void main(String[] args) {
		// Programmeinstiegspunkt
		
		// Programmausgaben
		System.out.println("<Text zur Ausgabe>");

		// Benutzereingaben
		Scanner sc = new Scanner(System.In);
		<Datentyp> <Variablenname> = sc.next();
	}

}

```

z.B.:

```Java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Hier ist der Programmeinstiegspunkt

		// Programmausgaben auf der Konsole
		System.out.println("Hallo Welt (mit Zeilenumbruch)");
		System.out.print("Hallo Welt ... ")
		System.out.print("(ohne Zeilenumbruch) es wird in der gleichen Zeile ausgegeben");

		System.out.print("\nWie heißt du? ");		// \n gibt einen Zeilenumbruch aus
		Scanner sc = new Scanner(System.In);
		String name = sc.next();			// Speichert Eingabe in name
		System.ot.println("Hallo, " + name + "!");	// Gibt "Hallo, <name>!" aus, <name> ist die Benutzereingabe
		
	}

}

```

## Datentypen

Es gibt verschiedene Datentypen in Java. Datentypen beschreiben eine Variable näher. So kann z.B. eine Variable eine Zahl, ein Zeichen oder eine Zeichenkette sein, aber nie alles zugleich. 
Hier einmal die wichtigsten "Datentypen" in Java:

| Typ       | Beschreibung |
|-----------|--------------|
| `boolean` | Ist ein sogennanter Wahrheitswert kann `true` = wahr oder `false` = falsch sein. In If-Verzweigungen wird bei `true` der `if`-Block und bei `false` ggf. der `else`-Block ausgeführt |
| `byte`    | Ist eine 8-Bit-Ganzzahl, d.h. es kann Werte von -128 bis +127 annehmen. ==> 2^8 unterschiedliche Zustände. |
| `short`   | Ist eine 16-Bit-Ganzzahl, d.h. sie kann Werte von -32'768 bis +32'767 annehmen ==> 2^16 unterschiedliche Zustände. |
| `int`     | Ist eine 32-Bit-Ganzzahl, kann Werte von -(2^31) bis +(2^31 - 1) annehmen. Ist "die" Standartganzzahl. ==> 2^32 unterschiedliche Zustände | 
| `float`   | Ist eine 32-Bit-Fließkommazahl (also z.B. 3.14), wichtig ist einen Punkt statt ein Komma zu schreiben. |
| `double`  | Ist eine 64-Bit Fließkommazahl (d.h. sie ist genauer als ein `float`)|
| `char`    | Ist ein einzelnes Zeichen. Kann 65'535 verschiedene Unicodezeichen darstellen. |
| `String`  | Sind Zeichenketten bestehen aus einzelnen `char`s |




## If-Verzweigungen

If-Verzweigungen sind zum Auswerten von möglichen Ereignissen geeignet. Zum Beispiel kann ein Nutzer eine bestimmte Eingabe gemacht haben, auf welche anders reagiert werden soll.


```Java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Hier ist der Programmeinstiegspunkt

		System.out.print("Wie heißt du? ");		// \n gibt einen Zeilenumbruch aus
		Scanner sc = new Scanner(System.In);
		String name = sc.next();			// Speichert Eingabe in name

		if(name == "Max") {				// Wenn der name "Max" ist, dann gib das auf:
			System.out.println("Hallo Max! Ich kenne dich.");
		}
		else {						// Ansonnsten gebe das aus:
			System.ot.println("Hallo, " + name + "! Dich kenne ich noch nicht.");	// Gibt "Hallo, <name>!" aus, <name> ist die Benutzereingabe
		}
		
	}

}

```

## Zeichenketten

Java hat den Datentyp `String` für Zeichenketten. Möchtest du also eine Zeichenkette nutzen, bzw. sie verändern (manipulieren) musst du `String`s nutzen.

```Java
String name = "Max";		// name hat nun die Zeichenkette "Max" gespeichert
name = name + " Mustermann";	// Hiermit kann man Zeichenketten erweitern, nun ist "Max Mustermann" in `name` gespeichert
name += " Mustermann"; 		// Ist das gleiche wie die Anweisung von davor ==> "Max Mustermann Mustermann"
name = name.substring(0, 14);	// substring liefert eine Teilzeichenkette von Zeichen 0 (das erste) bis Zeichen 14

```

## Schleifen


Mit Schleifen lassen sich bestimmte Anweisungen wiederholen. Zum Beipiel kann man, anstatt dreimal hintereinanader `System.out.println("Hello World");` zu schreiben, auch diese Anweisung in eine Schleife packen. Vor allem, wenn anfangs unbekannt ist, wie viele Male Anweisungen wiederholt werden sollen eignen sich Schleifen. Es gibt verschiedene Schleifenarten. Die `while` und die `for` Schleife sind die Wichtigsten.

```Java

Aufgaben Woche 03
=================

Ihr habt im Theoriekurs Zeichenketten kennengelernt. Falls ihr nochmals Hilfe benötigt, meldet euch bitte. Lest euch `Java Hilfe.md` durch, es wird euch bei der Bearbeitung der Aufgaben helfen.

Aufgabe 1: Plant ein kleines Textadventure. Der Benutzer soll durch Eingaben entscheiden, wie er an bestimmten Stellen handeln möchte. Es soll mindestens vier unterschiedliche Geschichtszweige geben. Wenn ihr Ideenlos seid, könnt ihr auch folgende Szenarien zum Einstieg nehmen:

1. Der Spieler Übernimmt die Rolle eines Zauberlehrlings, der versucht, mit Hilfe von Magie dem Bannkreis sines Meisters für ein paar Stunden zu entkommen. Möglicher Einstieg:

	> Der Meister war stocksauer! Nur weil du gestern den ganzen Tag ein wenig herumgetrödelt hast, anstatt zu studieren und das Haus aufzuräumen, wie er es dir aufgetragen hatte.

	>Heute morgen ist er in die Hauptstadt zu einer Sitzung des Hohen Rats geritten. Bei Sonnenuntergang sei er zurück, hat er gesagt, und hat einen Bannkreis um sein Haus gezogen, aus dem du nicht entkommen kannst. Damit du nicht auf dumme Gedanken kommst, hat er gebrummt, und dass ja die Stube aufgeräumt sei, und die Kartoffeln geschält und das Holz gespalten, wenn er wiederkommt. Dann ist er losgeprescht.

	> Und das, wo heute im Dorf ein großes Fest ist: Musik und Tanz und Leckereien und Schaubuden aus der ganzen Gegend. Und vor allem Amanda, die sich dort mit Dir treffen wollte...

	> Stattdessen hast du widerwillig die Kartoffeln geschält, wobei du natürlich immer an Amanda denken musstest. Nachdem du fast den ganzen Vormittag damit vertan hast, ist nun wohl der Hausputz dran...


2. Der Spieler übernimmt die Rolle eines erkundenden Forschers in einen Urwaldtempel, um einen sagenumwobenen Kristallschädel hierin zu finden und seinen Forscherruhm zu steigern.
[Beispiel](http://www.martin-oehm.de/adv/beispiel.html)

---

Aufgabe 2: Wenn du schon etwas Fortgeschrittener bist und keine Lust auf das Textadvanture hast kannst du auch folgende Aufgaben bearbeiten:

1. Lasse von
	- -100 bis 100 zählen,
	- nur gereade
	- nur ungerade Zahlen,
	- Mit Modulo (benötigt if, Modulo oder Runden): Zahlenzensur: immer wenn eine Zahl durch 7 teilbar ist, soll "PIEP" statt der Zahl auf dem Bildschirm erscheinen (Hinweis: Setze % ein oder lasse eine zweite Variable immer bis 7 zählen). 

2. Schreibe ein Programm, das dich solange nach der Geheimzahl „123“ fragt, bis sie richtig eingegeben wird. Dann soll auf dem Bildschirm erscheinen: Tresor ist geöffnet.

3. Gebe von 1 bis zu einer einzugebenden Zahl n alle natürlichen Zahlen und 
	- Ihre Quadrate – (Zahl mit sich selbst multiplizieren! 1,4,9,16…)
	- Ihre Zweierpotenzen – ( 2,4,8,16,32…)
	- Ihre Fakultät (1, 1*2, 1*2*3, 1*2*3*4, …)
aus.

4. Simuliere eine Uhr (über verschachtelte Schleifen), die einen ganzen Tag mit Sekunden ausgibt

5. Die Caesar-Verschlüsselung ist eine der ältesten und einfachsten Verschlüsselungsmethoden für Geheimtexte. Der Name geht auf den römischen Feldherren Julius Caesar zurück, der laut Überlieferungen diese Methode verwendete, um seine geheimen Botschaften für Außenstehende unkenntlich zu machen.

Bei dieser Verschlüsselungsmethode wird jeder Buchstabe durch einen anderen ersetzt, der sich durch eine Verschiebung des Alphabets ergibt. Wählt man also eine Verschiebung um drei
Buchstaben, wird jedes A zu einem D, jedes B zu einem E, usw. Diese Verschiebung heißt auch Schlüssel und kann durch eine Zahl, in unserem Beispiel 3, oder als Buchstabe, in unserem
Beispiel D, angegeben werden und muss dem Verfasser und dem Empfänger der Nachricht bekannt sein.

Schreibe ein Java Programm, welches eine Nachricht als Eingabe annimmt. Anschließend soll der Benutzer einen Schlüssel (also eine Zahl) eingeben können, worauf die Nachricht über den Schlüssel nach oben beschriebenen Prinzip verschlüsselt und ausgegeben wird.

Bonus:
- Überlege dir, wie die Nachricht mit einem Bekannten Schlüssel entschlüselt werden kann. Schreibe ein Programm, das dies Übernimmt.

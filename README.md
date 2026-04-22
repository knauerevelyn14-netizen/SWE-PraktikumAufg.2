# SWE-PraktikumAufg.2
Streichholzspiel 
Wir wollen uns in unserem ersten Praktikumsblatt mit einem einfachen Spiel beschäftigen, dem
sogenannten Streichholzspiel. In diesem Spiel befindet sich ein Haufen an Streichhölzern auf dem
Tisch und zwei Spieler nehmen abwechselnd zwischen 1 und 3 Streichhölzern vom Tisch. Wer
das letzte Streichholz nehmen muss, verliert.
Wir wollen das Spiel nun gegen den Computer spielen. Dazu werden wir einen einfachen 
Algorithmus
entwickeln und auf unseren Programmierkenntnissen aus Softwareentwicklung I 
aufsetzen.
Aufgabe 1
Erstellen Sie als erstes eine Klasse Spiel. Der Konstruktor der Klasse Spiel erwartet einen int
Parameter. Wenn ein neues Spiel-Objekt erzeugt wird, gibt dieser Parameter die Zahl der 
Streichhölzer an, die zu Beginn auf dem Tisch liegen sollen. 
Die Klasse Spiel hat ein Datenfeld vom Typ int, um die im Spiel befindlichen Streichhölzer zu 
speichern. Außerdem gibt es zwei öffentliche Methoden, nämlich computerZiehen und 
menschZiehen, sowie eine private Methode namens berechneComputerZug. Schreiben Sie 
zunächst nur die Köpfe dieser Methoden. 
Im Konstruktor der Klasse Spiel werden abwechselnd die Methoden computerZiehen und 
menschZiehen aufgerufen – solange sich noch Streichhölzer im Spiel befinden. 
Aufgabe 2
Wir benötigen nun eine Hilfsklasse, welche sich um die Ausgaben des Programms auf der Konsole 
kümmert. Wir nennen diese Klasse Ausgabe. Alle Methoden dieser Hilfsklasse sind statisch. Es 
muss also kein Objekt der Klasse Ausgabe erzeugt werden, um diese Methoden aufzurufen. 
Alle Methoden der Klasse Ausgabe sind zudem öffentlich und haben keinen Rückgabewert. 
• 
• 
• 
Die Methode zahlEingeben fordert den Anwender auf der Konsole auf, eine Zahl einzugeben. 
Die Methode keineZahl informiert den Anwender, dass es sich bei der Eingabe nicht um eine 
Zahl handelt. 
Die Methode zahlNichtImBereich informiert den Anwender, dass die Zahl nicht im gültigen 
Bereich (zwischen 1 und 3) liegt.
Die Methode menschGewinnt gratuliert dem Spieler zu seinem Sieg. 
Die Methode computerGewinnt gibt aus, dass der Computer gewonnen hat. 
Die Methode zugNichtMoeglich gibt an, dass weniger Hölzer auf dem Tisch liegen als der 
Mensch ziehen wollte. 
Die Methode spielstand erwartet als Parameter die Anzahl der auf dem Tisch befindlichen 
Hölzer und informiert den Anwender darüber, wie viele Hölzer aktuell auf dem Tisch liegen. 
Die Methode menschZug berichtet über den Zug des menschlichen Spielers. Dazu benötigt 
sie zwei Parameter: die Anzahl der gezogenen Hölzer und die verbleibende Anzahl auf dem 
Tisch. 
Die Methode computerZug funktioniert analog für den Computer und erwartet die gleichen 
Parameter. 
Beispielausgaben: 
Ausgabe.menschZug(2, 15) 
„Sie nehmen 2 Hölzer und es bleiben noch 15 Hölzer übrig.“ 
Ausgabe.computerZug(3, 10) 
„Der Computer nimmt 3 Hölzer und es bleiben noch 10 Hölzer übrig.“ 
Aufgabe 3 
Als nächstes benötigen wir eine Hilfsklasse für das Einlesen der menschlichen Züge von der 
Konsole. Wir nennen diese Klasse Eingabe. Auch hier sind alle Methoden statisch. 
Die Methode leseZahl liest eine Zahl von der Konsole ein und gibt diese als int zurück. Die 
Methode erwartet keine Parameter. 
Zunächst wird die Methode zahlEingeben der Klasse Ausgabe aufgerufen, um den Anwender zur 
Eingabe aufzufordern. Anschließend wird mithilfe der Klasse Scanner oder InputStreamReader 
eine Zeichenkette eingelesen. 
In einem try-catch-Block wird diese Zeichenkette mithilfe der Klasse Integer in einen int 
umgewandelt. Schlägt die Umwandlung fehl, wird der Anwender durch keineZahl informiert. Die 
Eingabe wird so lange wiederholt, bis eine gültige Zahl eingegeben wird.
Die Methode leseHoelzer hat die gleiche Signatur wie leseZahl. Sie ruft leseZahl auf und 
überprüft, ob die Zahl im Bereich von 1 bis 3 liegt. Ist dies nicht der Fall, wird zahlNichtImBereich 
aufgerufen und der Anwender erneut zur Eingabe aufgefordert. 
Aufgabe 4 
Bearbeiten Sie die App-Klasse mit der statischen main-Methode. In dieser Methode wird ein neues 
Objekt der Klasse Spiel erzeugt. Verwenden Sie zunächst beispielsweise 18 Streichhölzer. 
Aufgabe 5 
Das Spiel läuft aktuell noch nicht vollständig, daher muss die Klasse Spiel erweitert werden. 
Im Konstruktor soll nach dem Aufruf von computerZiehen geprüft werden, ob der Computer das 
letzte Holz genommen hat. In diesem Fall gewinnt der menschliche Spieler. 
Analog soll nach menschZiehen überprüft werden, ob der Mensch das letzte Holz genommen hat. 
In diesem Fall gewinnt der Computer. 
Die Methode menschZiehen: 
• 
• 
• 
• 
• 
ruft leseHoelzer auf 
reduziert die Anzahl der Hölzer 
prüft, ob der Zug gültig ist 
gibt den Zug mit menschZug aus 
falls mehr Hölzer gezogen werden als vorhanden sind, wird zugNichtMoeglich aufgerufen 
und der Spieler muss erneut ziehen. 
Die Methode computerZiehen: 
• 
• 
• 
• 
ruft berechneComputerZug auf 
reduziert die Anzahl der Hölzer 
gibt den Zug mit computerZug aus 
die Methode berechneComputerZug soll eine Strategie implementieren, wie viele Hölzer der 
Computer zieht (für erste Tests kann der Computer zufällig 1–3 Hölzer ziehen). 
Aufgabe 6 
Sie haben vielleicht bemerkt, dass Singular und Plural nicht immer korrekt verwendet werden. 
Beheben Sie dies, indem Sie private Methoden wie schreibeHolz, schreibeIst etc. definieren. 
Diese Methoden erwarten einen int und geben einen passenden String zurück (Singular bei 1, 
sonst Plural). 
Ersetzen Sie die festen Texte durch diese Methoden, um eine korrekte Grammatik zu 
gewährleisten. 
Stellen Sie zum Abschluss außerdem sicher, dass berechneComputerZug nun einen Algorithmus 
enthält, der dafür sorgt, dass der Computer immer den bestmöglichen Zug ausführt. Testen Sie 
das Programm intensiv mit verschiedenen Startzuständen.
README zu

<<Automatische Erstellung von Sequentiellen Ausfallbäumen zu temporalen Fehlerbäumen für LaTeX Dokumente>>

2008, Simon J. Schilling, sjschilling@gmx.net

zu Version V1

----------------------------------------------------------------
Allgemeines
----------------------------------------------------------------

Es handelt sich um ein Programm zur (halb)automatischen Erzeugung von TeX / LaTeX Code, der bei entsprechender Einbindung in ein TeX / LaTeX Dokument sequentielle Ausfallbäume liefert.

Sequentielle Ausfallbäume eignen sich zur Visualisierung und Überprüfung temporallogischer Ausdrücke, wie sie im Rahmen des TFTA (Temporale Fehlerbaumanalyse) verwendet werden.

Eine (halb)automatische Erzeugung des entsprechenden Codes ist hilfreich, da die Größe eines sequentiellen Ausfallbaums exponentiell mit der Anzahl der zu berücksichtigenden (Ausfall)Ereignisse steigt.

Die Erzeugung des entsprechenden Codes wird (halb)automatisch genannt, weil der Code manuell in den Gesamtcode eines LaTeX Dokuments eingebunden werden muss.

Das Programm basiert auf der frei verfügbaren Tabellenkalkulation OpenOffice Calc.
Gründe hierfür sind u.a.
* der relativ geringe Aufwand für die Erzeugung des Programms
* die gute Lesbarkeit des Programms (falls jemand es in eine andere Sprache übersetzen will)
* die Ausführbarkeit auf Windows, Linux, Mac Systemen (alle Systeme, auf denen OpenOffice lauffähig ist)

Achtung: Es handelt sich in Version V1 um eine "Quick and Dirty" Lösung. Insbesondere wurde nur eine rudimentäre Benutzerführung implementiert und wenig auf das Abfangen von missbräuchlichen Eingaben eingegangen.

----------------------------------------------------------------
Installation
----------------------------------------------------------------
Voraussetzung ist eine lauffähige Version von OpenOffice ab Version 2.4 (http://www.openoffice.org).

Das Programm selbst wird nicht formell installiert.

Zur Nutzung des erzeugten LaTeX Codes benötigen Sie eine lauffähige LaTeX Umgebung, z.B. MikTeX für Windows (http://www.miktex.org) oder TeXLive für Linux (http://www.tug.org/texlive/).

Die graphische Darstellung basiert auf den LaTeX Paketen 
TikZ und PGF von Till Tantau, die Sie auf 
http://sourceforge.net/projects/pgf
finden. Diese Pakete sind in MikTex und TeXLive verfügbar.

----------------------------------------------------------------
Start
----------------------------------------------------------------
Sie starten das Programm in einem beliebigen Ordner, indem sie die Datei mit Endung "ods" in OpenOffice öffnen.

In der ursprünglichen Version heißt die Datei 
"TFTA_Tool_zur_Erstellung_sequentieller_Ausfallbaume_OpenOffice_V1"

Neben dieser Datei befindet sich auch ein Beispiel im Paket der ursprünglichen Version. Dieses heißt "bsp_4_nur_A.ods".

----------------------------------------------------------------
Nutzung
----------------------------------------------------------------
Starten Sie das Programm und gehen Sie zum Tabellenblatt "1Einstellungen_Deckblatt".

Füllen Sie die Felder entsprechend der Erklärungen in diesem Tabellenblatt aus.

Wechseln Sie bei Schritt 4 mittels des grünen Knopfes auf das Ihren vorangegangenen Angaben entsprechende Tabellenblatt.

Sie sehen dort eine "graphische" Repräsentation Ihres sequentiellen Ausfallbaums.

Füllen Sie die einzelnen Zustände / Knoten entsprechend Ihren Wünschen aus.

Wechseln Sie anschließend mittels des grünen Knopfes zurück zu Tabellenblatt "1Einstellungen_Deckblatt".

Kopieren Sie den LaTeX Code aus dem rot markierten Feld unter Schritt 5 in Ihr LaTeX Dokument.

(Zum Ausprobieren und als Referenz befinden sich im Paket der ursprünglichen Version die Dateien "demo.tex" und "bsp_4_nur_A.tex", an denen Sie sich orientieren können.)

Kompilieren Sie Ihr LaTeX Dokument. Sie sollten nun "Ihren" sequentiellen Ausfallbaum im erzeugten Ausgabedokument sehen.

----------------------------------------------------------------
Kontakt
----------------------------------------------------------------
Kontakt zum Autor per Email: sjschilling@gmx.net
Rückmeldungen, Fehlermeldungen und Verbesserungsvorschläge sind willkommen.

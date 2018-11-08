package leidereinweiterespackage;

public class Klassenhassliebe {
    public static void main(String[] args) {
        String name = ("Nicolas Bochejny"); //"Nicolas Bochejny" wird für die Variable name eingesetzt
        int alter = (20); //20 wird für die Variable alter eingesetzt
        final String FH_KUFSTEIN_TIROL = ("Fachhochschule Kufstein Tirol"); //Gekürzt auf fhKufsteinTirol & in Capslock da es final ist, kann nicht mehr verändert werden sonst wie oben
        final String Ort = ("Rosenheim"); //wie oben
        System.out.println(name + " " + alter + " " + Ort + " " + FH_KUFSTEIN_TIROL); //In der Konsole wird der wert von name, alter, Ort und FH_KUFSTEIN_TIROL ausgegeben
        System.out.println("JavaverwendetfürStrings\"doppelteAnführungszeichen\"undeinzelneAnführungszeichen\n" +
                "wie 'c' um einzelne Zeichen zu definieren"); //Ausgabe des Textes ohne Komplikationen durch das Backslash Zeichen sonst nur fehlerhafte Ausgabe
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\"); //wie oben
        System.out.println("Ich verwende den\\b Backspace, die Newline\\n und den \\tTabulator."); //durch extra backslash wird als normaler fließtext ausgegeben
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \\r überschreibt\n" +
                "diebestehendeZeile.\\fistinderKonsolenichtbemerkbar,daeseinenSeitenumbruch\n" +
                "erzwingt."); // wie oben
    }
}

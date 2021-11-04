//OBERKLASSE
public class Verkaufsobjekt {
    //Deklaration der Klassenvariablen
    int _ps;
    String _typ;
    String _marke;
    int _preis;

    //Constructor
    public Verkaufsobjekt(String marke, String typ, int ps, int preis){
        setMarke(marke);
        setPreis(preis);
        setPs(ps);
        setTyp(typ);
    }

    //Setter
    public void setMarke(String marke) {
        this._marke = marke;
    }
    public void setPreis(int preis) {
        this._preis = preis;
    }
    public void setPs(int ps) {
        this._ps = ps;
    }
    public void setTyp(String typ) {
        this._typ = typ;
    }
    //Getter
    public String getMarke() {
        return _marke;
    }
    public int getPreis() {
        return _preis;
    }
    public int getPs() {
        return _ps;
    }
    public String getTyp() {
        return _typ;
    }
    //Parameter zusätzlich --> dieser wird von den Subklassen durch Punktnotation an den Objekten übergeben
    //Müssen nur einmal ändern, dann gilt das für alle vererbten Klassen --> Man schreibt alles einmal, weniger fehleranfällig
    //printDaten Methode für einen extraData des Datentyps String (siehe z.B. String siebensitze)
    public void printDatenString(String extraData){
        System.out.println("Daten des Verkaufsobjekts: " + this.getMarke() + " " + this.getTyp() + " " + this.getPs() + " " + this.getPreis() + " " + extraData);
    }
    //printDaten Methode für einen extraData des Datentyps Integer (siehe z.B. int maxgeschwindigkeit)
    public void printDatenInt(int extraData){
        System.out.println("Daten des Verkaufsobjekts: " + this.getMarke() + " " + this.getTyp() + " " + this.getPs() + " " + this.getPreis() + " " + extraData);
    }


}

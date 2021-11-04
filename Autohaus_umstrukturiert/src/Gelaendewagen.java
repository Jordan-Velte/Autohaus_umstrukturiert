//Vererbung der Subklasse Gelaendewagen zu Oberklasse Verkaufsobjekt
public class Gelaendewagen extends Verkaufsobjekt{
    //Deklaration der klassenspezfischen Variable der Subklasse
    String _maxkippradius;

    //Constructor
    public Gelaendewagen(String marke, String typ, int ps, int preis, String maxkippradius){
        //Super ruft gemeinsame Variablen der Oberklasse auf --> nun für den Constructor zu nutzen, weniger Programmieraufwand, bzw. Fehleranfälligkeit
        super(marke, typ, ps, preis);
        //Eigener Setter nötig
        setMaxkippradius(maxkippradius);
    }
    //Setter
    public void setMaxkippradius(String maxkippradius) {
        this._maxkippradius = maxkippradius;
    }
    //Getter
    public String getMaxkippradius() {
        return _maxkippradius;
    }

}

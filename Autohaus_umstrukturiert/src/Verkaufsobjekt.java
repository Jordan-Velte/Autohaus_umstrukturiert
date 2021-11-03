public class Verkaufsobjekt {
    int _ps;
    String _typ;
    String _marke;
    int _preis;

    public Verkaufsobjekt(String marke, String typ, int ps, int preis){
        setMarke(marke);
        setPreis(preis);
        setPs(ps);
        setTyp(typ);
    }

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


}

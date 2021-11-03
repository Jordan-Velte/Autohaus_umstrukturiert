public class Sportwagen extends Verkaufsobjekt{
    int _maxgeschwindigkeit;

    public Sportwagen(String marke, String typ, int ps, int preis, int maxgeschwindigkeit){
        super(marke, typ, ps, preis);
        setMaxgeschwindigkeit(maxgeschwindigkeit);
    }

    public void setMaxgeschwindigkeit(int maxgeschwindigkeit) {
        this._maxgeschwindigkeit = maxgeschwindigkeit;
    }
    public int getMaxgeschwindigkeit() {
        return _maxgeschwindigkeit;
    }
}
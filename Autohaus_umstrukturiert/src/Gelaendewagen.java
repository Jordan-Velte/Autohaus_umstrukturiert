public class Gelaendewagen extends Verkaufsobjekt{
    int _maxkippradius;

    public Gelaendewagen(String marke, String typ, int ps, int preis, int maxkippradius){
        super(marke, typ, ps, preis);
        setMaxkippradius(maxkippradius);
    }

    public void setMaxkippradius(int maxkippradius) {
        this._maxkippradius = maxkippradius;
    }
    public int getMaxkippradius() {
        return _maxkippradius;
    }

}

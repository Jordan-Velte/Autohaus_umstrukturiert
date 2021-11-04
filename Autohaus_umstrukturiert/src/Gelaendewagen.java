public class Gelaendewagen extends Verkaufsobjekt{
    String _maxkippradius;

    public Gelaendewagen(String marke, String typ, int ps, int preis, String maxkippradius){
        super(marke, typ, ps, preis);
        setMaxkippradius(maxkippradius);
    }

    public void setMaxkippradius(String maxkippradius) {
        this._maxkippradius = maxkippradius;
    }
    public String getMaxkippradius() {
        return _maxkippradius;
    }

}

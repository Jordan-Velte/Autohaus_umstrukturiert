public class LKW extends Verkaufsobjekt{
    int _maxzuladungtonnen;
    
    public LKW(String marke, String typ, int ps, int preis, int maxzuladungtonnen){
        super(marke, typ, ps, preis);
        setMaxzuladungtonnen(maxzuladungtonnen);
    }

    public void setMaxzuladungtonnen(int maxzuladungtonnen) {
        this._maxzuladungtonnen = maxzuladungtonnen;
    }
    public int getMaxzuladungtonnen() {
        return _maxzuladungtonnen;
    }

}

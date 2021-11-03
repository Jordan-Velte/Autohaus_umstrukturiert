public class Kombi extends Verkaufsobjekt{
    String _siebensitze;
    
    public Kombi (String marke, String typ, int ps, int preis, String siebensitze){
        super(marke, typ, ps, preis);
        setSiebensitze(siebensitze);
    }

    public void setSiebensitze(String siebensitze) {
        this._siebensitze = siebensitze;
    }
    public String getSiebensitze() {
        return _siebensitze;
    }
}

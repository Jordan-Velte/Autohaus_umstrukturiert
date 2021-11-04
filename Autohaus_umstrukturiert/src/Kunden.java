public class Kunden extends Person{
    //DEKLARATION
    String _adresse;
    String _telefon;
    String _mail;
    int _kundennummer;
    
    //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
    public Kunden (String vorname, String nachname) {
        super(vorname, nachname);

    }
    public Kunden (String vorname, String nachname, int kundennummer) {
        super(vorname, nachname);
        setKundennummer(kundennummer);

    }
    public Kunden (String vorname, String nachname, String adresse, String telefon, String mail, int kundennummer) {
        super(vorname, nachname);
        setKundennummer(kundennummer);
        setAdresse(adresse);
        setMail(mail);
        setTelefon(telefon);
    }
    
    //GETTER
    public String getAdresse(){
        return _adresse;
    }
    public String getTelefon(){
        return _telefon;
    }
    public String getMail(){
        return _mail;
    }
    public int getKundennummer() {
        return _kundennummer;
    }

    //SETTER
    public void setAdresse(String adresse){
        _adresse = adresse;
    }
    public void setTelefon(String telefon){
        _telefon = telefon;
    }
    public void setMail(String mail){
        _mail = mail;
    }
    public void setKundennummer(int kundennummer) {
        this._kundennummer = kundennummer;
    }
}
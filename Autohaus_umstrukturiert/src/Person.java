//OBERKLASSE
public class Person {
    String _vorname;
    String _nachname;

    public Person(String vorname, String nachname){
        setNachname(nachname);
        setVorname(vorname);
    }

    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getVorname() {
        return _vorname;
    }

    public void printDatenString(String extraData){
        System.out.println("Daten der Person: " + this.getVorname() + " " + this.getNachname() + " " + extraData);
    }
    public void printDatenInt(int extraData){
        System.out.println("Daten der Person: " + this.getVorname() + " " + this.getNachname() + " " + extraData);
    }

}

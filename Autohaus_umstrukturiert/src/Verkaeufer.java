public class Verkaeufer extends Person{
    //DEKLARATION
    int _personalnummer;

    //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
    public Verkaeufer (String vorname, String nachname){
        super(vorname, nachname);
    }
    public Verkaeufer (String vorname, String nachname, int personalnummer){
        super(vorname, nachname);
        setPersonalnummer(personalnummer);
    }

    //GETTER
    public int getPersonalnummer(){
        return _personalnummer;
    }

    //SETTER
    public void setPersonalnummer(int personalnummer){
        _personalnummer = personalnummer;
    }
}
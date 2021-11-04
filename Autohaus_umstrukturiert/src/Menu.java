//import, dadurch können wir den Datentyp Scanner nutzen --> kein elementarer Datentyp
import java.util.Scanner;

//Eigene Klassse, Prämisse 1) static loswerden, 2) Ändern leichter
public class Menu {
    //DEKLARATION Scanner
    Scanner _scanner;
    //DEKLARATION VARIABLEN FÜR AUTO - Unklar ob nötig
    Scanner _marke;
    Scanner _preis;
    Scanner _modell;
    
    Scanner _baujahr;

    //CONSTRUCTOR: Man brauch nur einen Scanner (siehe Arbeitsblatt vom 10.9.2021)
    public Menu(){
        this.setScanner(new Scanner(System.in));
    }

    
    //SETTER für Scanner
    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
    //GETTER für Scanner
    public Scanner getScanner() {
        return _scanner;
    }
    /*
    //Menu-Methode
    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Verkaufsobjekt");
        System.out.println("(4) Neuer Verkäufer");
        System.out.println("(5) Zeige alle Autos");
        System.out.println("(6) Zeige alle Kunden");
        System.out.println("(7) Zeige alle Verkäufer");
        System.out.println("(8) Zeige alle Verkäufe");
        //Methodenvariable = choice. Eingabe wird zwischengespeichert in Variable Choice
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);

        //IF-Bedingung nach TRUE und FALSE (siehe Foto) 
        if(choice.equals("1")){
            createVerkaufMenu();
        }
        //immer bei Bedingungen: WERT OPERATOR VERGLEICHSWERT
        else if(choice.equals("2")){
            createKundeMenu();
        }
        else if(choice.equals("3")){
            createAutoMenu();
        }
        else if(choice.equals("4")){
            createVerkaeuferMenu();
        }
        else if(choice.equals("5")){
            showAutos();
        }
        else if(choice.equals("6")){
            showKunden();
        }
        else if(choice.equals("7")){
            showVerkaeufer();
        }
        else if(choice.equals("8")){
            showVerkaeufe();
        }
        else{
            System.out.println("Bitte nur 1,2,3,4,5,6,7,8 eingeben!");
        }
        startMenu();
    }
    */

    /*
    //CONSTRUCTOR für Autos
    public Autos() {
        this.setMarke(new Scanner(System.in));
        this.setPreis(new Scanner(System.in));
        this.setModell(new Scanner(System.in));
        this.setBaujahr(new Scanner(System.in));
    }*/
    //Man brauch keine SETTER Und GETTER im Menu
    /*
    //GETTER für Autos
    public Scanner getMarke(){
        return _marke;
    }
    public Scanner getPreis(){
        return _preis;
    }
    public Scanner getModell(){
        return _modell;
    }
    public Scanner getBaujahr(){
        return _baujahr;
    }
    //SETTER für Autos
    public void setMarke(Scanner marke){
        _marke = marke;
    }    
    public void setPreis(Scanner preis){
        _preis = preis;
    }    
    public void setModell(Scanner modell){
        _modell = modell;
    }    
    public void setBaujahr(Scanner baujahr){
        _baujahr = baujahr;
    } 
    */
    //Methodensignatur: Dienstleistungsmethode
    //Public: Klassenübergreifend
    //Void: Dienstleistungsmethode, Datentyp: Rückgabemethode
    //In der Klammer stehen Parameter die Methode übergeben werden
    /*
    public void showVerkaufsobjekt(){
        //For-Each Schleife
        for (Verkaufsobjekt verkaufsobjekt : App.vo){
            if(autos != null){
                System.out.println(autos.getMarke() + " " + autos.getBaujahr());
            }
        }
    }*/

    /*
    public void showAutos(){
        //For-Each Schleife
        for (Autos autos : App.getALLAutos()){
            if(autos != null){
                System.out.println(autos.getMarke() + " " + autos.getBaujahr());
            }
        }
    }
    
    public void showKunden(){
        for (Kunden kunden : App.getALLKunden()){
            if(kunden != null){
                System.out.println(kunden.getVorname() + " " + kunden.getNachname());
            }
        }
    }
    public void showVerkaeufer(){
        // get.ALLVerkaeufer Erstes Element wird in der Variable verkaeufer zwischengespeichert, steht im Rumpf zur Verfügung, passiert für jedes Element bis das Array durchlaufen wurde --> Verweise!!!
        //Jedes Element wird in For-Each Schleife durchlaufen (läuft so oft durch wie viele Elemente in Array)
        for (Verkaeufer verkaeufer : App.getALLVerkaeufer()){
            if(verkaeufer != null){
                System.out.println(verkaeufer.getVorname() + " " + verkaeufer.getNachname());
            }
        }
    }
    */

    //Über Punktnotation Getter der Klasse aufrufen
    /*
    public void showVerkaeufe(){
        int gesamtpreis = 0;
        for (Verkauf verkauf : App.getALLVerkauf()){
            if (verkauf != null){
                System.out.println("Auto: " + verkauf.getAuto().getMarke() + " " + verkauf.getAuto().getModell() + " Kunde: " + verkauf.getKunde().getVorname() + " " + verkauf.getKunde().getNachname() +" Verkäufer: " + verkauf.getVerkaeufer().getVorname() + " " + verkauf.getVerkaeufer().getNachname() + " Preis: " + verkauf.getPreis());
                //siehe Null --> If-Abfrage
                gesamtpreis = gesamtpreis + verkauf.getPreis();
            }
        }
        System.out.println("Der Gesamtpreis beträgt: " + gesamtpreis);
    }
    */

    /*
    //createAutos-Methode, Work in Progress --> deshalb Kommentar tbd
    public void createAutoMenu(){
        //System.out.print --> Cursor ist genau am Ende des Strings für die Eingabe im Terminal
        System.out.println("Auto erstellen.");
        System.out.print("Geben Sie die Marke ein:");
        String choicemarke = getScanner().nextLine();
        System.out.print("Geben Sie das Modell ein:");
        String choicemodell = getScanner().nextLine();
        System.out.print("Geben Sie das Baujahr ein:");
        String choicebaujahr = getScanner().nextLine();
        /*System.out.print("Geben Sie den Preis ein:");
        String choicepreis = getScanner().nextLine();
        System.out.print("Geben Sie das Baujahr ein:");
        String choicebaujahr = getScanner().nextLine();*/
        /*
        System.out.println("Es wurde ein neues Auto eingetragen.");
        //Variablen zu einem Auto zusammensetzen, Objekt wird erzeugt, welches direkt in einen Array gesetzt wird.
        App.addAuto(new Autos(choicemarke, choicemodell, choicebaujahr));
        System.out.println(App.getALLAutos());
        //System.out.println("Marke: " + choicemarke);
        //System.out.println("Preis: " + choicepreis);
        //System.out.println("Modell: " + choicemodell);
        //System.out.println("Baujahr: " + choicebaujahr);
        //Objekt Auto a1 wird erstellt (siehe Constructor der Klasse Autos)
        //Autos a1 = new Autos(choicemarke, choicemodell);
        //startMenu();
    }
    */
    /*
    //Kunden-Menu-Methode
    public void createKundeMenu(){
        System.out.println("Vorname:");
        String choicevorname = getScanner().nextLine();
        System.out.println("Nachname");
        String choicenachname = getScanner().nextLine();
        System.out.println("Es wurde ein neuer Kunde eingetragen.");
        App.addKunde(new Kunden(choicevorname, choicenachname));
        System.out.println(App.getALLKunden());
         System.out.println("Vorname: " + choicevorname);
        System.out.println("Nachname: " + choicenachname);
        //Kunden k1 = new Kunden(choicevorname, choicenachname);
        //System.out.println();
    }
    */
    /*
    //Verkaeufer-Menu-Methode
    public void createVerkaeuferMenu(){
        System.out.println("Vorname:");
        String choicevorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String choicenachname = getScanner().nextLine();
        System.out.println("Personalnummer: ");
        String choicepersonalnummer = getScanner().nextLine();
        Integer persnr = Integer.valueOf(choicepersonalnummer);
        System.out.println("Es wurde ein neuer Verkaeufer eingetragen.");
        App.addVerkaeufer(new Verkaeufer(choicevorname, choicenachname));
        System.out.println(App.getALLKunden());
        
        //System.out.println("Vorname: " + choicevorname);
        //System.out.println("Vorname: " + choicenachname);
        //Verkaeufer v1 = new Verkaeufer(choicevorname, choicenachname);
    }*/

    /*
    //Verkauf-Menu-Methode
    public void createVerkaufMenu(){
        //Auswahl des Preises
        System.out.println("Bitte wähle Preis aus: ");
        // Eingabe des Strings
        String price_choice = getScanner().next();
        //String in Integer umwandeln
        int price = Integer.valueOf(price_choice);

 
        
        //AUTOs
        //Index für Auswahl des richtigen Autos
        int i = 0;
        System.out.println("Bitte wähle Auto aus: ");
        // Zuerst null, dann um einen erhöht
        for(Autos autos : App.getALLAutos()){
            if(autos != null){
                System.out.println(i + " - " + autos.getMarke() + " " + autos.getModell());
                i++;
            }
        }
        // Eingabe des Strings
        String car_choice = getScanner().next();
        //String in Integer umwandeln
        int car_index = Integer.valueOf(car_choice);
        //Ausgabe des Arrays mit den Autos! Eckige Klammern wählen das richtige Element des Arrays!
        System.out.println(App.getALLAutos() [car_index]);
       
        i = 0;
        //Auswahl des Kundens
        System.out.println("Bitte wähle Kunde aus: ");
        for(Kunden kunden : App.getALLKunden()){
            if(kunden != null){
                System.out.println(i + " - " + kunden.getVorname() + " " + kunden.getNachname());
                i++;
            }
        }
        String client_choice = getScanner().next();
        int client_index = Integer.valueOf(client_choice);
        System.out.println(App.getALLKunden()[client_index]);
        
        i=0;
        //Auswahl des Verkäufers
        System.out.println("Bitte wähle Verkäufer aus: ");
        for(Verkaeufer verkaeufer : App.getALLVerkaeufer()){
            if(verkaeufer != null){
                System.out.println(i + " - " + verkaeufer.getVorname() + " " + verkaeufer.getNachname() + " " + verkaeufer.getPersonalnummer());
                i++;
            }
        }
        String vendor_choice = getScanner().next();
        int vendor_index = Integer.valueOf(vendor_choice);
        System.out.println(App.getALLVerkaeufer()[vendor_index]);


        //Hinzufügen in Array (Price neu)
        App.addVerkauf(new Verkauf(App.getALLAutos()[car_index], App.getALLVerkaeufer()[vendor_index], App.getALLKunden()[client_index], price));
    }
    */


        
        /*//Ausgabe des Verkaufs
        System.out.println("Auto: " + App.getALLAutos() [car_index]+ "Kunde: " + App.getALLKunden() [client_index]+ "Verkäufer: " + App.getALLVerkaeufer() [vendor_index] + "Preis: " + price);*/
        //FALSCH
        /* System.out.println("Auto:");
        String choiceautostring = getScanner().nextLine();
        int choiceauto = Integer.valueOf(choiceautostring);
        System.out.println("Kunde: ");
        String choicekundestring = getScanner().nextLine();
        int choicekunde = Integer.valueOf(choicekundestring);
        System.out.println("Verkaeufer: ");
        String choiceverkaeuferstring = getScanner().nextLine();
        int choiceverkaeufer = Integer.valueOf(choiceverkaeuferstring); */




    /*
    public Auto(){
        this.setMarke(new Scanner(System.in));
        this.setPreis(new Scanner(System.in));
        this.setModell(new Scanner(System.in));
        this.setBaujahr(new Scanner(System.in));
    }
    public void Auto(){
        String marke = getMarke().nextLine();
        int preis = getPreis().nextLine();
        String modell = getModell().nextLine();
        int baujahr = getBaujahr().nextLine();
        System.out.println("Die Marke ist: ");
    }
    //GETTER
    public String getMarke(){
        return _marke;
    }
    public int getPreis(){
        return _preis;
    }
    public String getModell(){
        return _modell;
    }
    public int getBaujahr(){
        return _baujahr;
    }
    //SETTER
    public void setMarke(String _marke) {
        this._marke = _marke;
    }
    public void setBaujahr(int _baujahr) {
        this._baujahr = _baujahr;
    }
    public void setModell(String _modell) {
        this._modell = _modell;
    }
    public void setPreis(int _preis) {
        this._preis = _preis;
    } */
    
}
